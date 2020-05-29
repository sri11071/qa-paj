package com.test.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePo {

	public WebDriver driver;
	public WebDriverWait wait;
	
	public static final Logger logger = Logger.getLogger(BasePo.class);
	public BasePo(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}
}
