package am.itu.qa.stepstone.search.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.itu.qa.stepstone.search.page.StepStoneSearchesConstants.*;

public class StepStoneSearchResultBMW extends StepStoneBestWorkPlacesInMunichPage {

	public StepStoneSearchResultBMW(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = SHOW_MORE_ABOUT_US_XPATH)
	WebElement showMore;

	@FindBy(xpath = BWM_VIDEO_PLAY_BTN_XPATH)
	WebElement bmwVideo;
	
	@FindBy(xpath = BMW_PAGE_LINK_XPATH)
	WebElement bmwLink;
	
	@FindBy(xpath = BMW_PAGE_LINK_XPATH)
	WebElement bmwHomePage;
	
	public void showMore() {
		showMore.click();
	}
	
	public void watchBmwVideo() {
		bmwVideo.click();
	}
	
	public StepStoneBMWPage goToBMWHomePage() {
		bmwHomePage.click();
		return new StepStoneBMWPage(driver);
	}
		
}
