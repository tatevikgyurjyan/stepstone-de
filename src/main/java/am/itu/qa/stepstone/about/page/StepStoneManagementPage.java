package am.itu.qa.stepstone.about.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.about.page.StepStoneAboutPageConstants.*;

public class StepStoneManagementPage extends StepStoneAboutPage{

	public StepStoneManagementPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy (xpath = DISMISS_COOKIES_XPATH)
	WebElement dismiss;
	
	@FindBy (xpath = STEPSTONE_CEO_XPATH)
	WebElement ceo;
	
	@FindBy (xpath = STEP_STONE_CONTACT_XPATH)
	WebElement contact;
	
	public void dismissCookies() {
		dismiss.click();
	}
	
	public StepStoneCEOPage viewCEOPage() {
		ceo.click();
		return new StepStoneCEOPage(driver);
	}
	
	public StepStoneContactsPage clickOnContactLink() {
		contact.click();
		return new StepStoneContactsPage(driver);
		
	}
}
