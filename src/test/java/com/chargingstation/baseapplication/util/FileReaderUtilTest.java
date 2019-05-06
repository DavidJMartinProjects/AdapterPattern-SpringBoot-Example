package com.chargingstation.baseapplication.util;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chargingstation.adapter.util.SamsungAsciiLogo;
import com.chargingstation.application.ChargingstationApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ChargingstationApplication.class)
public class FileReaderUtilTest {

	@Autowired
	IphoneAsciiLogo iphoneAsciiLogo;

	@Autowired
	FileReaderUtil fileReaderUtil;

	String filePath = "appleLogo.txt";

	@Test
	public void test() {
		String expectedLogo = new String(iphoneAsciiLogo.getLogo());
		String actualLogo = fileReaderUtil.extractLogoFromTextFile(filePath);
		assertEquals(expectedLogo, actualLogo);
	}

}
