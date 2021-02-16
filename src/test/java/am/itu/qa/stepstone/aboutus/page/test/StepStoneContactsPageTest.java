package am.itu.qa.stepstone.aboutus.page.test;

import org.testng.annotations.Test;

import am.itu.qa.stepstone.about.page.StepStoneAboutPage;
import am.itu.qa.stepstone.about.page.StepStoneContactsPage;
import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneContactsPageTest extends StepStoneBaseTest {

	@Test
	public void contactWithStepStone() throws InterruptedException {
		// 1.Accept the cookies
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);

		// 2. Clicks on "Who is StepStone" button
		StepStoneAboutPage aboutPage = homePage.clickOnWhoIsStepstone();
		Thread.sleep(3000);

		// 3. Click on "Contact" link and dismiss cookies
		StepStoneContactsPage contactsPage = aboutPage.clickOnContactLink();
		contactsPage.dismissCookies();
		Thread.sleep(3000);
		
		// 4. Click on "Finding jobs" button to receive more information about
		contactsPage.chooseFindingJobToReceiveMoreInformation();
		Thread.sleep(3000);
		
		// 5. Type in textarea "I would like to receive more appropriate jobs!" and
		// press on "Send request" button
		contactsPage.sendDetailsAboutPreferences("I would like to receive more appropriate information");
		Thread.sleep(8000);
		contactsPage.sendRequest();
	}

}
