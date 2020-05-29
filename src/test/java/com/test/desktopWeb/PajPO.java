package com.test.desktopWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.common.BasePo;

public class PajPO extends BasePo {

	public PajPO(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

	}

	@FindBy(xpath = "//span[contains(.,'Find care')]")
//	@FindBy(xpath = "//button/span[1]/svg")
	private WebElement Findcare;

	public void findCare() {
		wait.until(ExpectedConditions.elementToBeClickable(Findcare));
		Findcare.click();
	}

	@FindBy(xpath = "//span[contains(.,'My kids')]")
	private WebElement Mykids;

	public void myKids() { // *[@id="choose-vertical"]/div[1]/button
		wait.until(ExpectedConditions.elementToBeClickable(Mykids));
		Mykids.click(); // *[@id="choose-vertical"]/div[1]/button/span[2]
	}

	@FindBy(xpath = "//span[contains(.,'My parents')]")
	private WebElement MyParents;

	public void myParents() {
		wait.until(ExpectedConditions.elementToBeClickable(Mykids));
		MyParents.click();
	}

	@FindBy(xpath = "//span[contains(.,'My pets')]")
	private WebElement MyPets;

	public void myPets() {
		wait.until(ExpectedConditions.elementToBeClickable(Mykids));
		MyPets.click();
	}

	@FindBy(xpath = "//span[contains(.,'My home')]")
	private WebElement MyHome;

	public void myHome() {
		wait.until(ExpectedConditions.elementToBeClickable(Mykids));
		MyHome.click();
	}

	@FindBy(xpath = "//div[@class='vhp-schwingy-step intent active']//span[contains(text(),'Right now')]")
	private WebElement RightNow;
	@FindBy(xpath = "//div[@class='vhp-schwingy-step intent active']//span[contains(text(),'Within a week')]")
	private WebElement WithinAWeek;
	@FindBy(xpath = "//div[@class='vhp-schwingy-step intent active']//span[contains(text(),'Within a month')]")
	private WebElement WithinAMonth;
	@FindBy(xpath = "//div[@class='vhp-schwingy-step intent active']//span[contains(text(),'Just browsing')]")
	private WebElement JustBrowsing;

	public void howSoonDoYouNeedSomeone() {
		int howsoon = getRandomNum(1, 4);
		wait.until(ExpectedConditions.elementToBeClickable(RightNow));
		if (howsoon == 1) {
			RightNow.click();
		} else if (howsoon == 2) {
			WithinAWeek.click();
		} else if (howsoon == 3) {
			WithinAMonth.click();
		} else {
			JustBrowsing.click();
		}
	}

	@FindBy(xpath = "//*[@class='btn btn-primary-1 btn-next-step' and @data-next-step='23']//*[text()='Next']")
	private WebElement SCNext1;

	public void scnext1() {
		wait.until(ExpectedConditions.elementToBeClickable(SCNext1));
		SCNext1.click();
	}

	@FindBy(xpath = "//*[@data-next-step='43']")
	private WebElement PCNext1;

	public void pcnext1() {
		wait.until(ExpectedConditions.elementToBeClickable(PCNext1));
		PCNext1.click();
	}

	@FindBy(xpath = "//*[@data-next-step='33']")
	private WebElement HKNext1;

	public void hknext1() {
		wait.until(ExpectedConditions.elementToBeClickable(HKNext1));
		HKNext1.click();
	}

	@FindBy(xpath = "//*[@class='btn btn-primary-1 btn-next-step' and @data-next-step='13']//*[text()='Next']")
	private WebElement CCNext1;

	public void ccnext1() {
		wait.until(ExpectedConditions.elementToBeClickable(CCNext1));

		CCNext1.click(); // *[@id="child-care-container"]/div[3]/div[2]/div/div/button/span
	}

	/********************************************************
	 * Child care
	 ***************************************************************/
	@FindBy(xpath = "//span[contains(.,'Nannies & babysitters')]")
	private WebElement NannyAndBabysitter;

	public void nannyAndBabySitter() {
		wait.until(ExpectedConditions.elementToBeClickable(NannyAndBabysitter));
		NannyAndBabysitter.click(); // *[@id="child-care-container"]/div[1]/div[1]/div[1]/button/span[2]
	}

	public void whatWouldMakeForAnIdealCaregiver() {
		minExperienceForCC();
		ableToCareForAgeGroup();
	}

	@FindBy(xpath = "//span[contains(text(),'Any')]")
	private WebElement MinExperienceAny;
	@FindBy(xpath = "//span[contains(text(),'3+')]")
	private WebElement MinExperience3Plus;
	@FindBy(xpath = "//span[contains(text(),'5+')]")
	private WebElement MinExperience5Plus;
	@FindBy(xpath = "//span[contains(text(),'7+')]")
	private WebElement MinExperience7Plus;

