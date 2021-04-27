package com.divergentsl.springcore.validator;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan(basePackages = "com.divergentsl.springcore.validator")
@Profile("dev")
public class ValidatorConfig {

}
