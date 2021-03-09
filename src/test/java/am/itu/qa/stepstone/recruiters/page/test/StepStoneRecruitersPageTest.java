package am.itu.qa.stepstone.recruiters.page.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;
import am.itu.qa.stepstone.recruiters.page.StepStonePrivacyPolicyPage;
//import am.itu.qa.stepstone.recruiters.page.StepStonePrivacyPolicyPage;
import am.itu.qa.stepstone.recruiters.page.StepStoneRecruitersContactUsPage;
import am.itu.qa.stepstone.recruiters.page.StepStoneRecruitersPage;
import am.itu.qa.stepstone.recruiters.page.StepStoneRecruitingNewsPage;

public class StepStoneRecruitersPageTest extends StepStoneBaseTest {

	@Test
	public void navigateToRecruitersPage() throws InterruptedException {
		// 1. Accepts cookies
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();

		// 2.Click on the "For recruiters" link on the home page
		StepStoneRecruitersPage recruitersPage = homePage.clickOnRecruitersLink();

		// 3. Click on "Recruiting News" to read the news
		StepStoneRecruitingNewsPage newsPage = recruitersPage.clickOnNews();
		Thread.sleep(6000);
		StepStoneRecruitersContactUsPage contactPage = newsPage.clickOnContactUs();
		Assert.assertTrue(contactPage.isContactUsLinkPresent());

		
		 // 4. Click on "yes" checkbox to accept the PP, after click on
		 //"Privacy Policy" to decide whether to subscribe on the web page // or not
		 StepStonePrivacyPolicyPage ppPage = newsPage.clickOnPrivacyLink();
		 Thread.sleep(6000);
		 newsPage.clickOnPrivacyLink(); 
		 Thread.sleep(3000);
		 
		 //5. Assert that PP article is displayed
		 Assert.assertTrue((ppPage.isPPArticleHeadingDisplayed()));
		 

	}
}
