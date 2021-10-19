package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demoapp1Application {

	public static void main(String[] args) {
		 int num1 = 10, num2 = 15, sum;
		    sum = num1 + num2;

		    System.out.println("Sum of these numbers: "+sum);
		SpringApplication.run(Demoapp1Application.class, args);
	}
}