	public void minExperienceForCC() {
		int minExp = getRandomNum(1, 4);
		wait.until(ExpectedConditions.elementToBeClickable(MinExperienceAny));
		if (minExp == 1) {
			MinExperienceAny.click();
		} else if (minExp == 2) {
			MinExperience3Plus.click();
		} else if (minExp == 3) {
			MinExperience5Plus.click();
		} else {
			MinExperience7Plus.click();
		}

	}

	@FindBy(xpath = "//div[@class='control-label' and contains(.,'Newborns')]")
	private WebElement Newborn;
	@FindBy(xpath = "//div[@class='control-label' and contains(.,'Toddlers')]")
	private WebElement Toddlers;
	@FindBy(xpath = "//div[@class='control-label' and contains(.,'Early school age')]")
	private WebElement EarlySchoolAge;
	@FindBy(xpath = "//div[@class='control-label' and contains(.,'School age')]")
	private WebElement SchoolAge;

	public void ableToCareForAgeGroup() {
		for (int i = 1; i <= 4; i++) {
			int ageGroop = getRandomNum(1, 4);
			wait.until(ExpectedConditions.elementToBeClickable(Newborn));
			if (ageGroop == 1) {
				Newborn.click();
			} else if (ageGroop == 2) {
				Toddlers.click();
			} else if (ageGroop == 3) {
				EarlySchoolAge.click();
			} else {
				SchoolAge.click();
			}
		}
	}

	@FindBy(xpath = "//*[@class='btn btn-primary-1 btn-next-step' and @data-next-step='14']//*[text()='Next']") // *[@id="child-care-container"]/div[4]/div[4]/div/button
	private WebElement Next2; // *[@id="child-care-container"]/div[4]/div[4]/div/button

	public void next2() {
		Next2.click(); // *[@id=\"child-care-container\"] | /span[contains(.,'Next')] "
	}

	@FindBy(xpath = "//div[@class='selectors']//label//span[contains(text(),'Comfortable with pets')] ")
	private WebElement ComfortableWithPetsCC;
	@FindBy(xpath = "//div[@class='selectors']//label//span[contains(text(),'CPR/First Aid trained')] ")
	private WebElement CPRFirstAidTrainedCC;
	@FindBy(xpath = "//div[@class='selectors']//label//span[contains(text(),'Has own transportation')] ")
	private WebElement HasownTransportationCC;
	@FindBy(xpath = "//div[@class='selectors']//label//span[contains(text(),'Non-smoker')] ")
	private WebElement Non_smokerCC;
	@FindBy(xpath = "//div[@class='selectors']//label//span[contains(text(),'College educated')] ")
	private WebElement CollegeEducatedCC;

	public void whatAreOtherMust_havesForYourCaregiverCC() {
		for (int i = 1; i <= 4; i++) {
			int mustHaves = getRandomNum(1, 5);
			wait.until(ExpectedConditions.elementToBeClickable(ComfortableWithPetsCC));
			if (mustHaves == 1) {
				ComfortableWithPetsCC.click();
			} else if (mustHaves == 2) {
				CPRFirstAidTrainedCC.click();
			} else if (mustHaves == 3) {
				HasownTransportationCC.click();
			} else if (mustHaves == 4) {
				Non_smokerCC.click();
			} else {
				CollegeEducatedCC.click();
			}
		}
	}

	@FindBy(xpath = "//*[@class='btn btn-primary-1 btn-next-step' and @data-next-step='15']//*[text()='Next']") // *[@id="child-care-container"]/div[5]/div[3]/div/button/span
	private WebElement Next3;

	public void next3() {
		wait.until(ExpectedConditions.elementToBeClickable(Next3));
		Next3.click();
	}

	@FindBy(name = "seekerZip")
	private WebElement SeekerZipCC;

	public void seekerZipCC(String s) {
		wait.until(ExpectedConditions.elementToBeClickable(SeekerZipCC));

		SeekerZipCC.click();
		SeekerZipCC.clear();
		SeekerZipCC.sendKeys(s);
		// *[@id="senior-care-container"]/div[6]/div[2]/div[1]/input
	}

	@FindBy(xpath = "//*[@class='btn btn-primary-1 btn-next-step zip-loc-btn' and @data-next-step='1' and @data-next-type='ACCOUNTCREATION']//*[text()='Next']") // *[@id="child-care-container"]/div[6]/div[3]/div/button
	private WebElement Next4;

	public void next4() {
		wait.until(ExpectedConditions.elementToBeClickable(Next4));
		Next4.click();
	}

	@FindBy(xpath = "//*[@class='btn-stacked']") // *[@id="smartEnrollmentForm"]/div[4]/div[1]/button
	private WebElement CreateAccountSubmit1;

	public void createAccountSubmit1cc() {
		wait.until(ExpectedConditions.elementToBeClickable(CreateAccountSubmit1));
		CreateAccountSubmit1.click();
	}

	@FindBy(xpath = "//*[@name='firstName']")
	private WebElement FirstName;

	public void firstName(String n) {
		FirstName.click();
		FirstName.sendKeys(n);
	}

	@FindBy(xpath = "//*[@name='lastName' and @placeholder='Last name']")
	private WebElement LastName;

