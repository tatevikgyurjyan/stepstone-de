package am.itu.qa.stepstone.search.test;

import org.testng.annotations.Test;

import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;
import am.itu.qa.stepstone.search.page.StepStoneBestWorkPlacesInMunichPage;
import am.itu.qa.stepstone.search.page.StepStoneSearchResultBMW;

public class StepStoneBMWVideoTest extends StepStoneBaseTest{

	@Test
	public void watchBMWVideo() throws InterruptedException {
	// 1. Accept the thrown cookies
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		//homePage.acceptCookies();
		Thread.sleep(2000);
	//2. Go to "Best workplaces" page
		StepStoneBestWorkPlacesInMunichPage bestWork = homePage.clickOnBestWorkplaces();
		Thread.sleep(2000);
	//3. Choose the city "Munich" to show 10 best companies
		 bestWork.selecCityFortBestWorkPlaces();
		 Thread.sleep(4000);
	//4. Click on BMW link
		 StepStoneSearchResultBMW bmwPage = bestWork.clickOnBMWLink();
		 Thread.sleep(2000);
	//5. Click on BMW video
		bmwPage.showMore();
		Thread.sleep(2000);
		bmwPage.watchBmwVideo();
		Thread.sleep(8000);
	}
}
