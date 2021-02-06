package am.itu.qa.stepstone.recruiters.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.recruiters.page.StepStoneRecruitersConstants.*;

public class StepStoneRecruitingNewsPage extends StepStoneRecruitersPage{

	public StepStoneRecruitingNewsPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = PRIVACY_POLICY_XPATH)
	WebElement privacyPolicy;
	
	@FindBy (xpath = ACCEPT_PRIVACY_POLICY_CHECKBOX)
	WebElement acceptPP;
	
	@FindBy(xpath = CONTACT_US_HERE_XPATH)
	WebElement contactUs;
		
	public void acceptPrivacyPolicy() {
		acceptPP.click();
	}
	
	public StepStonePrivacyPolicyPage clickOnPrivacyLink() {
		privacyPolicy.click();
		return new StepStonePrivacyPolicyPage(driver);
	}
	
	public StepStoneRecruitersContactUsPage clickOnContactUs() {
		contactUs.click();
		return new StepStoneRecruitersContactUsPage(driver);
	}
}