	public void lastName(String l) {
		LastName.click();
		LastName.sendKeys(l);
	}

	@FindBy(xpath = "//*[@name='email' and @placeholder='Email address']")
	private WebElement Email;

	public void email(String e) {
		wait.until(ExpectedConditions.elementToBeClickable(Email));
		Email.click();
		Email.clear();
		Email.sendKeys(e);
	}

	@FindBy(xpath = "//*[@name='password' and @placeholder='Password (at least 6 characters)']")
	private WebElement Password;

	public void password(String p) {
		Password.click();
		Password.sendKeys(p);
	}

	@FindBy(xpath = "//*[@name='addressLine1']")
	private WebElement Address;

	public void address(String a) {
		Address.click();
		Address.sendKeys(a);
	}

	@FindBy(xpath = "//*[@class='btn-stacked' ]//*[@type='submit']")
	private WebElement Submit2;

	public void submit2() {
		Submit2.click();
	}

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement Continue1;

	public void continue1() {
		Continue1.click();
	}

	public void createUser(String n, String l, String e, String p) {
		wait.until(ExpectedConditions.elementToBeClickable(FirstName));

		FirstName.click();
		FirstName.sendKeys(n);

		LastName.click();
		LastName.sendKeys(l);

		Email.click();
		Email.clear();
		Email.sendKeys(e);

		Password.click();
		Password.sendKeys(p);

		Submit2.click();

	}

	@FindBy(xpath = "//*[text()='Skip this step']")
	private WebElement SkipThisStep;

	public void skipThisStep() {
		SkipThisStep.click();
	}

	@FindBy(xpath = "//*[@class='control text-center']//*[text()='M'] ")
	private WebElement JobDaysMon;
	@FindBy(xpath = "//label[input[@name='jobDays' and @value='TUE']]")
	private WebElement JobDaysTue;
	@FindBy(xpath = "//*[@class='control text-center']//*[text()='W']")
	private WebElement JobDaysWed;
	@FindBy(xpath = "//*[@class='control text-center']//*[text()='TH']")
	private WebElement JobDaysThu;
	@FindBy(xpath = "//label[input[@name='jobDays' and @value='FRI']]")
	private WebElement JobDaysFri;
	@FindBy(xpath = "//*[@class='control text-center']//*[text()='SA']")
	private WebElement JobDaysSat;
	@FindBy(xpath = "//*[@class='control text-center']//*[text()='SU']")
	private WebElement JobDaysSun;

	public void selectJobDays() {
		int i = getRandomNum(1, 7);
		wait.until(ExpectedConditions.elementToBeClickable(JobDaysSun));
		for (i = 1; i <= 7; i++) {
			int jobDays = getRandomNum(1, 7);
			if (jobDays == 1) {
				JobDaysSun.click();
			} else if (jobDays == 2) {
				JobDaysMon.click();
			} else if (jobDays == 3) {
				JobDaysTue.click();
			} else if (jobDays == 4) {
				JobDaysWed.click();
			} else if (jobDays == 5) {
				JobDaysThu.click();
			} else if (jobDays == 6) {
				JobDaysFri.click();
			} else {
				JobDaysSat.click();
			}
		}
	}

	@FindBy(xpath = "//div[@class='col-xs-3 text-right']/button[1]/span[1] ")
	private WebElement HowManyKidsNeedCare1;

	public void howManyKidsNeedCare1() {
		HowManyKidsNeedCare1.click();
	}

	@FindBy(xpath = "//div[@class='col-sm-8']/div[4]/div[1]/div[3]/button ")
	private WebElement HowManyKidsNeedCare2;

	public void howManyKidsNeedCare2() {
		HowManyKidsNeedCare2.click();
	}

//	@FindBy(xpath = "//*[@class='col-sm-8 other-needs other-needs-block']/div/label/input[@id='lightHousekeeping1']")
	@FindBy(xpath = "//*[@id='pajSpringForm']/div/section[7]/div[2]/div[1]")
	private WebElement SelectYourOtherNeeds1;

	public void lightHousekeeping() {
		SelectYourOtherNeeds1.click();
	}

	@FindBy(xpath = "//*[@class='skip-link-basic']")
	private WebElement SkipAndContinueAsABasicMember;

	public void skipAndContinueAsABasicMember() {
		wait.until(ExpectedConditions.elementToBeClickable(SkipAndContinueAsABasicMember));

		SkipAndContinueAsABasicMember.click();
	}

	/*
	 ******************************************** Senior_Care******************************************
	 **************************************************************************************************
	 **/

	public void ourFastestWayToFindYourPerfectCaregiverPageSC() {
		selectJobDays();
		scGender();
		ageSelect();
		wait.until(ExpectedConditions.elementToBeClickable(AlzheimersOrDementia));
		additionalCareConcerns();
		wait.until(ExpectedConditions.elementToBeClickable(ourFastestWayToFindYourPerfectCaregiverPageSubmit));
		ourFastestWayToFindYourPerfectCaregiverPageSubmit.click();

	}

