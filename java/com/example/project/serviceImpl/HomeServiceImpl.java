package com.example.project.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Repository.MyRepository;
import com.example.project.model.Apple;
import com.example.project.model.Customer;
import com.example.project.service.MyService;
@Service
public class HomeServiceImpl implements MyService {
   @Autowired MyRepository myrepo;
	@Override
	public void Register(Customer cr) {
		myrepo.save(cr);
		
	}
	@Override
	public Customer logincheck(String mb, String ps) {
		// TODO Auto-generated method stub
		return myrepo.findByMobileAndPass(mb, ps);
	}
	@Override
	public Iterable<Customer> displayAll() {
		// TODO Auto-generated method stub
		return myrepo.findAll();
	}
	@Override
	public void deleteData(Customer cr) {
		
		myrepo.delete(cr);
	}
	@Override
	public Customer editData(String mbl) {
		
		return myrepo.findByMobile(mbl);
	}
	@Override
	public void App(Apple ap) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
