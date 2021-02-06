package am.itu.qa.stepstone.search.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.search.page.StepStoneSearchesConstants.*;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneQAEngineerInMuenchenSearch extends StepStoneHomePage {

	public StepStoneQAEngineerInMuenchenSearch(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = STEP_STONE_SEND_EMAIL_FOR_QA_XPATH)
	WebElement typeEmail;

	@FindBy(xpath = CREATE_JOB_AGENT_BTN_XPATH)
	WebElement sendEmail;

	@FindBy(xpath = SEARCH_RES_NAV_CONTAINER_XPATH)
	WebElement searchRes;

	@FindBy(xpath = CLOSE_EMAIL_POPUP_XPATH)
	WebElement closeEmail;

	public StepStoneQAEngineerInMuenchenSearch typeEmailForQAJob(String email) {
		typeEmail.sendKeys(email);
		sendEmail.click();
		closeEmail.click();
		return new StepStoneQAEngineerInMuenchenSearch(driver);
	}

	public boolean isRelevanceElementPresent() {
		return searchRes.isDisplayed();
	}
}
