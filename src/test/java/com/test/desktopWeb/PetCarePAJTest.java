package com.test.desktopWeb;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.common.BaseTest;

public class PetCarePAJTest extends BaseTest {

	@BeforeMethod
	public void intializeDriver() throws IOException, InterruptedException {
		super.readProperty();
	}

	@Test
	public void petCarePAJ() throws InterruptedException {
		PajPO pcpaj = new PajPO(getDriver(), getDriverWait());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("posting a Pet care Job ");

		pcpaj.findCare();
		pcpaj.myPets();
		pcpaj.howSoonDoYouNeedSomeone();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-next-step='43']")));
//		driver.findElement(By.xpath("//*[@data-next-step='43']")).click();
		pcpaj.pcnext1();
		pcpaj.selectPets();
		pcpaj.petNeeds();
		pcpaj.seekerZipPC("02451");
		pcpaj.seekerZipPCNext();
		pcpaj.createUser("wxyz", "abc", "wxyz12" + randomNumberGenerator() + ".test@care.com", "letmein1");
		pcpaj.selectJobDays();
		pcpaj.pajSubmit();
//		pcpaj.upgradeMember();    //  UAT2
		pcpaj.scupgradeMember();     // UAT1
		pcpaj.exclusiveBGCAndAddOnAndPremiunMemberPages();

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