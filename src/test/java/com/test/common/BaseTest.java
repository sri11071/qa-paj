package com.test.common;

import java.io.IOException;
import java.net.URL;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	public WebDriver driver;
	public WebDriverWait wait;

	public static Logger logger = LogManager.getLogger(BaseTest.class.getName());

	public void readProperty() throws IOException, InterruptedException {

		String pfm = UtilityClass.getProperty("environment", "execute.on");

		if (pfm.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "E:\\Bhavani\\Downloads\\Chrome_Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			logger.info("ChromeDriver launched");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.uat1.carezen.net");

		} else if (pfm.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "E:\\Bhavani\\Downloads\\Gecko_Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.uat2.carezen.net");
		} else {
			String uName = UtilityClass.getProperty("environment", "sauce.username");
			String aKey = UtilityClass.getProperty("environment", "sauce.acccessKey");
			String pForm = UtilityClass.getProperty("environment", "sauce.platform");
			String bName = UtilityClass.getProperty("environment", "sauce.browser");
			String bVersion = UtilityClass.getProperty("environment", "sauce.browserVersion");

			String sauceURL = "https://ondemand.saucelabs.com/wd/hub";

			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			capabilities.setCapability("username", uName);
			capabilities.setCapability("accessKey", aKey);
			capabilities.setCapability("browserName", bName);
			capabilities.setCapability("platform", pForm);
			capabilities.setCapability("version", bVersion);
			capabilities.setCapability("name", " " + getClass().getSimpleName());

			driver = new RemoteWebDriver(new URL(sauceURL), capabilities);
			driver.navigate().to("https://www.uat1.carezen.net");
		}
//		wait = new WebDriverWait(getDriver(), 40);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebDriverWait getDriverWait() {
		return new WebDriverWait(getDriver(), 40);

	}
}
