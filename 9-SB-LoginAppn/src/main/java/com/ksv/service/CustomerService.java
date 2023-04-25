package com.ksv.service;

import com.ksv.model.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);
	public Customer login(String cname,String password);
	
}
