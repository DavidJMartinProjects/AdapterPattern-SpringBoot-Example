package com.chargingstation.baseapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChargingStation implements DisplayConsoleNotifications {
	
	@Autowired
	PhoneNotificationConfig phoneNotificationConfig;
	
	public void setPhoneNotificationConfig(PhoneNotificationConfig phoneNotificationConfig) {
		this.phoneNotificationConfig = phoneNotificationConfig;
	}

	@Override
	public String displayChargingNotification() {
		return phoneNotificationConfig.getChargingNotification();		
	}

	@Override
	public void displayChargedNotification() {
		phoneNotificationConfig.getChargedNotification();
	}	

}
