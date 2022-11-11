package com.example.project.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Supplier;
@Repository
public interface MyRepository1 extends CrudRepository<Supplier, String>{
	public Supplier findByMobileAndPass(String mb,String ps);
	public Supplier findByMobile(String m);

}
