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
	
	public void dismissCookies() {
		dismiss.click();
	}
	
	public StepStoneCEOPage viewCEOPage() {
		ceo.click();
		return new StepStoneCEOPage(driver);
	}
	
}
