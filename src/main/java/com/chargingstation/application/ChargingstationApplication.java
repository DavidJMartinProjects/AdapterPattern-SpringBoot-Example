package com.chargingstation.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.chargingstation"})
public class ChargingstationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChargingstationApplication.class, args);
	}

}
