package am.itu.qa.stepstone.home.page.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneExploreSalariesInGermanTest extends StepStoneBaseTest {

	@Test
	public void exploreGermanSalaries() throws InterruptedException {
		// 1. Accepts cookies
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();

		// 2. click on right btn to explore salaries in Germany on home page
		homePage.exploreAvgSalaryInGermany();
		Thread.sleep(8000);
		// 3. assert that cook salary is displayed
		Assert.assertTrue(homePage.isCookSalaryDisplayed());
	}

}
