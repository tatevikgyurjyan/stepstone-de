package am.itu.qa.stepstone.search.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.search.page.StepStoneSearchesConstants.*;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneAvailableITJobsPage extends StepStoneHomePage {

	public StepStoneAvailableITJobsPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = CLOSE_POPUP_WINDOW_XPATH)
	WebElement close;

	@FindBy(xpath = STEP_STONE_LOGO_XPATH)
	WebElement logo;

	public StepStoneAvailableITJobsPage closePopUp() {
		close.click();
		return new StepStoneAvailableITJobsPage(driver);
	}

	public StepStoneHomePage clickLogo() {
		logo.click();
		return new StepStoneHomePage(driver);
	}

}
