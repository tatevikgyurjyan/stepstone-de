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
	
	@FindBy(xpath = STEP_STONE_SEND_EMAIL_FOR_QA_XPATH)
	WebElement emailInput;

	@FindBy(xpath = CREATE_JOB_AGENT_BTN_XPATH)
	WebElement sendEmail;

	@FindBy(xpath = CLOSE_EMAIL_POPUP_XPATH)
	WebElement closePopup;

	public StepStoneAvailableITJobsPage closePopUp() {
		close.click();
		return new StepStoneAvailableITJobsPage(driver);
	}

	public StepStoneHomePage clickLogo() {
		logo.click();
		return new StepStoneHomePage(driver);
	}
	
	public void typeEmailToReceiveJobOffers(String email) throws InterruptedException {
		emailInput.click();
		emailInput.sendKeys(email);
		Thread.sleep(2000);
		sendEmail.submit();
		Thread.sleep(2000);
		closePopup.click();
		Thread.sleep(2000);
	}

}
