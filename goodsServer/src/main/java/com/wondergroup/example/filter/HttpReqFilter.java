package com.wondergroup.example.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wondergroup.example.util.JacksonUtil;

/**
 * 使用注解标注过滤器
 * @WebFilter将一个实现了javax.servlet.Filter接口的类定义为过滤器
 * 属性filterName声明过滤器的名称,可选
 * 属性urlPatterns指定要过滤 的URL模式,也可使用属性value来声明.(指定要过滤的URL模式是必选属性)
 */
@WebFilter(filterName="HttpReqFilter",urlPatterns="/*.action")
public class HttpReqFilter implements Filter {

	private static final Logger logger=LoggerFactory.getLogger(HttpReqFilter.class); 
	
    public void init(FilterConfig fConfig) throws ServletException {
        logger.info("过滤器初始化");
    }

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
    	
    	HttpServletRequest httpRequest = (HttpServletRequest)request; 
    	HttpServletResponse httpResponse = (HttpServletResponse)response;
        logger.info("执行过滤操作");
        Cookie cookie=new Cookie("name", "ouyang");
        httpResponse.addCookie(cookie);
        logger.info(JacksonUtil.toJson(httpRequest.getCookies()));       
        String path = httpRequest.getContextPath();
        String basePath = httpRequest.getScheme()+"://"+httpRequest.getServerName()+":"+httpRequest.getServerPort()+path;         
        if(!"ouyang".equals(httpRequest.getParameter("name"))){       	
        	 httpResponse.setHeader("Cache-Control", "no-store");  
             httpResponse.setDateHeader("Expires", 0);  
             httpResponse.setHeader("Prama", "no-cache");  
             httpResponse.sendRedirect(basePath+"/login/auth.action");
        }
        chain.doFilter(httpRequest, httpResponse);
    }
    
    public void destroy() {
        logger.info("过滤器销毁");
    }
}