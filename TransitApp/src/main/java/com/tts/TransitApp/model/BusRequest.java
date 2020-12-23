package com.tts.TransitApp.model;

import lombok.Data;

// Create Getters and Setters if you don't have lombok
@Data
public class BusRequest {
    public String address;
    public String city;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	}
