package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.project.model.Admin;
import com.example.project.service.MyService2;

@Controller
public class HomeController2 {
 @Autowired MyService2 myser2;
	
	

	@RequestMapping("/alog")
	public String logincheck(@RequestParam("mobile")String mb,@RequestParam("pass")String ps,ModelMap m)
	{
		System.out.println("Mobile"+mb);
		System.out.println("Password"+ps);
		Admin mns=myser2.logincheck(mb,ps);
		
		Iterable<Admin>list=myser2.displayAll();
		System.out.println(list);
		
		if(mb.equals("9325707843") && ps.equals("Pass@123"))
		{
			m.addAttribute("nj", list);
			m.addAttribute("msg", "Sucessfully Login Done");
			return "Admin_Data" ;
		}
		else
		{
			return "Admin_Login" ;
		}
			
	}
	
	
	
	
	
	
	
}
