package am.itu.qa.stepstone.about.page;

import static am.itu.qa.stepstone.about.page.StepStoneAboutPageConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StepStoneContactsPage extends StepStoneAboutPage{

	public StepStoneContactsPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = DISMISS_COOKIES_XPATH)
	WebElement dismissCookies;
	
	@FindBy(xpath = INTERESTED_IN_FINDING_JOBS)
	WebElement findingJobs;
	
	@FindBy (xpath = TEXTAREA_COMMENTS_XPATH)
	WebElement textArea;
	
	@FindBy(xpath = SEND_REQUEST_BTN)
	WebElement send;
	
	public void dismissCookies() {
		dismissCookies.click();
	}
	
	public void chooseFindingJobToReceiveMoreInformation() {
		findingJobs.click();
	}
	
	public void sendDetailsAboutPreferences(String textToComment) {
		textArea.sendKeys(textToComment);
	}
	
	public void sendRequest() {
		send.click();
	}
}
