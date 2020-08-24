package com.example.demoCar.service;

import com.example.demoCar.entity.CustomerDetails;

public interface ICustomerService {

	public CustomerDetails loginCustomer(CustomerDetails details);

	CustomerDetails loginCustomer(String message);

	CustomerDetails loginCustomer();
}
