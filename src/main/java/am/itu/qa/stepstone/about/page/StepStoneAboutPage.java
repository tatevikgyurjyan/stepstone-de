package am.itu.qa.stepstone.about.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.itu.qa.stepstone.home.page.StepStoneHomePage;
import static am.itu.qa.stepstone.about.page.StepStoneAboutPageConstants.*;

public class StepStoneAboutPage extends StepStoneHomePage {

	public StepStoneAboutPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy (xpath = OUR_HISTORY_XPATH)
	WebElement ourHistory;
	
	@FindBy (xpath = DISMISS_COOKIES_XPATH)
	WebElement dismiss;
	
	@FindBy (xpath = STEP_STONE_CONTACT_XPATH)
	WebElement contact;
	
	@FindBy (xpath = MANAGEMENT_XPATH)
	WebElement management;
	
	public void dismissCookies() {
		dismiss.click();
	}
	
	public StepStoneAboutTimeLinePage clickOnOurHistory() {
		ourHistory.click();
		return new StepStoneAboutTimeLinePage(driver);
	}
	
	public StepStoneContactsPage clickOnContactLink() {
		contact.click();
		return new StepStoneContactsPage(driver);
	}
	
	public StepStoneManagementPage clickOnManagementLink() {
		management.click();
		return new StepStoneManagementPage(driver);
	}
}
