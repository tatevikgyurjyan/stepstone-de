package am.itu.qa.stepstone.feedback.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.feedback.page.StepStoneLeavingFeedbackOnRecruitersPage;
import am.itu.qa.stepstone.home.page.StepStoneGermanHomePage;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneLeavingFeedbackTest extends StepStoneBaseTest {

	@Test
	public void leavingFeedback() throws InterruptedException {
		// 1.Accept the cookies
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);

		// 2.Change the language from English to German
		StepStoneGermanHomePage germanPage = homePage.changeLanguageToGerman();
		Thread.sleep(2000);

		// 3. Be sure that the page is translated to German
		Assert.assertTrue(germanPage.isArbeitGeberLinkPresent());
		Thread.sleep(3000);

		// 4. Change language from German to English
		germanPage.changeLanguageToEnglish();

		// 5.Go to Recruiter's page
		StepStoneLeavingFeedbackOnRecruitersPage feedBackPage = homePage.clickRecruitersLink();
		Thread.sleep(8000);

		// 6.Open the Feedback area to leave a feedback for a page
		feedBackPage.leaveFeedback();
		Thread.sleep(2000);

		// 7.Click on emoji "Good" and click on "Next" button
		feedBackPage.clickGoodEmoji();
		Thread.sleep(2000);

		// 8. Click on "Previous" button
		// 9. Change the emoji and click on "Very Good" emoji and click on "Next" btn
		feedBackPage.clickVeryGoodEmoji();
		Thread.sleep(2000);
		// 10. Leave a text message on the feedback area and click on "Leave Feedback"
		// btn
		// 11. Close the Feedback popup window
		feedBackPage.typeFeedback("The page is very good and helpful");
		Thread.sleep(8000);

		// 12. Verify the user is on the recruiter's page
		feedBackPage.isPostAdElementPresent();
	}
}
