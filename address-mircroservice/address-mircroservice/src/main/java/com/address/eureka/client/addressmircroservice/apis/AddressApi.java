package com.address.eureka.client.addressmircroservice.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.address.eureka.client.addressmircroservice.model.Address;



@RestController
@RequestMapping("/address")
@RefreshScope
public class AddressApi {

	@Autowired
	private Environment environment;
	
	@Value("${gps.coordinates}")
	private String gps;
	
	 @RequestMapping("/{userId}")
	 public Address getUser(@PathVariable("userId") String userId) {
		 return new Address("100","bazar","charminar","Hyderabad","India",environment.getProperty("local.server.port"));
	 }
	 
	 @GetMapping("/{userId}/gps")
	 public String getGpsCordinates() {
		 return gps;
	 }
}
