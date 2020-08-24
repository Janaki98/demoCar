//package com.example.demoCar.Controller;
//
//import java.util.function.Function;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Controller;
//
//import com.example.demoCar.entity.CustomerDetails;
//import com.example.demoCar.service.CustomerServiceImpl;
//
//
//public class Customer {
//	
//	@Autowired
//	public CustomerServiceImpl custService;
//
//	@Bean
//	public Function<Object,Object> checkUser(CustomerDetails customer){
//
//		System.out.println("hiii controller");
//		
//		Function<Object, Object> result=(Function<Object, Object>) custService.loginCustomer(customer); 
//		
//		System.out.println("above res");
//		return result;
//	}
//
//}
