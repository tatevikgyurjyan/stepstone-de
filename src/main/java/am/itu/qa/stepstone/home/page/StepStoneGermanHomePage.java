package am.itu.qa.stepstone.home.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.home.page.StepStoneHomePageConstants.*;

public class StepStoneGermanHomePage extends StepStoneHomePage {

	public StepStoneGermanHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ARBEITGEBER_ELEMENT_XPATH)
	WebElement arbeitGeber;

	@FindBy(xpath = LANGUAGE_BAR_XPATH)
	WebElement langBar;

	@FindBy(xpath = ENGLISH_LANGUAGE_XPATH)
	WebElement englishLang;

	public boolean isArbeitGeberLinkPresent() {
		return arbeitGeber.isDisplayed();
	}

	public StepStoneHomePage changeLanguageToEnglish() {
		langBar.click();
		englishLang.click();
		return new StepStoneHomePage(driver);
	}

}
