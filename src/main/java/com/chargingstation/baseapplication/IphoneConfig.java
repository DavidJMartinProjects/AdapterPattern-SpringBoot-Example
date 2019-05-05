package com.chargingstation.baseapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;	

@Primary
@Component("iphone")
public class IphoneConfig implements PhoneNotificationConfig {
	
	@Autowired
	IphoneAsciiLogo iphoneAsciiLogo;
	
	@Override
	public String getChargingNotification() {
		return iphoneAsciiLogo.getLogo() + "\n Iphone is charging...";
	}

	@Override
	public String getChargedNotification() {
		return "Iphone is fully charged.";
	}
	
}
