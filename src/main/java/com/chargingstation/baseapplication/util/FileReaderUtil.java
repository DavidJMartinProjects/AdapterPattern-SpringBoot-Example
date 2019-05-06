package com.chargingstation.baseapplication.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

@Component
public class FileReaderUtil {
	
	private String fileContents;
	
	public String extractLogoFromTextFile(String filePath) {
		try {
			File file =  ResourceUtils.getFile("classpath:"+filePath);
			fileContents = FileUtils.readFileToString(file, "UTF-8");
		} catch (IOException e) {
			// throw custom exception here for file not found, generic exception to catch all others etc   
			e.printStackTrace();
		}
		return fileContents;
	}
		
}	
	