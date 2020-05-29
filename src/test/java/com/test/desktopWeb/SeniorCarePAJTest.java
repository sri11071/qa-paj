package com.test.desktopWeb;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.common.BaseTest;

public class SeniorCarePAJTest extends BaseTest {

	@BeforeMethod
	public void intializeDriver() throws IOException, InterruptedException {
		super.readProperty();
	}

	@Test
	public void seniorCarePAJ() throws InterruptedException {
		PajPO scpaj = new PajPO(getDriver(), getDriverWait());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("Posting a child care job");

		scpaj.findCare();
		scpaj.myParents();
		scpaj.howSoonDoYouNeedSomeone();
		scpaj.scnext1();
		scpaj.seniorCareWhoNeedsCare();

		driver.findElement(By.xpath("//*[@id='who-needs-btn' and @data-next-step='24']/span[contains(.,'Next')]"))
				.click();

		scpaj.whatElseWouldMakeForAnIdealCaregiver();

		driver.findElement(By.xpath("//*[@id='provide-btn']")).click();

		scpaj.whatAreOtherMust_havesForYourCaregiverSC();

		driver.findElement(By.xpath(
				"//*[@id=\"senior-care-container\"]//*[@class='row']//*[@data-next-step='26']//span[contains(.,'Next')]"))
				.click();

		scpaj.seekerZipSC("02451");

		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		WebElement element1 = wait1.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id='senior-care-container']//*[@data-next-step='1']")));
		element1.click();
//		driver.findElement(By.xpath("//*[@id='senior-care-container']//*[@data-next-step='1']")).click();

		scpaj.createUser("pqrs", "mn", "pqrs1" + randomNumberGenerator() + ".test@care.com", "letmein1");
		scpaj.ourFastestWayToFindYourPerfectCaregiverPageSC();
//		driver.findElement(By.xpath("//*[@id='skipLink']/span[contains(.,'Skip this step')]")).click();
		scpaj.scupgradeMember(); // UAT1
//		scpaj.upgradeMember();      // UAT2
		scpaj.exclusiveBGCAndAddOnAndPremiunMemberPages();
//		driver.findElement(
//				By.xpath("//*[@class='stepOneBlock clearfix skipThisStep ']//*[contains(.,'Skip this step')]")).click();

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
		String randomNumber = RandomStringUtils.randomNumeric(5);

		// Return random number
		return randomNumber;
	}
}
