package com.test.desktopWeb;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.common.BaseTest;

public class HouseKeepingPAJTest extends BaseTest {

	@BeforeMethod
	public void intializeDriver() throws IOException, InterruptedException {
		super.readProperty();
	}

	@Test
	public void houseKeepingPAJ() throws InterruptedException {
		PajPO hkpaj = new PajPO(getDriver(), getDriverWait());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("Posting a House keeping job");

		hkpaj.findCare();
		hkpaj.myHome();
		hkpaj.howSoonDoYouNeedSomeone();
		hkpaj.hknext1();
		hkpaj.howManyBedroomsAndBathRooms();
		hkpaj.whatShouldYourHouseKeeperBring();

		driver.findElement(By.xpath("//*[@id='ideal-hk-btn-validate']")).click();
		hkpaj.whatTasksDoYouExpectYourHousekeeperToCompletePage();
		driver.findElement(By.xpath("//*[@id='who-needs-btn' and @data-next-step='35']//span[contains(.,'Next')]"))
				.click();

		hkpaj.seekerZipHK("02451");
		hkpaj.createUser("jklmn", "uvw", "jklm12" + randomNumberGenerator() + ".test@care.com", "letmein1");
		hkpaj.ourFastestWayToFindYourPerfectCaregiverPageHK();
		hkpaj.scupgradeMember(); // UAT1
//		hkpaj.upgradeMember();    // UAT2
		hkpaj.exclusiveBGCAndAddOnAndPremiunMemberPages();

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