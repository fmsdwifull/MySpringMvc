package com.yang.springmvc.controller;

import java.util.Date;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yangliu.springmvc.entity.User;

@Controller
@RequestMapping("/springmvc")
public class HelloWorld {
	private static final String SUCCESS="success";
	
	@RequestMapping("testModelAndView")
    public ModelAndView testModelAndView()
    {
    	ModelAndView mv = new ModelAndView("success");
    	mv.addObject("date", new Date());
    	return mv;
    }
	
	@RequestMapping("/testPojo")
	public String testPojo(User user)
	{
		System.out.println("user:"+user);
		return SUCCESS;
	}
	
	@RequestMapping("/testRequestPara")
	public String testRequestPara(@RequestParam("username") String username,@RequestParam("age") int age)
	{
		System.out.println("testRequestPara:"+username+"  age:"+age);
		return SUCCESS;
	}
	
	@RequestMapping("/testPathVariable/{id}")
	public String testPathVariable(@PathVariable(value="id") Integer id)
	{
		System.out.println("testPathVariable:"+id);
		return SUCCESS;
	}
	
	@RequestMapping("/helloworld")
	public String hello()
	{
		System.out.println("hello world");
		return SUCCESS;
	}
}
