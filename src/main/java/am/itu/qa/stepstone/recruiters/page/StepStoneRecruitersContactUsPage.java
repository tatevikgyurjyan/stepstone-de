package am.itu.qa.stepstone.recruiters.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.recruiters.page.StepStoneRecruitersConstants.*;
public class StepStoneRecruitersContactUsPage extends StepStoneRecruitingNewsPage{

	public StepStoneRecruitersContactUsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = CONTACT_US_LINK_ON_CONTACT_PAGE)
	WebElement contactUs;
	
	public boolean isContactUsLinkPresent() {
		return contactUs.isDisplayed();
	}
	
}
