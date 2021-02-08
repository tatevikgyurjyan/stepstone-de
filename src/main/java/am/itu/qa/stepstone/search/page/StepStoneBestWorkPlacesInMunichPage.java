package am.itu.qa.stepstone.search.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.itu.qa.stepstone.search.page.StepStoneSearchesConstants.*;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneBestWorkPlacesInMunichPage extends StepStoneHomePage {

	public StepStoneBestWorkPlacesInMunichPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = SELECT_WORKPLACES_IN_GERMANY)
	WebElement citySelect;

	@FindBy(xpath = GERMAN_CITY_OPTION_BEST_PLACES)
	WebElement cityMunich;

	@FindBy(xpath = RYTE_COMPANY_XPATH)
	WebElement ryte;

	public void selecCityFortBestWorkPlaces() {
		citySelect.click();
		cityMunich.click();
	}

	public StepStoneSearchResultPageRYTE clickOnRyte() {
		ryte.click();
		return new StepStoneSearchResultPageRYTE(driver);
	}

}
