package com.example.project.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Repository.MyRepository1;
import com.example.project.model.Customer;
import com.example.project.model.Supplier;
import com.example.project.service.MyService1;

@Service
public class HomeServiceImpl1 implements MyService1 {
   @Autowired MyRepository1 myrepo1;
	@Override
	public void supply(Supplier sr) {
		myrepo1.save(sr);
		
	}
	@Override
	public Supplier logincheck(String mb, String ps) {
		// TODO Auto-generated method stub
		return myrepo1.findByMobileAndPass(mb, ps);
	}
	@Override
	public Iterable<Supplier> displayAll() {
		// TODO Auto-generated method stub
		return myrepo1.findAll();
	}
	@Override
	public void deleteData(Supplier sr) {
	
		myrepo1.delete(sr);
	}
	@Override
	public Supplier editData(String mbl) {
		
		return myrepo1.findByMobile(mbl);
	}
	
	
	
	
	
	
	
	
	
	

}
