package com.divergentsl.springcore.validator;

import java.util.Set;

import javax.annotation.Generated;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentValidator {
	private static final Logger myLogger = LoggerFactory.getLogger(StudentValidator.class.getName());

	@NotNull
	@Size(min = 5, max = 8, message = "Name size should be between 5  To  8")
	private String name;
	//@Min(value = 18, message = "age should not be less than 18")
	//@Max(value = 50, message = "age should not be more than 50")
	private int age;
	@NotNull
    @Range(min = 1 ,message =  " Please Enter Number not{$id} ")
	private int id;

	@Autowired
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "StudentValidator [name=" + name + ", age=" + age + ", id=" + id + ", address=" + address + "]";
	}

	static void validator(StudentValidator studentValidator, Validator validator) {
		Set<ConstraintViolation<StudentValidator>> violations = validator.validate(studentValidator);
		for (ConstraintViolation<StudentValidator> violation : violations) {
			myLogger.error(violation.getMessage());
		}
	}

}
