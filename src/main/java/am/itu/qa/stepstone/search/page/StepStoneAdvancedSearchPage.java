package am.itu.qa.stepstone.search.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.search.page.StepStoneSearchesConstants.*;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneAdvancedSearchPage extends StepStoneHomePage {

	public StepStoneAdvancedSearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = IT_IN_ADVANCED_SEARCH_OPTIONS_XPATH)
	WebElement it;

	@FindBy(xpath = IN_ADVANCED_SEARCH_QA_XPATH)
	WebElement qa;

	@FindBy(xpath = COUNTRY_TO_WORK_XPATH)
	WebElement country;

	@FindBy(xpath = CITY_IN_GERMANY_TO_WORK)
	WebElement city;

	@FindBy(xpath = REGION_IN_GERMAN_CITY_TO_WORK)
	WebElement region;

	@FindBy(xpath = TYPE_OF_EMPLOYMENT_TO_CHOOSE)
	WebElement employmentType;

	@FindBy(xpath = SOLID_EMPLOYMENT_XPATH)
	WebElement solidEmp;

	@FindBy(xpath = WORKING_TIME_TO_CHOOSE)
	WebElement workingType;

	@FindBy(xpath = HOME_OFFICE_XPATH)
	WebElement homeOffice;

	@FindBy(xpath = CHOOSE_FIELD_TO_WORK)
	WebElement fieldToWork;

	@FindBy(xpath = IT_FIELD_TO_WORK)
	WebElement fieldIT;

	@FindBy(xpath = WORK_EXPERIENCE_XPATH)
	WebElement workExp;

	@FindBy(xpath = WITH_PROFESSIONAL_EXPERIENCE_XPATH)
	WebElement profExp;

	@FindBy(xpath = ADVANCED_SEARCH_BTN_XPATH)
	WebElement advancedSearch;

	@FindBy(xpath = STEP_STONE_SEND_EMAIL_FOR_QA_XPATH)
	WebElement emailInput;

	@FindBy(xpath = CREATE_JOB_AGENT_BTN_XPATH)
	WebElement sendEmail;

	@FindBy (xpath = CLOSE_EMAIL_POPUP_XPATH)
	WebElement closePopup;
	
	public void advancedSearchForITJobs() throws InterruptedException {
		Thread.sleep(2000);
		it.click();
		Thread.sleep(2000);
		qa.click();
		Thread.sleep(2000);
		country.click();
		Thread.sleep(2000);
		city.click();
		Thread.sleep(2000);
		region.click();
		Thread.sleep(2000);
		employmentType.click();
		Thread.sleep(2000);
		solidEmp.click();
		Thread.sleep(2000);
		workingType.click();
		Thread.sleep(2000);
		homeOffice.click();
		Thread.sleep(2000);
		fieldToWork.click();
		Thread.sleep(2000);
		fieldIT.click();
		Thread.sleep(2000);
		workExp.click();
		Thread.sleep(2000);
		profExp.click();
		Thread.sleep(2000);
	}

	public StepStoneAvailableITJobsPage clickSearchBtn() throws InterruptedException {
		Thread.sleep(2000);
		advancedSearch.click();
		return new StepStoneAvailableITJobsPage(driver);
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
