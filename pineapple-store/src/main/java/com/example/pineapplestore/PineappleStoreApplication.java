package com.example.pineapplestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PineappleStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PineappleStoreApplication.class, args);
	}

}
