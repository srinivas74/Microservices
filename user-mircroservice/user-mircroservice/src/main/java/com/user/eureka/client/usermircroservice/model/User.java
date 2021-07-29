package com.user.eureka.client.usermircroservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String dob;
    private Address address;
    
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", address=" + address
				+ "]";
	}
	




    
}