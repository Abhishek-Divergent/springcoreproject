package com.divergentsl.springcore.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmployeeInitDestroyByAnnotation {
	String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@PostConstruct
	public void start() {
		System.out.println(" init by Annotation ");
	}

	@PreDestroy
	public void end() {
		System.out.println(" End by  Annotation ");
	}

}
