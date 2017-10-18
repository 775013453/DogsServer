package com.wondergroup.example.upOrDown;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller 
@RequestMapping("/upOrDown")
public class upOrDown {

	@RequestMapping(value="/upload", method= RequestMethod.POST)  
    @ResponseBody  
    public String fileUpload(HttpServletRequest request){  
        List<MultipartFile> files = ((MultipartHttpServletRequest)request).getFiles("file");  
        MultipartFile file = null;  
        @SuppressWarnings("unused")
		BufferedOutputStream stream = null;  
        for (int i =0; i< files.size(); ++i) {  
            file = files.get(i);  
            if (!file.isEmpty()) {  
                try {  
                   BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("e:\\" + file.getOriginalFilename())));  
                   bufferedOutputStream.write(file.getBytes());  
                   bufferedOutputStream.flush();  
                   bufferedOutputStream.close();  
                } catch (Exception e) {  
                    return "You failed to upload " + i + " => " + e.getMessage();  
                }  
            } else {  
                return "You failed to upload " + i + " because the file was empty.";  
            }  
        }  
        return "上传成功";  
    }  
	    
    @RequestMapping(value = "/download")  
    @ResponseBody  
        public String download(HttpServletResponse response) throws Exception {  
            BufferedInputStream bis = null;  
            BufferedOutputStream bos = null;  
            //获取下载文件路径  
            String downLoadPath = "C:\\Users\\Ouyang\\Desktop\\download\\active.zip";  
  
            /*response.setHeader("content-type", "application/octet-stream");  
  
            //获取文件的长度  
            long fileLength = new File(downLoadPath).length();  
            //设置文件输出类型  
            response.setContentType("application/octet-stream");  
            //设置输出长度  
            response.setHeader("Content-Length", String.valueOf(fileLength));*/  
        /********************************************************************/  
            //获取输入流  
            bis = new BufferedInputStream(new FileInputStream(downLoadPath));  
            //输出流  
            bos = new BufferedOutputStream(new FileOutputStream(new File("e:\\active.zip")));  
            byte[] buff = new byte[2048];  
            int bytesRead;  
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {  
                bos.write(buff, 0, bytesRead);  
            }  
            //关闭流  
            bis.close();  
            bos.close();  
  
        return "下载成功";  
    }  
}
