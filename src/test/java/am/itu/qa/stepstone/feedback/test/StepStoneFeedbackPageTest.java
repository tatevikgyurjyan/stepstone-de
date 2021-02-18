package am.itu.qa.stepstone.feedback.test;

import org.testng.annotations.Test;

import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.feedback.page.StepStoneFeedbackPage;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneFeedbackPageTest extends StepStoneBaseTest {

	@Test
	public void giveFeedbackStepStone() throws InterruptedException {
		// 1.Accept the cookies
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);

		// 2. click on "Give us feedback" icon
		StepStoneFeedbackPage feedbackPage = homePage.navigateToFeedbackPage();
		Thread.sleep(8000);
		feedbackPage =  new StepStoneFeedbackPage(driver);
		
		//3. click on the "very good" btn for page simplicity
		feedbackPage.leaveOpinionForSimplicity();
		Thread.sleep(3000);
		
		//4. click on the "very good" btn for page design
		feedbackPage.leaveOpinionForDesign();
		Thread.sleep(3000);
		
		//5. click on the "good" btn for the search relevance
		feedbackPage.leaveOpinionForRelevance();
		Thread.sleep(3000);
		
		//6. type a comment and click on send btn
		feedbackPage
				.leaveComment("The page has quite a simple structure and it's easy to navigate through it. Thank you!");
	}

}
