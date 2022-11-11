package com.example.project.service;


import com.example.project.model.Apple;
import com.example.project.model.Customer;

public interface MyService {

	public void Register(Customer cr);

	public Customer logincheck(String mb, String ps);

	public Iterable<Customer> displayAll();

	public void deleteData(Customer cr);

	public Customer editData(String mbl);

	public void App(Apple ap);

	
	
	
	
	
}