	public void whatElseWouldMakeForAnIdealCaregiver() {
		minExperienceForSC();
		wait.until(ExpectedConditions.elementToBeClickable(CompanionCare));
		ableToProvideServices();

	}

	@FindBy(xpath = "//div[@id='who-care']/label[1]//span")
	private WebElement myParent;
	@FindBy(xpath = "//div[@id='who-care']//label[2]//span")
	private WebElement mySpouse;
	@FindBy(xpath = "//div[@id='who-care']//label[3]//span")
	private WebElement myGrandParent;
	@FindBy(xpath = "//div[@id='who-care']//label[4]//span")
	private WebElement myFriendRelative;
	@FindBy(xpath = "//div[@id='who-care']//label[5]//span")
	private WebElement careForMyself;

	public void seniorCareWhoNeedsCare() {
		wait.until(ExpectedConditions.elementToBeClickable(myParent));
		int care = getRandomNum(1, 5);
		if (care == 1) {
			myParent.click();
		} else if (care == 2) {
			mySpouse.click();
		} else if (care == 3) {
			myGrandParent.click();
		} else if (care == 4) {
			myFriendRelative.click();
		} else {
			careForMyself.click();
		}
	}

	@FindBy(xpath = "//div[@id='provide-container']/label/*[contains(.,'Companion Care')]")
	private WebElement CompanionCare;

	@FindBy(xpath = "//div[@id='provide-container']/label/*[contains(.,'Live-in home care')]")
	private WebElement LiveInHomeCare;

	@FindBy(xpath = "//div[@id='provide-container']/label/*[contains(.,'Hands-on care')]")
	private WebElement HandsOnCare;

	public void ableToProvideServices() {
		int serviceName = getRandomNum(1, 3);
		if (serviceName == 1) {
			CompanionCare.click();
		} else if (serviceName == 2) {
			LiveInHomeCare.click();
		} else {
			HandsOnCare.click();
		}
	}

	@FindBy(xpath = "//*[@id='senior-care-container']//span[contains(.,'Any')]")
	private WebElement MinExperienceAnySC;
	@FindBy(xpath = "//*[@id='senior-care-container']//span[contains(.,'3+')]")
	private WebElement MinExperience3PlusSC;
	@FindBy(xpath = "//*[@id='senior-care-container']//span[contains(.,'5+')]")
	private WebElement MinExperience5PlusSC;
	@FindBy(xpath = "//*[@id='senior-care-container']//span[contains(.,'7+')]")
	private WebElement MinExperience7PlusSC;

	public void minExperienceForSC() {
		int minExp = getRandomNum(1, 4);
		wait.until(ExpectedConditions.elementToBeClickable(MinExperienceAnySC));
		if (minExp == 1) {
			MinExperienceAnySC.click();
		} else if (minExp == 2) {
			MinExperience3PlusSC.click();
		} else if (minExp == 3) {
			MinExperience5PlusSC.click();
		} else {
			MinExperience7PlusSC.click();
		}

	}

	@FindBy(xpath = "//*[@id=\"senior-care-container\"]//span[contains(.,'Comfortable with pets')] ")
	private WebElement ComfortableWithPetsSC;
	@FindBy(xpath = "//*[@id=\"senior-care-container\"]//span[contains(.,'CPR/First Aid trained')] ")
	private WebElement CPRFirstAidTrainedSC;
	@FindBy(xpath = "//*[@id=\"senior-care-container\"]//span[contains(.,'Has own transportation')]")
	private WebElement HasownTransportationSC;
	@FindBy(xpath = "//*[@id=\"senior-care-container\"]//span[contains(.,'Non-smoker')] ")
	private WebElement Non_smokerSC;
	@FindBy(xpath = "//*[@id=\"senior-care-container\"]//span[contains(.,'Certified nursing assistant')] ")
	private WebElement CertifiedNursingAssistantSC;

	public void whatAreOtherMust_havesForYourCaregiverSC() {
		for (int i = 1; i <= 4; i++) {
			int mustHaves = getRandomNum(1, 5);
			wait.until(ExpectedConditions.elementToBeClickable(ComfortableWithPetsSC));
			if (mustHaves == 1) {
				ComfortableWithPetsSC.click();
			} else if (mustHaves == 2) {
				CPRFirstAidTrainedSC.click();
			} else if (mustHaves == 3) {
				HasownTransportationSC.click();
			} else if (mustHaves == 4) {
				Non_smokerSC.click();
			} else {
				CertifiedNursingAssistantSC.click();
			}
		}
	}

	@FindBy(xpath = "//*[@id='senior-care-container']//*[@name='seekerZip']")
	private WebElement SeekerZipSC;

	public void seekerZipSC(String sc) {
		wait.until(ExpectedConditions.elementToBeClickable(SeekerZipSC));
		SeekerZipSC.click();
		SeekerZipSC.clear();
		SeekerZipSC.sendKeys(sc);
	}

//	public void ageSelect() throws InterruptedException {
//		String[] ageArray = { "30s", "40s", "50s", "60s", "70s", "80s", "90s" };
//		String random = ageArray[new Random().nextInt(ageArray.length)];

//		Select age = new Select(driver.findElement(By.id("personType")));
//		age.selectByVisibleText("random");

