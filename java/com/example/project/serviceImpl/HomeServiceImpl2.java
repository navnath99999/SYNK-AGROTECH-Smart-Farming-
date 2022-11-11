package com.example.project.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Repository.MyRepository2;
import com.example.project.model.Admin;
import com.example.project.service.MyService2;

@Service
public class HomeServiceImpl2 implements MyService2 {
   @Autowired MyRepository2 myrepo2;
	@Override
	public void Adm(Admin am) {
		myrepo2.save(am);
		
	}
	@Override
	public Admin logincheck(String mb, String ps) {
		// TODO Auto-generated method stub
		return myrepo2.findByMobileAndPass(mb, ps);
	}
	@Override
	public Iterable<Admin> displayAll() {
		// TODO Auto-generated method stub
		return myrepo2.findAll();
	}
	
	
	

}
