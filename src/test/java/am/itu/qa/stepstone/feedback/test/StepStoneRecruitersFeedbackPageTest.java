package am.itu.qa.stepstone.feedback.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.feedback.page.StepStoneLeavingFeedbackOnRecruitersPage;
import am.itu.qa.stepstone.home.page.StepStoneGermanHomePage;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneRecruitersFeedbackPageTest extends StepStoneBaseTest{

	@Test
	public void leaveFeedbackInRecruitersPage() throws InterruptedException {
		System.out.println("     ");
		System.out.println("--1--ACCEPTS COOKIES");
		System.out.println("     ");
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);

		System.out.println("     ");
		System.out.println("--2--CHANGES LANGUAGE FROM ENGLISH TO GERMAN");
		System.out.println("     ");
		StepStoneGermanHomePage germanPage = homePage.changeLanguageToGerman();
		Thread.sleep(2000);

		System.out.println("     ");
		System.out.println("--3--ASSURES THAT PAGE IS TRANSLATED INTO GERMAN");
		System.out.println("     ");
		Assert.assertTrue(germanPage.isArbeitGeberLinkPresent());
		Thread.sleep(3000);

		System.out.println("     ");
		System.out.println("--4--CHANGES LANGUAGE BACK TO ENGLISH");
		System.out.println("     ");
		germanPage.changeLanguageToEnglish();

		System.out.println("     ");
		System.out.println("--5--NAVIGATES TO 'RECRUITERS' PAGE");
		System.out.println("     ");
		StepStoneLeavingFeedbackOnRecruitersPage feedBackPage = homePage.clickRecruitersLink();
		Thread.sleep(8000);

		System.out.println("     ");
		System.out.println("--6--CLICKS ON 'FEEDBACK' BTN TO LEAAVE FEEBACK ABOUT PAGE");
		System.out.println("     ");
		feedBackPage.leaveFeedback();
		Thread.sleep(2000);

	}

}
