package com.guoyuan.springboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.guoyuan.springboot.bean.Message;
import com.guoyuan.springboot.entities.User;
import com.guoyuan.springboot.service.UserClientService;
import com.guoyuan.springboot.service.UserService;

@Controller
public class ConsumerController {
	
	@Autowired
	private UserService localUserService;
	@Autowired
	private UserClientService clientservice;
	@Autowired  
	HttpServletRequest request; 
	
	@RequestMapping(value = "/consumer/vi")
	@ResponseBody
	public String consumer(){
		System.out.println("hello consumer working");
		return this.clientservice.getRepsonse();
	}
	@RequestMapping(value = "/userLogin")
	public String userLogin(){
		
		return "login";
	}
	@RequestMapping(value = "/login",method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView userLogin(@ModelAttribute @RequestParam User user){
		System.out.println("页面跳转");
		System.out.println(user);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		Message mess=new Message();
		if(user==null){
			mess.setInfo("请输入个人信息!");
			mv.addObject("userInfo",null);
			return mv;
		}
		User userInfo = localUserService.login(user.getUserName());
		if(userInfo==null){
			mess.setInfo("用户不存在!");
			mv.addObject("mess",mess);
			mv.addObject("userInfo",user);
			return mv;
		}else{
			mess.setInfo("登录成功!");
			mv.addObject("mess",mess);
			mv.addObject("userInfo",userInfo);
			 return mv;
		}
		
		 
	    
	}
	
	@RequestMapping(value = "/jsp")
	public String jspDemo(){
		request.getSession().setAttribute("user", "guoyuan");
		System.out.println("hello "+request.getSession().getAttribute("user"));
		return "hello";
	}
	
	
	
}
