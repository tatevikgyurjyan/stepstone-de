package am.itu.qa.stepstone.recruiters.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.recruiters.page.StepStoneRecruitersConstants.*;

public class StepStonePrivacyPolicyPage extends StepStoneRecruitingNewsPage{

	public StepStonePrivacyPolicyPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = ARTICLE_PRIVACY_POLICY_XPATH)
	WebElement articlePP;
	
	public boolean isPPArticleHeadingDisplayed() {
		return articlePP.isDisplayed();
	}
}
