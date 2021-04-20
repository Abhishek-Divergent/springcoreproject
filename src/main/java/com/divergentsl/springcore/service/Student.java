package com.divergentsl.springcore.service;
/**
 * Student class contain student detail or address reference to address of  student
 * @author JAI MAHAKAL
 *
 */
public class Student {
	private int id;
	private String name;
	private Address address;
	public Student() {
	}

	public Student(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
