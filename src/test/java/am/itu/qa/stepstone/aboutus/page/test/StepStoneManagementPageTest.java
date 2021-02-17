package am.itu.qa.stepstone.aboutus.page.test;

import org.testng.annotations.Test;

import am.itu.qa.stepstone.about.page.StepStoneAboutPage;
import am.itu.qa.stepstone.about.page.StepStoneCEOPage;
import am.itu.qa.stepstone.about.page.StepStoneCFOPage;
import am.itu.qa.stepstone.about.page.StepStoneManagementPage;
import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneManagementPageTest extends StepStoneBaseTest {

	@Test
	public void goToManagementList() throws InterruptedException {
		// 1.Accept the cookies
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);

		// 2. Clicks on "Who is StepStone" button
		StepStoneAboutPage aboutPage = homePage.clickOnWhoIsStepstone();
		Thread.sleep(5000);

		// 3. Clicks on "Management"
		StepStoneManagementPage management = aboutPage.clickOnManagementLink();
		Thread.sleep(2000);

		// 4. Dismiss cookies and clicks on CEO of StepStone
		management.dismissCookies();
		Thread.sleep(2000);
		StepStoneCEOPage ceo = management.viewCEOPage();
		Thread.sleep(5000);
	
		// 5. Clicks on "Next" btn, then "back to list"
		StepStoneCFOPage cfo = ceo.clickNextBtn();
		Thread.sleep(2000);
		cfo.backToList();
	}

}
