package am.itu.qa.stepstone.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;
import am.itu.qa.stepstone.search.page.StepStoneQAEngineerInMuenchenSearch;

public class StepStoneQAJobSearchTest extends StepStoneBaseTest {

	@Test
	public void searchForQAJob() throws InterruptedException {
		System.out.println("Stepstone.de page is going to be tested!");
		// 1. Accept the thrown cookies
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);

		// 2.Search for QA Engineer in Munich
		homePage.searchForQAJob("QA Engineer");
		homePage.searchForCityToWork("Munich");
		StepStoneQAEngineerInMuenchenSearch qaSearchPage = homePage.clickFind();
		Thread.sleep(2000);

		// 3.send notifications on the mentioned email
		qaSearchPage.typeEmailForQAJob("tgyurjyan@yahoo.com");
		Thread.sleep(5000);

		// 4. assure that the element is displayed
		Assert.assertTrue(qaSearchPage.isRelevanceElementPresent());
		Thread.sleep(2000);
	}

}
