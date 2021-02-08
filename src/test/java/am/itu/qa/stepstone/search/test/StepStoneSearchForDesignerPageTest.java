package am.itu.qa.stepstone.search.test;

import org.junit.Assert;
import org.testng.annotations.Test;

import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;
import am.itu.qa.stepstone.search.page.StepStoneSearchForDesignerPage;

public class StepStoneSearchForDesignerPageTest extends StepStoneBaseTest {

	@Test
	public void searchForDesigner() throws InterruptedException {
		// 1. Accept the thrown cookies
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);
		// 2. Type "Designer Engineer"
		homePage.searchForDesigner("Designer Engineer");
		// 3. Type "Munich" in city search box
		homePage.searchForCity("Munich");
		// 4. change the radius from default 30km to 10km
		homePage.changeJobSearchRadius();
		// 5. check the "Full time" checkbox
		homePage.clickFullTimeJob();
		// 6. click on Find btn
		StepStoneSearchForDesignerPage designerPage = homePage.clickOnFind();
		// 7. close the thrown popup window and assure that on designer search result
		// page
		designerPage.closePopup();
		Assert.assertTrue(designerPage.isSearchKeyWordPresent());
	}

}
