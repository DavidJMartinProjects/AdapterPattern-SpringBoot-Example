package com.chargingstation.baseapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.chargingstation.baseapplication.util.FileReaderUtil;	

@Primary
@Component("iphone")
public class IphoneConfig implements PhoneNotificationConfig {	
	
	@Autowired
	FileReaderUtil fileReaderUtil;
	
	String filePath = "samsungLogo.txt";
	
	@Override
	public String getChargingNotification() {
		return fileReaderUtil.extractLogoFromTextFile(filePath) + "\n Iphone is charging...";
	}

}
