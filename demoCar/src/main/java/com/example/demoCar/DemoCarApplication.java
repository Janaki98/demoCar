package com.example.demoCar;

import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.demoCar.entity.CustomerDetails;
import com.example.demoCar.service.CustomerServiceImpl;

@SpringBootApplication(scanBasePackages={"com.example.demoCar"})
//@ComponentScan(basePackages = {"com.example.demoCar"})
public class DemoCarApplication {
	@Autowired
	public CustomerServiceImpl custService;
	
	
	CustomerDetails customerDetails;
	
	@Bean
	public Function<CustomerDetails,CustomerDetails> checkUser(){
		System.out.println("abcdeffg");
		
		Function<CustomerDetails,CustomerDetails> result=(input) -> custService.loginCustomer(input); 
		
		System.out.println("above res");
		return result;
	}


	@Bean
	public Supplier<CustomerDetails> login(){
		System.out.println("stop123");
		Supplier<CustomerDetails> result = () -> custService.loginCustomer();
		return result;
		
	}

	
	public static void main(String[] args) {
		System.out.println("hellooooooooooo");
		SpringApplication.run(DemoCarApplication.class, args);
	}

}
