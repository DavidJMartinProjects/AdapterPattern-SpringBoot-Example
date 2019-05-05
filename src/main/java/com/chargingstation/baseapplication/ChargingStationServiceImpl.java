package com.chargingstation.baseapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChargingStationServiceImpl implements ChargingStationService {
	
	@Autowired
	ChargingStation chargingStation;

	@Override
	public String displayChargingNotification(PhoneNotificationConfig phoneConfigMessages) {
		chargingStation.setPhoneNotificationConfig(phoneConfigMessages);
		return chargingStation.displayChargingNotification();
	}
	
}
