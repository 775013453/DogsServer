/**
 * author：欧阳建龙
 * edit:增加公共方法
 * Copyright (c) 2017-2017 ouyang. All rights reserved
 *
 *
 */

//定义全局变量
$Common=$(this);
//默认自动加载
$(function(){
  $Common.loadEasy();
});

(function($){
 
  $.fn.extend({         
    loadResource:function (file, filetype){  //按需加载资源（js,css）文件
      if (filetype=="js")
        {
        var fileref=document.createElement('script');//创建标签
        fileref.setAttribute("type","text/javascript");//定义属性type的值为text/javascript
        fileref.setAttribute("src", file);//文件的地址
        }
      else if (filetype=="css")
      { 
        var fileref=document.createElement("link");
        fileref.setAttribute("rel", "stylesheet");
        fileref.setAttribute("type", "text/css") ;
        fileref.setAttribute("href", file);
      }
      if (typeof fileref!="undefined")
      {
        document.getElementsByTagName("head")[0].appendChild(fileref);
      }
    },
    loadEasy:function (url){  //加载所有需要的easyUI资源文件
      if(url!=null){
        $(this).loadResource($(this).basePath()+url+"/easyui/themes/default/easyui.css", "css"); //打开页面时浏览器动态的加载css 文件
        $(this).loadResource($(this).basePath()+url+"/easyui/themes/icon.css", "css"); //打开页面时浏览器动态的加载css 文件
        $(this).loadResource($(this).basePath()+url+"/easyui/jquery.easyui.min.js", "js"); //打开页面时浏览器动态的加载js文件  
      }else{
        $(this).loadResource($(this).basePath()+"/easyui/themes/default/easyui.css", "css"); //打开页面时浏览器动态的加载css 文件
        $(this).loadResource($(this).basePath()+"/easyui/themes/icon.css", "css"); //打开页面时浏览器动态的加载css 文件
        $(this).loadResource($(this).basePath()+"/easyui/jquery.easyui.min.js", "js"); //打开页面时浏览器动态的加载js文件
      }
    },
    basePath:function (){  //获取项目根目录方法
        var pathName = window.location.pathname.substring(1);
        var webName = pathName == '' ? '' : pathName.substring(0, pathName.indexOf('/'));
        if (webName == "") {
            return window.location.protocol + '//' + window.location.host;
        }
        else {
            return window.location.protocol + '//' + window.location.host + '/' + webName;
        }
    },
    uuid:function () { //UUID生成
      function S4() {
        return (((1+Math.random())*0x10000)|0).toString(16).substring(1);
      }
      return (S4()+S4()+"-"+S4()+"-"+S4()+"-"+S4()+"-"+S4()+S4()+S4());
    },
    cutstr:function (str,len) {  //字符串超出省略 
        var restr = str;  
        var wlength = str.replace(/[^\x00-\xff]/g, "**").length;  
        if (wlength > len) {  
            for (var k = len / 2; k < str.length; k++) {  
                if (str.substr(0, k).replace(/[^\x00-\xff]/g, "**").length >= len) {  
                    restr = str.substr(0, k) + "...";  
                    break;  
                }  
            }  
        }  
        return restr;  
    },
    dateFormat:function (format, date) {   //格式化日期 DateFormat('yyyy_MM_dd hh:mm:ss:SS 星期w 第q季度')   
        if (!date) {  
            date = new Date();  
        }  
        var Week = ['日', '一', '二', '三', '四', '五', '六'];  
        var o = {  
            "y+": date.getYear(), //year  
            "M+": date.getMonth() + 1, //month   
            "d+": date.getDate(), //day   
            "h+": date.getHours(), //hour   
            "H+": date.getHours(), //hour  
            "m+": date.getMinutes(), //minute   
            "s+": date.getSeconds(), //second   
            "q+": Math.floor((date.getMonth() + 3) / 3), //quarter   
            "S": date.getMilliseconds(), //millisecond   
            "w": Week[date.getDay()]  
        }  
        if (/(y+)/.test(format)) {  
            format = format.replace(RegExp.$1, (date.getFullYear() + "").substr(4 - RegExp.$1.length));  
        }  
        for (var k in o) {  
            if (new RegExp("(" + k + ")").test(format)) {  
                format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));  
            }  
        }  
        return format;  
    },
    setCookie:function (name, value, Hours) {  //设置cookie值 
        var d = new Date();  
        var offset = 8;  
        var utc = d.getTime() + (d.getTimezoneOffset() * 60000);  
        var nd = utc + (3600000 * offset);  
        var exp = new Date(nd);  
        exp.setTime(exp.getTime() + Hours * 60 * 60 * 1000);  
        document.cookie = name + "=" + escape(value) + ";path=/;expires=" + exp.toGMTString() + ";"  
    },
    getCookie:function (name) {  //获取cookie值
      var arr = document.cookie.match(new RegExp("(^| )" + name + "=([^;]*)(;|$)"));  
      if (arr != null) return unescape(arr[2]);  
      return null  
    }, 
    addFavorite:function (sURL, sTitle) {  //加入收藏夹  
        try {  
            window.external.addFavorite(sURL, sTitle)  
        } catch (e) {  
            try {  
                window.sidebar.addPanel(sTitle, sURL, "")  
            } catch (e) {  
                alert("加入收藏失败，请使用Ctrl+D进行添加")  
            }  
        }  
    },
    isMobileUserAgent:function () {      //判断是否移动设备访问 
      return (/iphone|ipod|android.*mobile|windows.*phone|blackberry.*mobile/i.test(window.navigator.userAgent.toLowerCase()));  
    },
    isURL:function (strUrl) {  //完美判断是否为网址 
      var regular = /^\b(((https?|ftp):\/\/)?[-a-z0-9]+(\.[-a-z0-9]+)*\.(?:com|edu|gov|int|mil|net|org|biz|info|name|museum|asia|coop|aero|[a-z][a-z]|((25[0-5])|(2[0-4]\d)|(1\d\d)|([1-9]\d)|\d))\b(\/[-a-z0-9_:\@&?=+,.!\/~%\$]*)?)$/i  
      if (regular.test(strUrl)) {  
          return true;  
      } else {  
          return false;  
      }  
    }, 
    uniqueId:function () {  //随机数时间戳 
      var a = Math.random, b = parseInt;  
      return Number(new Date()).toString() + b(10 * a()) + b(10 * a()) + b(10 * a());  
    }, 
    getScrollXY:function () {  //获取网页被卷去的位置 
      return document.body.scrollTop ? {  
          x: document.body.scrollLeft,  
          y: document.body.scrollTop  
      } : {  
          x: document.documentElement.scrollLeft,  
          y: document.documentElement.scrollTop  
      }  
    },  
    isTellphone:function (str) {  //匹配国内电话号码(0511-4405222 或 021-87888822)   
      var result = str.match(/\d{3}-\d{8}|\d{4}-\d{7}/);  
      if (result == null) return false;  
      return true;  
    },
    isMobile:function (str) {    //移动电话   
        if (!(/^1[3|5|8][0-9]\d{4,8}$/.test(str))) {  
            return false;  
        }  
        return true;  
    }, 
    isIdcard:function (str) {     //匹配身份证(15位或18位)   
      var result = str.match(/\d{15}|\d{18}/);  
      if (result == null) return false;  
      return true;  
    },
    isalPhaNumber:function (str) {  // 判断输入是否是一个由 0-9 / A-Z / a-z 组成的字符串   
      var result = str.match(/^[a-zA-Z0-9]+$/);  
      if (result == null) return false;  
      return true;  
    },
    isEmail:function (str) {      // 判断输入是否是有效的电子邮件 
      var result = str.match(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/);  
      if (result == null) return false;  
      return true;  
    },
    numberFrmat:function (number, decimals, dec_point, thousands_sep) {       //格式化数字  
      /* 
      * 参数说明： 
      * number：要格式化的数字 
      * decimals：保留几位小数 
      * dec_point：小数点符号 
      * thousands_sep：千分位符号 
      * */  
      number = (number + '').replace(/[^0-9+-Ee.]/g, '');  
      var n = !isFinite(+number) ? 0 : +number,  
          prec = !isFinite(+decimals) ? 0 : Math.abs(decimals),  
          sep = (typeof thousands_sep === 'undefined') ? ',' : thousands_sep,  
          dec = (typeof dec_point === 'undefined') ? '.' : dec_point,  
          s = '',  
          toFixedFix = function (n, prec) {  
              var k = Math.pow(10, prec);  
              return '' + Math.ceil(n * k) / k;  
          };  

      s = (prec ? toFixedFix(n, prec) : '' + Math.round(n)).split('.');  
      var re = /(-?\d+)(\d{3})/;  
      while (re.test(s[0])) {  
          s[0] = s[0].replace(re, "$1" + sep + "$2");  
      }  

      if ((s[1] || '').length < prec) {  
          s[1] = s[1] || '';  
          s[1] += new Array(prec - s[1].length + 1).join('0');  
      }  
      return s.join(dec);  
    }    
  }); 
})(jQuery);//立即执行函数，防止$被其他插件污染