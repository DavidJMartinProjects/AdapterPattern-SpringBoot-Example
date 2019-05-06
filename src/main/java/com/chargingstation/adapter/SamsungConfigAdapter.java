package com.chargingstation.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chargingstation.baseapplication.PhoneNotificationConfig;

@Component("samsung")
public class SamsungConfigAdapter implements PhoneNotificationConfig {

	@Autowired
	SamsungConfig samsungConfig;
	
	@Override
	public String getChargingNotification() {
		return samsungConfig.showChargingInitMsg();
	}

}