	@FindBy(xpath = "//*[@id='personType']")
	private WebElement ageClick;

	public void ageSelect() {
		Actions action = new Actions(getDriver());
		action.moveToElement(ageClick).build().perform();
		Select age = new Select(ageClick);
		int a = getRandomIndex(1, 7);
		if (a == 1) {
			age.selectByValue("SCNRAGE001");
		} else if (a == 2) {
			age.selectByValue("SCNRAGE002");
		} else if (a == 3) {
			age.selectByValue("SCNRAGE003");
		} else if (a == 4) {
			age.selectByValue("SCNRAGE004");
		} else if (a == 5) {
			age.selectByValue("SCNRAGE005");
		} else if (a == 6) {
			age.selectByValue("SCNRAGE006");
		} else {
			age.selectByValue("SCNRAGE007");
		}
	}

	@FindBy(xpath = "//*[contains(@id,'seniorPAJSpringForm')]/div[1]/section[5]/div[2]/div[6]/label[1]/span[1]")
	private WebElement scMale;

	@FindBy(xpath = "//*[contains(@id,'seniorPAJSpringForm')]/div[1]/section[5]/div[2]/div[6]/label[2]/span[1]")
	private WebElement scFemale;

	public void scGender() {
		int k = getRandomIndex(1, 2);
		if (k == 1) {
			scMale.click();
		} else {
			scFemale.click();
		}
	}

	@FindBy(xpath = "//div[@class='col-sm-8 other-needs additional-concerns']//div[1]")
	private WebElement AlzheimersOrDementia;
	@FindBy(xpath = "//div[@class='col-sm-8 other-needs additional-concerns']//div[2]")
	private WebElement ConstantSupervision;
	@FindBy(xpath = "//div[@class='col-sm-8 other-needs additional-concerns']//div[3]")
	private WebElement Mobility;

	public void additionalCareConcerns() {
//		Thread.sleep(2000);
//		String help = "//*[contains(@id,'seniorPAJSpringForm')]/div[1]/section[8]/div[2]/div[";
//		for (int n = 1; n <= 2; n++) {
//			int helpneed = getRandomnumberIndex(1, 3);
//			WebElement add = driver.findElement(By.xpath(help + helpneed + "]/label/span[1]/span"));
//			isSelected(add);
//	}
		int i = getRandomIndex(1, 3);
		for (i = 1; i <= 3; i++) {
			int j = getRandomIndex(1, 3);
			if (j == 1) {
				AlzheimersOrDementia.click();
			} else if (j == 2) {

				ConstantSupervision.click();
			} else
				Mobility.click();
		}

	}

	@FindBy(xpath = "//*[@name='_eventId_success']")
	private WebElement ourFastestWayToFindYourPerfectCaregiverPageSubmit;

//	@FindBy(name = "scAge")
//	private WebElement seniorsAgeV2;
//
//	@FindBy(name = "scRelation")
//	private WebElement seniorsRelationV2;
//
//	public void selectSCDropDownV2() throws InterruptedException {
//		Thread.sleep(3000);
//		selectDropDownByIndex(seniorsAgeV2);
//		Thread.sleep(3000);
//		selectDropDownByIndex(seniorsRelationV2);
//	}
//
//	public void selectDropDownByIndex(WebElement element) {
//		Select dd = new Select(element);
//		List<WebElement> options = element.findElements(By.tagName("option"));
//		int p = getRandomNum(2, (options.size() - 1));
//		dd.selectByIndex(p);
//	}

	/*
	 * ****************************************Upgrade******************************
	 * 
	 */

	public void upgrade(String n, String b, String c, String d, String e) throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(cardNumber));
		cardNumber.sendKeys(n);
		creditcardExpDate.sendKeys(b);
		cvv.sendKeys(c);
		addres.sendKeys(d);
		dobTextBox.sendKeys(e);
//		wait.until(ExpectedConditions.elementToBeClickable(upgradeButton));
		Thread.sleep(2000);
		upgradeButton.click();

	}

	public void scupgrade(String n, String b, String c, String d, String e) throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(cardNumber));
		cardNumber.sendKeys(n);
		creditcardExpDate.sendKeys(b);
		cvv.sendKeys(c);
		addres.sendKeys(d);
		dobTextBox.sendKeys(e);
