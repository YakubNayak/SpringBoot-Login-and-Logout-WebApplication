package com.ksv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksv.model.Customer;
import com.ksv.repo.CustomerRepo;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerRepo repo;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		Customer save=repo.save(customer);
		return save;
	}

	@Override
	public Customer login(String cname, String password) {
		Customer login=repo.findByCnameAndPassword(cname, password);
		return login;
	}

}
