package am.itu.qa.stepstone.about.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.about.page.StepStoneAboutPageConstants.*;

public class StepStoneAboutTimeLinePage extends StepStoneAboutPage{

	public StepStoneAboutTimeLinePage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy (xpath = HEADING_TIMELINE_XPATH)
	WebElement timeline;
	
	@FindBy (xpath = MANAGEMENT_XPATH)
	WebElement management;
	
	public boolean isHeadingTimelinePresent() {
		return timeline.isDisplayed();
	}
	
	public StepStoneManagementPage clickOnManagementLink() {
		management.click();
		return new StepStoneManagementPage(driver);
	}
}
