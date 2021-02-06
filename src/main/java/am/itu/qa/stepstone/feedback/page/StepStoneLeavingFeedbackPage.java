package am.itu.qa.stepstone.feedback.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.feedback.page.StepStoneFeedbackPageConstants.*;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneLeavingFeedbackPage extends StepStoneHomePage {

	public StepStoneLeavingFeedbackPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = FEEDBACK_XPATH)
	WebElement feedback;

	@FindBy(xpath = EMOJI_GOOD_OPINION_XPATH)
	WebElement goodEmoji;

	@FindBy(xpath = OPINION_NEXT_BTN_XPATH)
	WebElement nextBtn;

	@FindBy(xpath = OPINION_PREVIOUS_BTN_XPATH)
	WebElement previousBtn;

	@FindBy(xpath = EMOJI_VERY_GOOD_OPINION_XPATH)
	WebElement veryGoodEmoji;

	@FindBy(xpath = FEEDBACK_TYPE_AREA_XPATH)
	WebElement feedbackTypeArea;

	@FindBy(xpath = SEND_FEEDBACK_BTN_XPATH)
	WebElement sendFeedback;

	@FindBy(xpath = OPINION_APPRECIATION_XPATH)
	WebElement thankYouMessage;

	@FindBy(xpath = OPINION_MESSAGE_CLOSE_XPATH)
	WebElement closeThanksMsg;

	@FindBy(xpath = POST_AD_ELE_XPATH)
	WebElement postAd;

	public void leaveFeedback() {
		feedback.click();
	}

	public void clickGoodEmoji() {
		goodEmoji.click();
		nextBtn.click();
	}

	public void clickVeryGoodEmoji() {
		previousBtn.click();
		veryGoodEmoji.click();
		nextBtn.click();
	}

	public StepStoneLeavingFeedbackPage typeFeedback(String textToType) {
		feedbackTypeArea.sendKeys(textToType);
		sendFeedback.click();
		closeThanksMsg.click();
		return new StepStoneLeavingFeedbackPage(driver);
	}

	public boolean isPostAdElementPresent() {
		return postAd.isDisplayed();
	}
}
