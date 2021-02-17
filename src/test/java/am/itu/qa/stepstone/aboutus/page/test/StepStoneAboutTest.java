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
		System.out.println("First of all ACCEPTS COOKIES");
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);

		System.out.println("Then clicks on 'WHO IS STEPSTONE' button to read about the mission of the company");
		StepStoneAboutPage aboutPage = homePage.clickOnWhoIsStepstone();
		Thread.sleep(4000);
		
		System.out.println("Dismiss thrown cookies to be able to read timeline of the company");
		aboutPage.dismissCookies();
		StepStoneAboutTimeLinePage timeLinePage = aboutPage.clickOnOurHistory();
		Thread.sleep(5000);
		
		System.out.println("Clicks on 'Management' link to read about managing staff");
		StepStoneManagementPage management = timeLinePage.clickOnManagementLink();
		Thread.sleep(3000);

		System.out.println("Then clicks on CEO to read about more information");
		StepStoneCEOPage ceo = management.viewCEOPage();
		Thread.sleep(2000);
		
		System.out.println("After checking CEO's position clicks on 'Next' btn to read about CFO and then goes again back to CEO");
		StepStoneCFOPage cfo = ceo.clickNextBtn();
		Thread.sleep(2000);
		cfo.backToList();
		
		System.out.println("Then goes to 'Contact' to check how to connect with");
		StepStoneContactsPage contactsPage = management.clickOnContactLink();
		Thread.sleep(3000);
		
		System.out.println("Clicks on 'Finding Job' to receive notifications about the appropriate jobe");
		contactsPage.chooseFindingJobToReceiveMoreInformation();
		Thread.sleep(3000);
		
		System.out.println("Types in textarea about the necessary help");
		contactsPage.sendDetailsAboutPreferences("I would like to receive more appropriate information");
		Thread.sleep(8000);
		
		System.out.println("Clicks on 'Send request' button");
		contactsPage.sendRequest();
	}
	
}
