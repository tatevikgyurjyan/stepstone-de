package am.itu.qa.stepstone.search.test;

import org.testng.annotations.Test;

import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;
import am.itu.qa.stepstone.search.page.StepStoneAdvancedSearchPage;

public class StepStoneAdvancedSearchTest extends StepStoneBaseTest {

	@Test
	public void searchWithAdvancedFields() throws InterruptedException {
		// 1. Accept the thrown cookies
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);

		// 2. Click on Advanced Search Icon
		StepStoneAdvancedSearchPage advSearch = homePage.clickAdvancedSearchIcon();

		// 3. Click all the buttons for detailed search
		advSearch.selectITField();
		advSearch.clickSearchBtn();
		Thread.sleep(2000);
		advSearch.typeEmailToReceiveJobOffers("tgyurjyan@yahoo.com");
	}

}
