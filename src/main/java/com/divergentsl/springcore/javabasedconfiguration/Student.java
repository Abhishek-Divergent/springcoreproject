package com.divergentsl.springcore.javabasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component("Student")
public class Student {
	@Autowired
	 Environment env;
	public String getPropertyValue() {
		return env.getProperty("test");
	}

}
