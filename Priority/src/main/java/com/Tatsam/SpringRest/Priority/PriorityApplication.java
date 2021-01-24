package com.Tatsam.SpringRest.Priority;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Tatsam.SpringRest.Priority.services.MyServices;

@SpringBootApplication
public class PriorityApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(PriorityApplication.class, args);
		System.out.println("Hi Tatsam");
	}

}
