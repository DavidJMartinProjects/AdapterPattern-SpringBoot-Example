package com.chargingstation.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chargingstation.adapter.util.ZipFileReaderUtil;

@Component
public class SamsungConfig {	
	
	@Autowired
	ZipFileReaderUtil zipFileReaderUtil;
	
	String zipFileLocation = "src/main/resources/samsungLogo.zip";

	public String showChargingInitMsg() {
		return zipFileReaderUtil.extractLogoFromZipFile(zipFileLocation) + "\n Samsung is charging...";
	}

	public String showChargingCompleteMsg() {
		return "Samsung is fully charged.";
	}
	
}
