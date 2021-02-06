package am.itu.qa.stepstone.home.page.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;
import am.itu.qa.stepstone.search.page.StepStoneAvailableITJobsPage;

public class StepStoneLogoTest extends StepStoneBaseTest {

	@Test
	public void clickLogoToNavigateHomePage() throws InterruptedException {
		System.out.println("Stepstone.de page is going to be tested!");

		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		// 1. Accept the thrown cookies
		homePage.acceptCookies();
		Thread.sleep(2000);
		// 2. Clicks on IT link
		StepStoneAvailableITJobsPage itJobs = homePage.clickITLink();
		Thread.sleep(6000);
		// 3. Closes the popup window
		itJobs.closePopUp();
		Thread.sleep(2000);
		// 4. Clicks on Logo
		itJobs.clickLogo();
		// 5. Assures that an element "Advance Search" is displayed
		Assert.assertTrue(homePage.findAdvancedSearch());
	}
}
