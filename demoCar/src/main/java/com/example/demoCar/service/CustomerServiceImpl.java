package com.example.demoCar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoCar.entity.CustomerDetails;
import com.example.demoCar.repository.CustomerRepoImpl;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	public CustomerRepoImpl customerRepo;
	
	@Override
	public CustomerDetails loginCustomer() {
		return customerRepo.loginCustomerRepo();
	}

	@Override
	public CustomerDetails loginCustomer(CustomerDetails details) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDetails loginCustomer(String message) {
		return null;
	}

}
