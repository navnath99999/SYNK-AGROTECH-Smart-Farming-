package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.project.model.Supplier;
import com.example.project.service.MyService1;

@Controller
public class HomeController1 {
@Autowired MyService1 myser1;	
	
	

	@RequestMapping("/sup")
	public String supply(@ModelAttribute Supplier sr)
	{
		myser1.supply(sr);
		return "Login_Suppliers" ;
	}
	
	@RequestMapping("/slog")
	public String logincheck(@RequestParam("mobile")String mb,@RequestParam("pass")String ps,ModelMap m)
	{
		System.out.println("Mobile"+mb);
		Supplier mns=myser1.logincheck(mb,ps);
		
		Iterable<Supplier>list=myser1.displayAll();
		System.out.println(list);
		
		if(mns!=null)
		{
			m.addAttribute("nj", list);
			m.addAttribute("msg", "Sucessfully Login Done");
			return "Products" ;
		}
		else
		{
			return "login" ;
		}
			
	}
	
	
	
	
	// delete update operations
	
	@RequestMapping("/delete1")
    public String  deleteData(@ModelAttribute Supplier sr,ModelMap m)
	{
		myser1.deleteData(sr);
    		Iterable<Supplier>list = myser1.displayAll();
  	        System.out.println(list);
  	      m.addAttribute("data", list);
		return "Admin_Info1";
		
	}
    	@RequestMapping("/edit1")
    	public String editData(@RequestParam("mobile")String mbl,ModelMap m)
    	{
    		Supplier s=myser1.editData(mbl);
    		
  	        m.addAttribute("data", s);
			return "edit1";
    		
    	}
    	@RequestMapping("/update1")
    	 public String  updateData(@ModelAttribute Supplier sr,ModelMap m)
    		{
    		           myser1.supply(sr);
    	    		Iterable<Supplier>list =myser1.displayAll();
    	  	       
    	  	      m.addAttribute("data", list);
    			return "Admin_Info1";
    		}
}