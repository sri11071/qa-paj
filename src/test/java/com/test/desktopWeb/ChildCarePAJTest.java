package com.test.desktopWeb;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

import com.test.common.BaseTest;

public class ChildCarePAJTest extends BaseTest {

	public static Logger log = LogManager.getLogger(ChildCarePAJTest.class.getName());

	@BeforeMethod
	public void initializeDriver() throws IOException, InterruptedException {
		super.readProperty();
	}

	@Test(testName = "ChildcarePAJForMandatoryFilds")
	public void childCarePAJ() throws IOException {
//		System.out.println("className  "+getClass().getSimpleName());
		PajPO ccpaj = new PajPO(getDriver(), getDriverWait());
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		logger.info("Posting a child care job");

		ccpaj.findCare();
		ccpaj.myKids();
		ccpaj.nannyAndBabySitter();
		ccpaj.howSoonDoYouNeedSomeone();
		ccpaj.ccnext1();
		ccpaj.minExperienceForCC();
		ccpaj.next2();
		ccpaj.next3();
		ccpaj.seekerZipCC("02451");
		ccpaj.next4();

		ccpaj.createAccountSubmit1cc();
		
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\bhavanig\\Documents\\TakeSnapShotsFromScripts\\submit1.png"));

		ccpaj.firstName("abcde");
		ccpaj.createAccountSubmit1cc();
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("C:\\Users\\bhavanig\\Documents\\TakeSnapShotsFromScripts\\firstname.png"));

		ccpaj.lastName("x");
		ccpaj.createAccountSubmit1cc();
		File src2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("C:\\Users\\bhavanig\\Documents\\TakeSnapShotsFromScripts\\lastname1.png"));

		ccpaj.lastName("yz");
		ccpaj.createAccountSubmit1cc();
		File src3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src3, new File("C:\\Users\\bhavanig\\Documents\\TakeSnapShotsFromScripts\\lastname2.png"));

		ccpaj.email("abcde1.test@care.com");
		ccpaj.password("letmein1");
		ccpaj.createAccountSubmit1cc();
		File src4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src4,
				new File("C:\\Users\\bhavanig\\Documents\\TakeSnapShotsFromScripts\\finalsubmit1.png"));

		ccpaj.email("abcde25" + randomNumberGenerator() + ".test@care.com");
		ccpaj.submit2();
		File src5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src5,
				new File("C:\\Users\\bhavanig\\Documents\\TakeSnapShotsFromScripts\\finalsubmit2.png"));

		ccpaj.address("100 jones street");
		ccpaj.submit2();
		File src6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src6,
				new File("C:\\Users\\bhavanig\\Documents\\TakeSnapShotsFromScripts\\finalsubmit3.png"));

		ccpaj.continue1();
		File src7 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src7, new File("C:\\Users\\bhavanig\\Documents\\TakeSnapShotsFromScripts\\continue1.png"));

		ccpaj.selectJobDays();
		ccpaj.continue1();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i < 3; i++) {
			js.executeScript("window.scrollBy(0, 500)");
		}

		File src8 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src8, new File("C:\\Users\\bhavanig\\Documents\\TakeSnapShotsFromScripts\\continue101.png"));
		ccpaj.continue1();

		ccpaj.howManyKidsNeedCare1();
		ccpaj.howManyKidsNeedCare2();
		ccpaj.continue1();
//		paj.skipThisStep();

		ccpaj.skipAndContinueAsABasicMember();
		File src9 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src9, new File("C:\\Users\\bhavanig\\Documents\\TakeSnapShotsFromScripts\\SeekerMHP.png"));

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
//	/**
//	 * Generate a random string of characters at the specified length. length hard
//	 * coded to 5
//	 * 
//	 * @return generated string of lower case
//	 */
//	public static String generateRandomString() {
//		short type = 2;
//		int min = type == TYPE_LOWER_ONLY ? 26 : 0;
//		String[] alphas;
//		int max = type == TYPE_UPPER_ONLY ? 26 : alphas.length;
//		String generated = "";
//		for (int i = 0; i < 5; i++) {
//			int random = rnd.nextInt(max - min) + min;
//			generated += alphas[random];
//		}
//		return generated;
//	}

}