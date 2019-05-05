package com.chargingstation.baseapplication;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("iphone")
public class IphoneConfig implements PhoneNotificationConfig {

	@Override
	public String getChargingNotification() {
		String logo = 
				"                                                                                                                                                               \r\n" + 
				"                                                                                                                                                               \r\n" + 
				"                                                                               /@@                                                                             \r\n" + 
				"                                                                             @@@@@                                                                             \r\n" + 
				"                                                                            @@@@@                                                                              \r\n" + 
				"                                                                           %@@&                                                                                \r\n" + 
				"                                                                   #@@@@#     (@@@@@&,                                                                         \r\n" + 
				"                                                                (@@@@@@@@@@@@@@@@@@@@@@%                                                                       \r\n" + 
				"                                                               @@@@@@@@@@@@@@@@@@@@@@@#                                                                        \r\n" + 
				"                                                              @@@@@@@@@@@@@@@@@@@@@@@/                                                                         \r\n" + 
				"                                                             *@@@@@@@@@@@@@@@@@@@@@@&                                                                          \r\n" + 
				"                                                             /@@@@@@@@@@@@@@@@@@@@@@&                                                                          \r\n" + 
				"                                                             .@@@@@@@@@@@@@@@@@@@@@@@*                                                                         \r\n" + 
				"                                                              &@@@@@@@@@@@@@@@@@@@@@@@/                                                                        \r\n" + 
				"                                                               @@@@@@@@@@@@@@@@@@@@@@@@@@.                                                                     \r\n" + 
				"                                                               .@@@@@@@@@@@@@@@@@@@@@@@@*                                                                      \r\n" + 
				"                                                                 @@@@@@@@@@@@@@@@@@@@@@                                                                        \r\n" + 
				"                                                                  &@@@@@@@@@@@@@@@@@@@                                                                         \r\n" + 
				"                                                                    /@@@&.    .%@@@#                                                                           \r\n" + 
				"                                                                                                                                                               \r\n" + 
				"                                                                                                                                                               ";
		return logo + "\n Iphone is charging...";
	}

	@Override
	public String getChargedNotification() {
		return "Iphone is fully charged.";
	}
	
}
