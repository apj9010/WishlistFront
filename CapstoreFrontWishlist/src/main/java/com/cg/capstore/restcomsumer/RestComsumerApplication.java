package com.cg.capstore.restcomsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg.capstore")
public class RestComsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestComsumerApplication.class, args);
	}
}
