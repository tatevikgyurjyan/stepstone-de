package am.itu.qa.stepstone.aboutus.page.test;

import org.testng.annotations.Test;

import am.itu.qa.stepstone.about.page.StepStoneAboutPage;
import am.itu.qa.stepstone.about.page.StepStoneAboutTimeLinePage;
import am.itu.qa.stepstone.about.page.StepStoneCEOPage;
import am.itu.qa.stepstone.about.page.StepStoneCFOPage;
import am.itu.qa.stepstone.about.page.StepStoneContactsPage;
import am.itu.qa.stepstone.about.page.StepStoneManagementPage;
import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneAboutTest extends StepStoneBaseTest{

	@Test
	public void readAboutInfo() throws InterruptedException {
		System.out.println("     ");
		System.out.println("--1--ACCEPTS COOKIES");
		System.out.println("     ");
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);

		System.out.println("     ");
		System.out.println("--2--CLICKS ON 'WHO IS STEPSTONE' BTN TO READ ABOUT THE MISSION OF THE COMPANY");
		System.out.println("     ");
		StepStoneAboutPage aboutPage = homePage.clickOnWhoIsStepstone();
		Thread.sleep(4000);
		
		System.out.println("     ");
		System.out.println("--3--DISMISS THROWN COOKIES TO BE ABLE TO READ TIMELINE OF THE COMPANY");
		System.out.println("     ");
		aboutPage.dismissCookies();
		StepStoneAboutTimeLinePage timeLinePage = aboutPage.clickOnOurHistory();
		Thread.sleep(5000);
		
		System.out.println("     ");
		System.out.println("--4--CLICKS ON 'MANAGEMENT' LINK TO READ ABOUT MANAGING STAFF");
		System.out.println("     ");
		StepStoneManagementPage management = timeLinePage.clickOnManagementLink();
		Thread.sleep(3000);

		System.out.println("     ");
		System.out.println("--5--CLICKS ON CEO TO READ BOUT MORE INFORMATION");
		System.out.println("     ");
		StepStoneCEOPage ceo = management.viewCEOPage();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--6--THEN CLICKS ON 'NEXT' BTN TO READ ABOUT CFO AND THEN GOES BACK AGAIN TO CEO");
		System.out.println("     ");
		StepStoneCFOPage cfo = ceo.clickNextBtn();
		Thread.sleep(2000);
		cfo.backToList();
		
		System.out.println("     ");
		System.out.println("--7--AFTER CLICKS ON 'CONTACT' LINK TO CHECK HOW TO CONNECT WITH");
		System.out.println("     ");
		StepStoneContactsPage contactsPage = management.clickOnContactLink();
		Thread.sleep(3000);
		
		System.out.println("     ");
		System.out.println("--8--CLICKS ON 'FINDING JOB' TO RECEIVE NOTIFICATIONS ABOUT THE APPROPRIATE JOB OFFER");
		System.out.println("     ");
		contactsPage.chooseFindingJobToReceiveMoreInformation();
		Thread.sleep(3000);
		
		System.out.println("     ");
		System.out.println("--9--TYPES IN TEXTAREA ABOUT THE NECESSARY HELP");
		System.out.println("     ");
		contactsPage.sendDetailsAboutPreferences("I would like to receive more appropriate information");
		Thread.sleep(8000);
		
		System.out.println("     ");
		System.out.println("--10--CLICKS ON 'SEND REQUEST' BUTTON");
		System.out.println("     ");
		contactsPage.sendRequest();
	}
	
}
