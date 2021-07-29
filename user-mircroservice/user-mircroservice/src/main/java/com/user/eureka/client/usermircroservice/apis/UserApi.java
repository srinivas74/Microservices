package com.user.eureka.client.usermircroservice.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.eureka.client.usermircroservice.feign.FeignProxy;
import com.user.eureka.client.usermircroservice.model.Address;
import com.user.eureka.client.usermircroservice.model.User;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
@RefreshScope
public class UserApi {

	@Value("${user.phone.number}")
	private String phone;
	
	@Value("${user.email.address}")
	private String email;
	
	@Autowired
	private FeignProxy feignProxy;
	
	 @RequestMapping("/{userId}")
	 public User getUser(@PathVariable("userId") String userId) {
		 Address address=feignProxy.getAddress(userId);
		 log.info("Using Feign proxy Result =  {} ",address.toString());
		 return new User("steve","rodgers","1939-06-29",address);
	 }
	 
	 @GetMapping("/{userId}/contacts")
	 public String getFromConfigServer() {
		 return "<h4>Phone   :   "+phone +"</h4>" +"<h4>Email   :   "+email +"</h4>";
	 }
}
