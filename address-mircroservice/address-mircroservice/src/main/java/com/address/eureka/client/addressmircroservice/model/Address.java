package com.address.eureka.client.addressmircroservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	
	private String homeNumber;
	private String street;
	private String  city;
	private String state;
	private String country;
	private String port;
	
	@Override
	public String toString() {
		return "Address [homeNumber=" + homeNumber + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", port=" + port + "]";
	}

}
