package com.example.project.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Customer;
@Repository
public interface MyRepository extends CrudRepository<Customer, String>{

	public Customer findByMobileAndPass(String mb,String ps);
	public Customer findByMobile(String m);
	
 }
