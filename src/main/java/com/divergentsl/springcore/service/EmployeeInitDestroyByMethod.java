package com.divergentsl.springcore.service;

public class EmployeeInitDestroyByMethod {
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public EmployeeInitDestroyByMethod() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() {
		System.out.println(" Init by Method ");
	}

	public void destroy() {
       System.out.println(" Destroy by Method");
	}

}
