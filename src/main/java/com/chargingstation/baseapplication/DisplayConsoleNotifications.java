package com.chargingstation.baseapplication;

import org.springframework.stereotype.Service;

@Service	
public interface DisplayConsoleNotifications {
	String displayChargingNotification(PhoneNotificationConfig phoneNotificationConfig);
}
