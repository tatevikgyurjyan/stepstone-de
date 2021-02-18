package am.itu.qa.stepstone.feedback.test;

import org.testng.annotations.Test;

import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.feedback.page.StepStoneFeedbackPage;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneFeedbackTest extends StepStoneBaseTest {

	@Test(priority = 0)
	public void leaveFeedbackForStepStonePage() throws InterruptedException {
		System.out.println("     ");
		System.out.println("--1--ACCEPTS COOKIES");
		System.out.println("     ");
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);

		System.out.println("     ");
		System.out.println("--2--CLICKS ON 'GIVE US FEEDBACK' ICON TO LEAVE FEEDBACK FOR SS PAGE");
		System.out.println("     ");
		StepStoneFeedbackPage feedbackPage = homePage.navigateToFeedbackPage();
		Thread.sleep(8000);
		feedbackPage = new StepStoneFeedbackPage(driver);

		System.out.println("     ");
		System.out.println("--3--CLICKS ON 'VERY GOOD' BTN FOR PAGE SIMPLICITY");
		System.out.println("     ");
		feedbackPage.leaveOpinionForSimplicity();
		Thread.sleep(3000);

		System.out.println("     ");
		System.out.println("--4--CLICKS ON 'VERY GOOD' BTN FOR PAGE DESIGN");
		System.out.println("     ");
		feedbackPage.leaveOpinionForDesign();
		Thread.sleep(3000);

		System.out.println("     ");
		System.out.println("--5--CLICKS ON 'GOOD' BTN FOR SEARCH RELEVANCE");
		System.out.println("     ");
		feedbackPage.leaveOpinionForRelevance();
		Thread.sleep(3000);

		System.out.println("     ");
		System.out.println("--6--TYPES A COMMENT");
		System.out.println("     ");
		feedbackPage
				.leaveComment("The page has a quite simple structure and it's easy to navigate through it. Thank you!");

		System.out.println("     ");
		System.out.println("--7--CLICKS ON LOGO TO GO TO THE HOME PAGE FOR THE NEXT TEST");
		System.out.println("     ");
		homePage = feedbackPage.clickLogo();
	}

}
