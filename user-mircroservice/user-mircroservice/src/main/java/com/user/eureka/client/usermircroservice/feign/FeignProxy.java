package com.user.eureka.client.usermircroservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.user.eureka.client.usermircroservice.model.Address;

/**
 * 
 * @author Srinivas 
 * 
 * 
 * FeignClient with just name (without url) will pickup uri from eureka and it does load balancing (application  need to be same name running on any port)
 * with feignClient we can make rest calls 
 * Here insted of manually typing we are making it with feign
 * 
 * without feign ,we will use rest template and url we need to type as "http:://localhost:8081/address/1"
 *
 *
 *Run address-service on different ports for load balancing verification
 */
@FeignClient(name = "address-microservice")
public interface FeignProxy {
	
	 @RequestMapping("address/{userId}")
	 public Address getAddress(@PathVariable("userId") String userId);
}
