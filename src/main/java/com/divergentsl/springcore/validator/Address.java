package com.divergentsl.springcore.validator;

import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Size(min = 5, max = 12, message = "address not be more than 15 or less than 5")
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
