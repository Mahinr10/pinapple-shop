package com.example.pineappleinventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PineappleInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PineappleInventoryApplication.class, args);
	}

}
