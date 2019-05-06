package com.chargingstation.adapter.util;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chargingstation.application.ChargingstationApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ChargingstationApplication.class)	
public class ZipFileReaderUtilTest {

	@Autowired
	SamsungAsciiLogo samsungAsciiLogo;
	
	@Autowired
	ZipFileReaderUtil zipFileReaderUtil;
	
	String filePath = "samsungLogo.zip";

	@Test
	public void test() throws IOException {
		String expectedLogo = samsungAsciiLogo.getLogo();
		String zipFileLocation = "src/main/resources/samsungLogo.zip";
		String actualLogo = zipFileReaderUtil.extractLogoFromZipFile(zipFileLocation);
		assertEquals(expectedLogo, actualLogo);
	}

}
