package com.divergentsl.springcore.javabasedconfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.divergentsl.springcore.javabasedconfiguration")
@Profile("Dev")
@PropertySource("classpath:/app.properties")

public class javaconfig {

}
