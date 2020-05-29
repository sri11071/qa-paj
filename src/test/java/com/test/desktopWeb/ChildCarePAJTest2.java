package com.test.desktopWeb;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.common.BaseTest;

public class ChildCarePAJTest2 extends BaseTest {
	@BeforeMethod
	public void initializeDriver() throws IOException, InterruptedException {
		super.readProperty();
	}

	@Test(testName = "ChildcarePAJForAllPosibleFields")
	public void childCarePAJ2() {
		PajPO ccpaj2 = new PajPO(getDriver(), getDriverWait());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("Posting a childcare job");
		
		ccpaj2.findCare();
		ccpaj2.myKids();
		ccpaj2.nannyAndBabySitter();
		ccpaj2.howSoonDoYouNeedSomeone();
		ccpaj2.ccnext1();
		ccpaj2.whatWouldMakeForAnIdealCaregiver();
		ccpaj2.next2();
		ccpaj2.whatAreOtherMust_havesForYourCaregiverCC();
		ccpaj2.next3();
		ccpaj2.seekerZipCC("02451");
		ccpaj2.next4();
		ccpaj2.createUser("abcde", "yz", "abcde1" + randomNumberGenerator() + ".test@care.com", "letmein1");
		ccpaj2.selectJobDays();
		ccpaj2.howManyKidsNeedCare1();
		ccpaj2.howManyKidsNeedCare2();

//		WebDriverWait wait1 = new WebDriverWait(driver, 20);
//		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.linkText("Light Housekeeping")));
//		element1.click();
//		ccpaj2.lightHousekeeping();

		WebElement element = driver.findElement(By.xpath("//*[@id='pajSpringForm']/div/section[7]/div[2]/div[1]"));
		System.out.println(element.getText());
		if (element.getText().matches("Light Housekeeping")) {
			element.click();
		}
		ccpaj2.continue1();
//		ccpaj2.skipThisStep();
		ccpaj2.skipAndContinueAsABasicMember();

	}

	/**
	 * Random Numeric String generator
	 *
	 * @param length
	 * @return
	 * @author amit kumar
	 */
	public static String randomNumberGenerator() {
		// Random number generator
		String randomNumber = RandomStringUtils.randomNumeric(3);

		// Return random number
		return randomNumber;
	}

}