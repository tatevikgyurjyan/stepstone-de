package am.itu.qa.stepstone.search.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.search.page.StepStoneSearchesConstants.*;

public class StepStoneLeaveReviewPage extends StepStoneSearchResultPageRYTE {

	public StepStoneLeaveReviewPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = CHOOSE_RYTE_LOCATION_XPATH)
	WebElement location;

	@FindBy(xpath = LOCATION_MUNICH_XPATH)
	WebElement munich;

	@FindBy(xpath = CONTINUE_REVIEW_BTN)
	WebElement continueReview;

	@FindBy(xpath = RATE_CULTURE_AND_PEOPLE)
	WebElement rateExcellent;

	public void chooseLocationBestPlaces(String cityName) {
		location.sendKeys(cityName);
		location.click();
		location.sendKeys(Keys.ENTER);
		// munich.click();*/
		continueReview.click();
	}

	public void continueReview() {
		continueReview.click();
	}

	public void rate() {
		rateExcellent.click();
		continueReview.click();
	}
}
