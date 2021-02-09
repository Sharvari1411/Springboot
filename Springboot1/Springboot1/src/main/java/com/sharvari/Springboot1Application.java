package com.sharvari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class Springboot1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication app= new SpringApplication(Springboot1Application.class);
		app.run(args);
	}
	
	@Override
	public void run (String...arg0) throws Exception{
		System.out.println("Spring boot application created...........");
	}

}
