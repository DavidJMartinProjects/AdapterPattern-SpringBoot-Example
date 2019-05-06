package com.chargingstation.baseapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChargingStation implements DisplayConsoleNotifications {
	
	@Autowired
	PhoneNotificationConfig phoneNotificationConfig;

	@Override
	public String displayChargingNotification(PhoneNotificationConfig phoneNotificationConfig) {
		return phoneNotificationConfig.getChargingNotification();		
	}

}
