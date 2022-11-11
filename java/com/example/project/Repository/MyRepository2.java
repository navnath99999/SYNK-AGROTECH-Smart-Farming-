package com.example.project.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Admin;

@Repository
public interface MyRepository2 extends CrudRepository<Admin, String>{

	public Admin findByMobileAndPass(String mb,String ps);
	public Admin findByMobile(String m);
	
	
 }
