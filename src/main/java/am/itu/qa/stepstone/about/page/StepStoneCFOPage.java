package am.itu.qa.stepstone.about.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.about.page.StepStoneAboutPageConstants.*;

public class StepStoneCFOPage extends StepStoneCEOPage{

	public StepStoneCFOPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath = BACK_TO_LIST_BTN)
	WebElement backToList;

	public StepStoneManagementPage backToList() {
		backToList.click();
		return new StepStoneManagementPage(driver);
	}
}
