package am.itu.qa.stepstone.search.test;

import org.testng.annotations.Test;

import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;
import am.itu.qa.stepstone.search.page.StepStoneBestWorkPlacesInMunichPage;
import am.itu.qa.stepstone.search.page.StepStoneLeaveReviewPage;
import am.itu.qa.stepstone.search.page.StepStoneSearchResultPageRYTE;

public class StepStoneBestWorkPlacesPageTest extends StepStoneBaseTest {

	@Test
	public void navigateToBestWorkPlaces() throws InterruptedException {
		// 1. Accept the thrown cookies
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);

		// 2. Click on "BestWorkPlaces" icon on home page
		StepStoneBestWorkPlacesInMunichPage bestWork = homePage.clickOnBestWorkplaces();
		Thread.sleep(4000);
		// 3. Select city Munich for top 10 companies
		bestWork.selecCityFortBestWorkPlaces();
		Thread.sleep(6000);
		// 4. Navigate to RYTE page
		StepStoneSearchResultPageRYTE rytePage = bestWork.clickOnRyte();
		Thread.sleep(3000);
		// 5. Show more for "about us"
		rytePage.showMoreAboutUs();
		Thread.sleep(3000);
		// 6. Leave a review for Ryte
		StepStoneLeaveReviewPage leaveReview = rytePage.leaveReviewForRyte();
		Thread.sleep(4000);
		// 7. Select the city, where the company locates
		leaveReview.chooseLocationBestPlaces("Munich, Germany");
		Thread.sleep(4000);
		// 8. Rate and click on "Continue"
		leaveReview.continueReview();
		Thread.sleep(3000);
		leaveReview.rate();
	}

}
