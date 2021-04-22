package com.divergentsl.springcore.javabasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Student {
	private String Name = "abhi";
	private int age;
	
	@Autowired
	private Address address;
	

}
