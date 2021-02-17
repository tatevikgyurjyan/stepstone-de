package am.itu.qa.stepstone.about.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.about.page.StepStoneAboutPageConstants.*;

public class StepStoneCEOPage extends StepStoneManagementPage{

	public StepStoneCEOPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath = DISMISS_COOKIES_XPATH)
	WebElement dismiss;
	
	@FindBy (xpath = NEXT_BTN_XPATH)
	WebElement next;

	@FindBy (xpath = BACK_TO_LIST_BTN)
	WebElement backToList;
	
	public void dismissCookies() {
		dismiss.click();
	}
	
	public StepStoneCFOPage clickNextBtn() {
		next.click();
		return new StepStoneCFOPage(driver);
	}
	
}
