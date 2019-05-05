package com.chargingstation.application;

import java.io.InputStream;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.chargingstation.baseapplication.ChargingStationService;
import com.chargingstation.baseapplication.PhoneNotificationConfig;

@Component
public class PhoneChargingStationApp implements ApplicationRunner {
	
	@Autowired
	ChargingStationService chargingStationService;	
	
	@Autowired	
	@Qualifier("iphone")	
	PhoneNotificationConfig iphoneConfig;	
	
	@Autowired	
	@Qualifier("samsung")	
	PhoneNotificationConfig samsungConfig;
	
	Scanner myScanner = new Scanner(System.in);
		
	@Override
	public void run(ApplicationArguments args) throws Exception {
		displayMenu();
	}
	
	private void displayMenu() {

		int userChoice = 1000;
		
		while(userChoice!=0) {
			
			System.out.println("Select Phone to Charge : ");
			System.out.println("1. Iphone");
			System.out.println("2. Samsung");
			System.out.println("0. exit");
			userChoice = myScanner.nextInt();
			
			switch (userChoice) {
			case 1:
				chargePhone(iphoneConfig);	
				break;
				
			case 2:
				chargePhone(samsungConfig);	
				break;

			default:
				break;
			}
		}
		
	}

	public void chargePhone(PhoneNotificationConfig phoneNotificationConfig) {		
		System.out.println(chargingStationService.chargePhone(phoneNotificationConfig));
	}
	
}
	