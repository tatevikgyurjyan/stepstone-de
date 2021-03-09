package am.itu.qa.stepstone.home.page.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;
import am.itu.qa.stepstone.search.page.StepStoneAvailableITJobsPage;

public class StepStoneHomePageMainTest extends StepStoneBaseTest{
	
	@Test
	public void exploreGermanSalaries() throws InterruptedException {
		System.out.println("     ");
		System.out.println("--1--ACCEPTS COOKIES");
		System.out.println("     ");
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);

		System.out.println("     ");
		System.out.println("--2--CLICKS ON 'IT' LINK TO CHECK AIAVILABLE IT JOBS");
		System.out.println("     ");
		StepStoneAvailableITJobsPage itJobs = homePage.clickITLink();
		Thread.sleep(6000);
		
		System.out.println("     ");
		System.out.println("--3--CLOSES THROWN POPUP WINDOW");
		System.out.println("     ");
		//itJobs.closePopUp();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--4--CLICKS ON LOGO TO GO TO HOME PAGE");
		System.out.println("     ");
		itJobs.clickLogo();
		
		System.out.println("     ");
		System.out.println("--5--ASSURES THAT THE 'ADVANCED SEARCH' ICON IS DISPLAYED ON THE HOME PAGE");
		System.out.println("     ");
		Assert.assertTrue(homePage.findAdvancedSearch());
		
		System.out.println("     ");
		System.out.println("--6--CLICKS ON RIGHT BTN TO EXPLORE GERMAN SALARIES");
		System.out.println("     ");
		homePage.exploreAvgSalaryInGermany();
		Thread.sleep(8000);
		
		System.out.println("     ");
		System.out.println("--7--ASSERTS THAT 'COOK SALARY' IS DISPLAYED");
		System.out.println("     ");
		Assert.assertTrue(homePage.isCookSalaryDisplayed());
	}

}
