package am.itu.qa.stepstone.aboutus.page.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.stepstone.about.page.StepStoneAboutPage;
import am.itu.qa.stepstone.about.page.StepStoneAboutTimeLinePage;
import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneAboutUsPageTest extends StepStoneBaseTest {

	@Test
	public void testAboutUsPage() throws InterruptedException {
		// 1.Accept the cookies
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);

		// 2. Clicks on "Who is StepStone" button
		StepStoneAboutPage aboutPage = homePage.clickOnWhoIsStepstone();
		Thread.sleep(8000);

		// 3. Clicks on "Our History"
		aboutPage.dismissCookies();
		StepStoneAboutTimeLinePage timeLinePage = aboutPage.clickOnOurHistory();
		Thread.sleep(5000);

		// 4. Assures that the heading "Timeline" is displayed
		Assert.assertTrue(timeLinePage.isHeadingTimelinePresent());
		Thread.sleep(2000);
	}
}
