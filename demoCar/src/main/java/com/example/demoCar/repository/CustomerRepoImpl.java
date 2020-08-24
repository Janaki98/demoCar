package com.example.demoCar.repository;

import org.springframework.stereotype.Repository;

import com.example.demoCar.entity.CustomerDetails;

@Repository
public class CustomerRepoImpl implements ICustomerRepository {

	@Override
	public CustomerDetails loginCustomerRepo(CustomerDetails details) {
	System.out.println("hiiiii repo");
		String custName = details.getCustomerName();
		String pswd =details.getPswd();
		
		if(custName=="janaki"&&pswd=="janaki123") {
			System.out.println(" hi repo ifS");
			details.setPswd("successful");
			return details;
		}
		else {
			System.out.println("hi repo else");
			details.setCustomerName(null);
			details.setPswd(null);
		}
		return details;
	}

	public CustomerDetails loginCustomerRepo(String message) {
	
		return null;
	}

	public CustomerDetails loginCustomerRepo() {
		System.out.println("repoooo");
		CustomerDetails details = new CustomerDetails();
		details.setCarNmae("BENZ");
		details.setCustomerName("janaki");
		details.setPhoneNumber(123456789);
		details.setPswd("123wert");
		return details;
	}

}
