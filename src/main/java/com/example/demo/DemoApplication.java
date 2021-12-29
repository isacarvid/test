package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class DemoApplication {



	public static void main(String[] args) {
		Logic logic = new Logic();
		System.out.println(logic.product(3, 3));
		System.out.println(logic.sum(3, 3));
		SpringApplication.run(DemoApplication.class, args);
	}

}
