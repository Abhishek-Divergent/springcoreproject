package com.divergentsl.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Student class contain student detail or address reference to address of
 * student
 * 
 * @author JAI MAHAKAL
 *
 */
public class Student {
	private int id;
	private String name;
	@Autowired
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setting properties");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
