package com.divergentsl.springcore.validator;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValidatorTest {
	private static Logger logger=LoggerFactory.getLogger(Logger.class.getClass().getName());
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		context.register(ValidatorConfig.class);
		context.refresh();
		StudentValidator studentValidator= (StudentValidator)context.getBean(StudentValidator.class);
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		studentValidator.setName("Abhishek sahu");
		studentValidator.setAge(500);
		studentValidator.setId(0);
		
		StudentValidator.validator(studentValidator,validator);
	}
}
