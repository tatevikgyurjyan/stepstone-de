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
		System.out.println("--1--First of all ACCEPTS COOKIES");
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);

		System.out.println("--2--Then clicks on 'WHO IS STEPSTONE' button to read about the mission of the company");
		StepStoneAboutPage aboutPage = homePage.clickOnWhoIsStepstone();
		Thread.sleep(4000);
		
		System.out.println("--3--Dismiss thrown cookies to be able to read timeline of the company");
		aboutPage.dismissCookies();
		StepStoneAboutTimeLinePage timeLinePage = aboutPage.clickOnOurHistory();
		Thread.sleep(5000);
		
		System.out.println("--4--Clicks on 'Management' link to read about managing staff");
		StepStoneManagementPage management = timeLinePage.clickOnManagementLink();
		Thread.sleep(3000);

		System.out.println("--5--Then clicks on CEO to read about more information");
		StepStoneCEOPage ceo = management.viewCEOPage();
		Thread.sleep(2000);
		
		System.out.println("--6--After checking CEO's position clicks on 'Next' btn to read about CFO and then goes again back to CEO");
		StepStoneCFOPage cfo = ceo.clickNextBtn();
		Thread.sleep(2000);
		cfo.backToList();
		
		System.out.println("--7--Then goes to 'Contact' to check how to connect with");
		StepStoneContactsPage contactsPage = management.clickOnContactLink();
		Thread.sleep(3000);
		
		System.out.println("--8--Clicks on 'Finding Job' to receive notifications about the appropriate job");
		contactsPage.chooseFindingJobToReceiveMoreInformation();
		Thread.sleep(3000);
		
		System.out.println("--9--Types in textarea about the necessary help");
		contactsPage.sendDetailsAboutPreferences("I would like to receive more appropriate information");
		Thread.sleep(8000);
		
		System.out.println("--10--Clicks on 'Send request' button");
		contactsPage.sendRequest();
	}
	
}
