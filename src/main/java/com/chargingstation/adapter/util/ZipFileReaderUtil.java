package com.chargingstation.adapter.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipInputStream;

import org.springframework.stereotype.Component;	

@Component
public class ZipFileReaderUtil {

	private int numOfBytesRead = 0;
	private byte[] buffer = new byte[1024];
	private StringBuilder stringBuilder = new StringBuilder();

	public String extractLogoFromZipFile(String zipFileLocation) {
		try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFileLocation))) {
			while ((zipInputStream.getNextEntry()) != null) {
				while ((numOfBytesRead = zipInputStream.read(buffer, 0, 1024)) >= 0) {
					stringBuilder.append(new String(buffer, 0, numOfBytesRead));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stringBuilder.toString();
	}

}
