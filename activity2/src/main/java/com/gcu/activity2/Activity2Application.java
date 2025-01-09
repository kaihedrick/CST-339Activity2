package com.gcu.activity2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "com.gcu" })
@SpringBootApplication
public class Activity2Application {

	public static void main(String[] args) {
		SpringApplication.run(Activity2Application.class, args);
	}

}
