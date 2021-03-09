package am.itu.qa.stepstone.search.test;

import org.testng.annotations.Test;

import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;
import am.itu.qa.stepstone.search.page.StepStoneBestWorkPlacesInMunichPage;
import am.itu.qa.stepstone.search.page.StepStoneSearchResultBMW;

public class StepStoneBMWCompanyMainTest extends StepStoneBaseTest{

	@Test
	public void searchForVacancesInBMW() throws InterruptedException {
		System.out.println("     ");
		System.out.println("--1--ACCEPTS COOKIES");
		System.out.println("     ");
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--2--GO TO 'BEST WORKPLACES' PAGE");
		System.out.println("     ");
		StepStoneBestWorkPlacesInMunichPage bestWork = homePage.clickOnBestWorkplaces();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--3--CHOOSE THE CITY 'MUNICH' TO SHOW 10 BEST COMPANIES");
		System.out.println("     ");
		bestWork.selecCityFortBestWorkPlaces();
		Thread.sleep(6000);
		
		System.out.println("     ");
		System.out.println("--4--CLICK ON 'BMW' LINK");
		System.out.println("     ");
		StepStoneSearchResultBMW bmwPage = bestWork.clickOnBMWLink();
		Thread.sleep(5000);
		

		System.out.println("     ");
		System.out.println("--5--CLICK ON 'SHOW MORE' TO READ FULL INFORMATION ABOUT");
		System.out.println("     ");
		bmwPage.showMore();
		Thread.sleep(3000);
		
		System.out.println("     ");
		System.out.println("--6--CLICK ON 'BMW' COMPANY VIDEO");
		System.out.println("     ");
		bmwPage.watchBmwVideo();
		Thread.sleep(8000);
		
	}
	
}