//		wait.until(ExpectedConditions.elementToBeClickable(upgradeButton));
		Thread.sleep(2000);
		scupgradeButton.click();

	}

	public void exclusiveBGCAndAddOnAndPremiunMemberPages() {

		wait.until(ExpectedConditions.elementToBeClickable(AddToSubscription));
		AddToSubscription.click();

		wait.until(ExpectedConditions.elementToBeClickable(ImportantNoticeAboutCriminalRecordsInMassachusettsGotItBtn));
		ImportantNoticeAboutCriminalRecordsInMassachusettsGotItBtn.click();

		wait.until(ExpectedConditions.elementToBeClickable(NoThanksAddOn));
		NoThanksAddOn.click();

		wait.until(ExpectedConditions.elementToBeClickable(PremiunSekBtn));
		PremiunSekBtn.click();

		/*
		 * in upgrade member page if one month plan is selected then a new page will
		 * occour in this flow ----------------- (HEADLINE OF THE PAGE------>(Paying for
		 * senior care is easier when you're prepared.)---------- (No Thanks button))
		 * xpath----> //*[@class='next-step-url' and @rel='nofollow']
		 * 
		 */

		wait.until(ExpectedConditions.elementToBeClickable(SkipUploadAPhoto));
		SkipUploadAPhoto.click();

		wait.until(ExpectedConditions.elementToBeClickable(TipsToHireWithConfidenceSkip));
		TipsToHireWithConfidenceSkip.click();
	}

	@FindBy(xpath = "//*[@class='pricingDescRadio']//*[@id='annual']")
	private WebElement annualPlan;
	@FindBy(xpath = "//*[@class='pricingDescRadio']//*[@id='threeMonth']")
	private WebElement threemonthPlan;

//	@FindBy(xpath = "//*[@id='oneMonth'] | //*[@id='activePricing']/div/div[2]/div/div[3]/div[2]")
	@FindBy(xpath = "//*[@class='pricingDescRadio']//*[@id='oneMonth']")
	private WebElement onemonthPlan;
//	@FindBy(xpath = "//*[contains(@id,'singlePageEnrollmentForm')]/div[6]/div[1]/span/a")
//
	@FindBy(xpath = "//*[@id='singlePageEnrollmentForm']//*[@class='submitStepOne onSelectStepTwo'] OR //*[@id='vis_enroll_mem_plan_test']/div[7]/div[1]/a")
	private WebElement Submitplan;

	@FindBy(name = "billingZIP")
	private WebElement billingZIP;
	@FindBy(name = "cvv")
	private WebElement cvv;
	@FindBy(name = "cardNumber")
	private WebElement cardNumber;
	@FindBy(xpath = ".//*[@id='expDate']")
	private WebElement creditcardExpDate;
	@FindBy(xpath = "//input[@id='dateOfBirth']")
	private WebElement dobTextBox;
	@FindBy(xpath = "//*[@class='upgradeBtnUpdated upgradeBtn' and @id='sekNextBtnImg' OR //*[@id='upgradeBtn']")
	private WebElement upgradeButton;
	@FindBy(xpath = "//input[@id='addressLine1']")
	private WebElement addres;

	@FindBy(xpath = "//span[contains(.,'Add to subscription')]")
	private WebElement AddToSubscription;
	@FindBy(xpath = "//*[@id='subscriptionFeatureAddOnForm']//a[contains(.,'No thanks')]")
	private WebElement NoThanksAddOn;

	@FindBy(xpath = "//*[@class='sekNextBtnImg']")
	private WebElement PremiunSekBtn;

	@FindBy(xpath = "//span[contains(.,'Got it')]")
	private WebElement ImportantNoticeAboutCriminalRecordsInMassachusettsGotItBtn;

	@FindBy(xpath = "//a[contains(.,'skip this step')]")
	private WebElement SkipUploadAPhoto;

	@FindBy(xpath = "//a[contains(.,'skip this step')]")
	private WebElement TipsToHireWithConfidenceSkip;

	public void upgradeMember() throws InterruptedException {
		int planType = getRandomNum(1, 3);
//		wait.until(ExpectedConditions.elementToBeClickable(annualPlan));
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
		if (planType == 1) {
			annualPlan.click();
//			wait.until(ExpectedConditions.elementToBeClickable(Submitplan));
//			jsExecutor.executeScript("arguments[0].click();", Submitplan);
			logger.info("annual Plan has been selected");
			Thread.sleep(2000);
			Submitplan.click();
			upgrade("4111111111111111", "092030", "000", "walthem", "09031989");

		}

		else if (planType == 2) {
//			threemonthPlan.click();
//			wait.until(ExpectedConditions.elementToBeClickable(annualPlan));
//			jsExecutor.executeScript("arguments[0].click();", Submitplan);
			logger.info("three month Plan has been selected");
			Thread.sleep(2000);
			Submitplan.click();
			upgrade("4111111111111111", "092030", "000", "walthem", "09031989");

		}

		else {
			onemonthPlan.click();
//			wait.until(ExpectedConditions.elementToBeClickable(Submitplan));
//			jsExecutor.executeScript("arguments[0].click();", Submitplan);
			logger.info("one month Plan has been selected");
			Thread.sleep(2000);
			Submitplan.click();
			upgrade("4111111111111111", "092030", "000", "walthem", "09031989");

		}
	}

	@FindBy(xpath = "//*[@id='vis_enroll_mem_plan_test']/div[7]/div[1]/a")
	private WebElement scSubmitplan;
	@FindBy(xpath = "//*[@id='upgradeBtn']")
	private WebElement scupgradeButton;

	public void scupgradeMember() throws InterruptedException {
		int planType = getRandomNum(1, 3);
		wait.until(ExpectedConditions.elementToBeClickable(annualPlan));
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
		if (planType == 1) {
			annualPlan.click();
			wait.until(ExpectedConditions.elementToBeClickable(scSubmitplan));
//			jsExecutor.executeScript("arguments[0].click();", scSubmitplan);
			logger.info("annual Plan has been selected");
//			Thread.sleep(2000);
			scSubmitplan.click();
			scupgrade("4111111111111111", "092030", "000", "walthem", "09031989");

		}

		else if (planType == 2) {
//			threemonthPlan.click();
			wait.until(ExpectedConditions.elementToBeClickable(annualPlan));
//			jsExecutor.executeScript("arguments[0].click();", scSubmitplan);
			logger.info("three month Plan has been selected");
//			Thread.sleep(2000);
			scSubmitplan.click();
			scupgrade("4111111111111111", "092030", "000", "walthem", "09031989");

		}

		else {
			onemonthPlan.click();
			wait.until(ExpectedConditions.elementToBeClickable(scSubmitplan));
//			jsExecutor.executeScript("arguments[0].click();", scSubmitplan);
			logger.info("one month Plan has been selected");
//			Thread.sleep(2000);
			scSubmitplan.click();
			scupgrade("4111111111111111", "092030", "000", "walthem", "09031989");

		}
	}
	/*
	 * ***************************************************Pet_Care******************
	 * ** ************************************************
	 */

	@FindBy(xpath = "//*[@class='control-label pull-left' and contains(.,'Dogs ')]")
	private WebElement dogs;
	@FindBy(xpath = "//*[@class='control-label pull-left' and contains(.,'Cats')]")
	private WebElement cats;
	@FindBy(xpath = "//*[@class='control-label pull-left' and contains(.,'Other')]")
	private WebElement otherPets;
	@FindBy(xpath = "//*[@id='ideal-pc-btn-validate']//span[contains(.,'Next')]")
	private WebElement SelectPetsNext;

	public void selectPets() {
		int animal = getRandomNum(1, 3);
		wait.until(ExpectedConditions.elementToBeClickable(cats));
		if (animal == 1) {
			dogs.click();
		} else if (animal == 2) {
			cats.click();
		} else {
			otherPets.click();
		}

		SelectPetsNext.click();
	}

