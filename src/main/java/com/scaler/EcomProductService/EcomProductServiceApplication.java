package com.scaler.EcomProductService;

import com.scaler.EcomProductService.service.InitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomProductServiceApplication implements CommandLineRunner {

	@Autowired
	InitService initService;
	public static void main(String[] args) {
		SpringApplication.run(EcomProductServiceApplication.class, args);
		System.out.println("Print in main function");
	}

	@Override
	public void run(String... args) throws Exception {
		initService.initialise();
	}
}
