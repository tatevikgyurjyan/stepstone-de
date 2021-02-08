package am.itu.qa.stepstone.search.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.search.page.StepStoneSearchesConstants.*;

public class StepStoneSearchResultPageRYTE extends StepStoneBestWorkPlacesInMunichPage {

	public StepStoneSearchResultPageRYTE(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = SHOW_MORE_ABOUT_US_XPATH)
	WebElement showMore;

	@FindBy(xpath = LEAVE_REVIEW_FOR_RYTE_XPATH)
	WebElement leaveReview;

	public void showMoreAboutUs() {
		showMore.click();
	}

	public StepStoneLeaveReviewPage leaveReviewForRyte() {
		leaveReview.click();
		return new StepStoneLeaveReviewPage(driver);
	}
}
