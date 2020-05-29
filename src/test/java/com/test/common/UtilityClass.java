package com.test.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass {
	public WebDriver driver;
	public WebDriverWait wait;

	public static Logger logger = LogManager.getLogger(BaseTest.class.getName());

	public final static short TYPE_UPPER_ONLY = 1;
	public final static short TYPE_LOWER_ONLY = 2;
	public final static Random rnd = new Random();
	
	static final char[] alphas = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
			'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
			'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static String getProperty(String propertyFile, String propertyName)
			throws IOException, InterruptedException {
		logger.info("entering into the PropFileSetUp method");
		logger.info("looking for properties file");
		String propertyValue = null;
		Properties props;
		try {
			String projectPath = System.getProperty("user.dir") + File.separator;
			String propertyFilePath = projectPath + File.separator + "src" + File.separator + "main" + File.separator
					+ "resources" + File.separator + "properties" + File.separator + propertyFile + ".properties";
			props = new Properties();
			props.load(new FileInputStream(propertyFilePath));
			propertyValue = props.getProperty(propertyName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return propertyValue;
	}
	
	public static void saveFile(WebDriver driver, String fileName, String extension, String destination) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			LocalDateTime current = LocalDateTime.now();
			String dateTime = "_" + current.getDayOfMonth() + "-" + current.getMonthValue() + "-" + current.getYear()
					+ "-" + current.getHour() + "-" + current.getMinute() + "-" + current.getSecond();
			logger.info("file saved in " + (destination + fileName + dateTime + "." + extension));
			FileUtils.copyFile(src, new File(destination + fileName + dateTime + "." + extension));
		} catch (IOException e) {
			logger.error("File saving failed : ", e.getCause());
		}

	}

	public static String randomNumberGenerator() {
		// Random number generator
		String randomNumber = RandomStringUtils.randomNumeric(3);

		// Return random number
		return randomNumber;
	}

	public static String generateRandomString() {
		short type = 2;
		int min = type == TYPE_LOWER_ONLY ? 26 : 0;
		int max = type == TYPE_UPPER_ONLY ? 26 : alphas.length;
		String generated = "";
		for (int i = 0; i < 5; i++) {
			int random = rnd.nextInt(max - min) + min;
			generated += alphas[random];
		}
		return generated;
	}

	
}
