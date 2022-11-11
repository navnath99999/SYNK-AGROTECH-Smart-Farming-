package com.example.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController3 {
		@RequestMapping("/new")
	    public String home(HttpServletRequest req) {
	        HttpSession session=req.getSession();
	        String name=req.getParameter("fname");
	        //Fetch data comming from client
	        System.out.println("hi "+name);
	        session.setAttribute(name, name);
	        return "home";
	    }
}