//	public void petNeeds() throws InterruptedException {
//		Thread.sleep(2000);
//		String needs = "//*[contains(@id,'who-pet-care')]/label[";
//		for (int o = 1; o <= 2; o++) {
//			int pets = getRandomnumberIndex(1, 5);
//			WebElement addser = driver.findElement(By.xpath(needs + pets + "]/div[1]"));
//			isSelected(addser);
//		}
//	}

	@FindBy(xpath = "//*[contains(@id,'who-pet-care')]/label[1]/div[1]")
	private WebElement SittingPC;
	@FindBy(xpath = "//*[contains(@id,'who-pet-care')]/label[2]/div[1]")
	private WebElement BoardingPC;
	@FindBy(xpath = "//*[contains(@id,'who-pet-care')]/label[3]/div[1]")
	private WebElement WalkingPC;
	@FindBy(xpath = "//*[contains(@id,'who-pet-care')]/label[4]/div[1]")
	private WebElement GroomingPC;
	@FindBy(xpath = "//*[contains(@id,'who-pet-care')]/label[5]/div[1]")
	private WebElement TrainingPC;
	@FindBy(xpath = "//*[@id=\"pc-who-needs-btn-validate\"]/span")
	private WebElement PetsNeedsNext;

	public void petNeeds() {
		int type = getRandomNum(1, 5);
		wait.until(ExpectedConditions.elementToBeClickable(SittingPC));
		if (type == 1) {
			SittingPC.click();
		} else if (type == 2) {
			BoardingPC.click();
		} else if (type == 3) {
			WalkingPC.click();
		} else if (type == 4) {
			GroomingPC.click();
		} else {
			TrainingPC.click();
		}
		PetsNeedsNext.click();
	}

	@FindBy(xpath = "//*[@id='pet-care-container']//*[@name='seekerZip']")
	private WebElement SeekerZipPC;

	@FindBy(xpath = "//*[@id='pc-zip-btn-block']/button")
	private WebElement SeekerZipPCNext;

	public void seekerZipPCNext() {
		wait.until(ExpectedConditions.elementToBeClickable(SeekerZipPCNext));
		SeekerZipPCNext.click();
	}

	public void seekerZipPC(String pc) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(SeekerZipPC));
		SeekerZipPC.click();
		SeekerZipPC.clear();
		SeekerZipPC.sendKeys(pc);
	}

	@FindBy(id = "pajSubmit")
	private WebElement pajSubmit;

	public void pajSubmit() {
		wait.until(ExpectedConditions.elementToBeClickable(pajSubmit));
		pajSubmit.click();
	}

	/******************************************
	 * MY_HOME
	 *****************************************/

	@FindBy(xpath = "//*[contains(@id,'house-keeping-container')]/div[3]/div[2]/div/div[1]/div/div[3]/button/span/span")
	private WebElement hkBedPlus;
	@FindBy(xpath = "//*[contains(@id,'house-keeping-container')]/div[3]/div[2]/div/div[2]/div/div[1]/button/span/span")
	private WebElement hkBathroomMinus;

	public void howManyBedroomsAndBathRooms() {
		int no = getRandomIndex(1, 2);
		wait.until(ExpectedConditions.elementToBeClickable(hkBedPlus));
		if (no == 1) {
			hkBedPlus.click();
		} else {
			hkBathroomMinus.click();
		}
	}

	@FindBy(xpath = "//*[contains(@id,'house-keeping-container')]/div[3]/div[3]/div/label[1]/span/span")
	private WebElement hkSupplies;
	@FindBy(xpath = "//*[contains(@id,'house-keeping-container')]/div[3]/div[3]/div/label[2]/span/span")
	private WebElement hkEquipments;

	public void whatShouldYourHouseKeeperBring() throws InterruptedException {
		int no = getRandomIndex(1, 2);
		if (no == 1) {
			hkSupplies.click();
		} else {
			hkEquipments.click();
		}

	}

	@FindBy(xpath = "//span[contains(.,'Furniture treatment')]")
	private WebElement hkFurnitureTreatment;
	@FindBy(xpath = "//span[contains(.,'Kitchen cleaning')]")
	private WebElement hkKitchenCleaning;
	@FindBy(xpath = "//span[contains(text(),'Bathroom cleaning')]")
	private WebElement hkBathroomCleaning;
	@FindBy(xpath = "//span[contains(text(),'Window washing')]")
	private WebElement hkWindowWash;
	@FindBy(xpath = "//span[contains(text(),'Laundry')]")
	private WebElement hkLaundry;
	@FindBy(xpath = "//span[contains(.,'General room cleaning')]")
	private WebElement hkGeneralRoomCleaning;
	@FindBy(xpath = "//span[contains(.,'Carpet shampooing')]")
	private WebElement hkCarpetShampooing;

	public void whatTasksDoYouExpectYourHousekeeperToCompletePage() {
		int task = getRandomIndex(1, 7);
		wait.until(ExpectedConditions.elementToBeClickable(hkBathroomCleaning));
		if (task == 1) {
			hkBathroomCleaning.click();
		} else if (task == 2) {
			hkKitchenCleaning.click();
		} else if (task == 3) {
			hkGeneralRoomCleaning.click();
		} else if (task == 4) {
			hkWindowWash.click();
		} else if (task == 5) {
			hkCarpetShampooing.click();
		} else if (task == 6) {
			hkFurnitureTreatment.click();
		} else {
			hkLaundry.click();
		}

	}

	@FindBy(xpath = "//*[@id='house-keeping-container']//*[@name='seekerZip']")
	private WebElement SeekerZipHK;

	@FindBy(xpath = "//*[@id='house-keeping-container']//*[@data-next-step='1']//span[contains(.,'Next')]")
	private WebElement SeekerZipHKNext;

	public void seekerZipHK(String hk) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(SeekerZipHK));
		SeekerZipHK.click();
		SeekerZipHK.clear();
		SeekerZipHK.sendKeys(hk);
		Thread.sleep(1000);
