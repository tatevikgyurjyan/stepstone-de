package am.itu.qa.stepstone.feedback.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.feedback.page.StepStoneFeedbackPageConstants.*;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneFeedbackPage extends StepStoneHomePage{

	public StepStoneFeedbackPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath  = "//body")
	WebElement pageBody;

	@FindBy (xpath = SEARCH_SIMPLICITY_VERYGOOD_XPATH)
	WebElement simplicityVerGood;
	
	@FindBy (xpath = DESIGN_VERYGOOD_XPATH)
	WebElement designVeryGood;
	
	@FindBy (xpath = RESULTS_RELEVANCE_XPATH)
	WebElement relevanceGood;
	
	@FindBy (xpath = COMMENT_AREA_XPATH)
	WebElement commentArea;
	
	@FindBy (xpath = SEND_FEEDBACK_BTN)
	WebElement sendBtn;
	
	
	public StepStoneFeedbackPage clickOnBody() {
		pageBody.click();
		return new StepStoneFeedbackPage(driver);
	}
	
	public void leaveOpinionForSimplicity() {
		
		simplicityVerGood.click();
	}
	public void leaveOpinionForDesign() {
		
		designVeryGood.click();
	}
	
	public void leaveOpinionForRelevance() {	
	
		relevanceGood.click();
	
	}
	
	public void leaveComment(String comment) throws InterruptedException {
		commentArea.click();
		commentArea.sendKeys(comment);
		Thread.sleep(6000);
		sendBtn.submit();
	}
}
