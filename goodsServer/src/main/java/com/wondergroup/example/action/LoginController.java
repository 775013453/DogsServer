package com.wondergroup.example.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/login")
public class LoginController { 
	
   /** 
    * GET /create  --> Create a new user and save it in the database. 
    */ 
	@RequestMapping("/auth")  
	public String redirect(Model model,HttpServletRequest httpRequest) { 
		 String path = httpRequest.getContextPath();
	     String basePath = httpRequest.getScheme()+"://"+httpRequest.getServerName()+":"+httpRequest.getServerPort()+path;  
	     model.addAttribute("base", basePath);
		return "/index/login"; 
	} 
	
	@RequestMapping("/downOrUp")  
	public String downOrUp(Model model,HttpServletRequest httpRequest) { 
		 String path = httpRequest.getContextPath();
	     String basePath = httpRequest.getScheme()+"://"+httpRequest.getServerName()+":"+httpRequest.getServerPort()+path;  
	     model.addAttribute("base", basePath);
		return "/downOrUp/index"; 
	}  

} 
