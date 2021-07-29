package com.address.eureka.client.addressmircroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AddressMircroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressMircroserviceApplication.class, args);
	}

}
