package com.chargingstation.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SamsungConfig {
	
	@Autowired
	SamsungAsciiLogo samsungAsciiLogo;

	public String showChargingInitMsg() {
		return samsungAsciiLogo.getLogo() + "\n Samsung is charging...";
	}

	public String showChargingCompleteMsg() {
		return "Samsung is fully charged.";
	}
	
}
