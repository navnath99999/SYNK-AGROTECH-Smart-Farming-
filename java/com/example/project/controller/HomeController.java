package com.example.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.project.model.Apple;
import com.example.project.model.Customer;
import com.example.project.service.MyService;

@Controller
public class HomeController {
 @Autowired MyService myser;
	@RequestMapping("/")
	public String Log()
	{
		return "Welcome" ;
	}
	
	
	

	@RequestMapping("/Reg")
	public String Register(@ModelAttribute Customer cr)
	{
		myser.Register(cr);
		return "login" ;
	}
	
	@RequestMapping("/log")
	public String logincheck(@RequestParam("mobile")String mb,@RequestParam("pass")String ps,ModelMap m)
	{
		System.out.println("Mobile"+mb);
		Customer mns=myser.logincheck(mb,ps);
		
		Iterable<Customer>list=myser.displayAll();
		System.out.println(list);
		
		if(mns!=null)
		{
			m.addAttribute("data", list);
			m.addAttribute("msg", "Sucessfully Login Done");
			return "Products" ;
		}
		else
		{
			return "login" ;
		}
			
	}
	
	
	
	
	@RequestMapping("/delete")
    public String  deleteData(@ModelAttribute Customer cr,ModelMap m)
	{
		myser.deleteData(cr);
    		Iterable<Customer>list =myser.displayAll();
  	        System.out.println(list);
  	      m.addAttribute("data", list);
		return "Admin_Info";
		
	}
    	@RequestMapping("/edit")
    	public String editData(@RequestParam("mobile")String mbl,ModelMap m)
    	{
    		Customer s=myser.editData(mbl);
    		
  	        m.addAttribute("data", s);
			return "edit";
    		
    	}
    	@RequestMapping("/update")
    	 public String  updateData(@ModelAttribute Customer cr,ModelMap m)
    		{
    		           myser.Register(cr);
    	    		Iterable<Customer>list =myser.displayAll();
    	  	       
    	  	      m.addAttribute("data", list);
    			return "Admin_Info";
    		}
    	
    	
    	
    	
    	
    	
  
    	
    	
    	
    	
    	
    	
    	
    	
}