package am.itu.qa.stepstone.search.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.search.page.StepStoneSearchesConstants.*;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneSearchForDesignerPage extends StepStoneHomePage {

	public StepStoneSearchForDesignerPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = CLOSE_DESIGNER_SEARCH_POPUP)
	WebElement closePopup;

	@FindBy(xpath = FULL_TIME_KEYWORD_XPATH)
	WebElement fullTymeKeyWord;

	public void closePopup() {
		closePopup.click();
	}

	public boolean isSearchKeyWordPresent() {
		return fullTymeKeyWord.isDisplayed();
	}
}
