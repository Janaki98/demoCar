package com.example.demoCar.entity;

import lombok.Data;

@Data
public class CustomerDetails {
	
	private String customerName;
	private String pswd;
	private String carNmae;
	private int phoneNumber;
	
	
	public CustomerDetails(String customerName, String pswd, String carNmae, int phoneNumber) {
		super();
		this.customerName = customerName;
		this.pswd = pswd;
		this.carNmae = carNmae;
		this.phoneNumber = phoneNumber;
	}
	
	public CustomerDetails(String stringJSON) {
		this.customerName = stringJSON;
	}
	public CustomerDetails() {
	}

	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCarNmae() {
		return carNmae;
	}
	public void setCarNmae(String carNmae) {
		this.carNmae = carNmae;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
