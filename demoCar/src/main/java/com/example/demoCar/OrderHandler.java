package com.example.demoCar;

import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
import org.springframework.context.annotation.Bean;

import com.example.demoCar.entity.CustomerDetails;
import com.example.demoCar.service.CustomerServiceImpl;

public class OrderHandler extends SpringBootRequestHandler<Object,Object> {
	
//	@Autowired
//	public CustomerServiceImpl custService;
//	
//	CustomerDetails customerDetails;
//	
//	@Bean
//	public Function<CustomerDetails,CustomerDetails> checkUser(CustomerDetails details){
//		System.out.println("abcdeffg");
//		
//		Function<CustomerDetails,CustomerDetails> result=(input) -> custService.loginCustomer(details); 
//		
//		System.out.println("above res");
//		return result;
//	}
//
//
//	@Bean
//	public Supplier<CustomerDetails> login(){
//		System.out.println("stop");
//		Supplier<CustomerDetails> result = () -> custService.loginCustomer();
//		return result;
//		
//	}
}
