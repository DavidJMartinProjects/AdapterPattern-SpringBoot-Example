package com.chargingstation.baseapplication;

import org.springframework.stereotype.Service;

@Service
public interface ChargingStationService {
	String displayChargingNotification(PhoneNotificationConfig phoneConfigMessages);
}
