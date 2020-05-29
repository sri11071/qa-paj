package com.test.desktopWeb;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.common.BaseTest;

public class SampleScript {
	WebDriver driver;

	public static Logger logger = Logger.getLogger(BaseTest.class.getName());

	public void sample1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Bhavani\\Downloads\\Chrome_Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.uat1.carezen.net");
	}
}
