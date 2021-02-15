package am.itu.qa.stepstone.search.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.itu.qa.stepstone.search.page.StepStoneSearchesConstants.*;

public class StepStoneBMWPage extends StepStoneSearchResultBMW{

	public StepStoneBMWPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = BMW_PAGE_LOGO_XPATH)
	WebElement bmwLogo;
	
	public void clickOnLogo() {
		bmwLogo.click();
	}
	public boolean isBMWLogoDisplayes() {
		return bmwLogo.isDisplayed();
	}
}