//		wait.until(ExpectedConditions.elementToBeClickable(SeekerZipHKNext));
		SeekerZipHKNext.click();
	}

	@FindBy(id = "job-description")
	private WebElement description;
	@FindBy(xpath = ".//*[@id='textarea']")
	private WebElement jobTitle;

	public void hkjobTitle() {
		jobTitle.click();
		jobTitle.sendKeys("Posting a job from housekeeping");
	}

	public void hkdescription() {
		description.click();
		description.sendKeys("Posting a job from housekeepingPosting a job from housekeepingPosting a job "
				+ "from housekeepingPosting a job from housekeeping");

	}

	public void ourFastestWayToFindYourPerfectCaregiverPageHK() {
		selectJobDays();
		hkjobTitle();
		hkdescription();
		pajSubmit();
	}

	public int getRandomNum(int mn, int mx) {
		int p = 0;
		int i;
		for (i = 0; i < 1; i++) {
			int min = mn;
			int max = mx;
			p = ((int) (Math.random() * (max - min + 1)) + min);
		}
		return p;
	}

	public int getRandomIndex(int mn, int mx) {
		int p = 0;
		for (int i = 0; i < 1; i++) {
			int min = mn;
			int max = mx;
			p = ((int) (Math.random() * (max - min + 1)) + min);
		}
		return p;
	}

	public int getRandomnumberIndex(int minimum, int maximum) {
		int p = 0;
		for (int i = 0; i < 1; i++) {
			int min = minimum;
			int max = maximum;
			p = ((int) (Math.random() * (max - min + 1)) + min);

		}
		return p;
	}

	public void isSelected(WebElement ele) {
		if (!(ele.isSelected())) {
			ele.click();
		}
	}
}