package com.skills.skillsservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SkillsServicesApplication {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SkillsServicesApplication.class, args);
		Test tst = ctx.getBean(Test.class);
		tst.printData();
		
	}

}
