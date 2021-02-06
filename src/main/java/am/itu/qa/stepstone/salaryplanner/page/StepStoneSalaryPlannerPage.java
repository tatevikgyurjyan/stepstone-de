package am.itu.qa.stepstone.salaryplanner.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static am.itu.qa.stepstone.salaryplanner.page.StepStoneSalaryPlannerConstants.*;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneSalaryPlannerPage extends StepStoneHomePage {

	public StepStoneSalaryPlannerPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = FULL_TIME_XPATH)
	WebElement fullTimeJob;

	@FindBy(xpath = ANNUAL_GROSS_SALARY_XPATH)
	WebElement grossSalary;

	@FindBy(xpath = ANNUAL_GROSS_BENEFITS)
	WebElement grossBenefits;

	@FindBy(xpath = SATISFIED_WITH_CURRENT_SALARY_XPATH)
	WebElement currentSalarySatisfication;

	@FindBy(xpath = LAST_OCCUPATION_XPATH)
	WebElement lastOccupation;

	@FindBy(xpath = QUALIFICATIONS_XATH)
	WebElement qualifications;

	@FindBy(xpath = EXPERIENCE_XPATH)
	WebElement experience;

	@FindBy(xpath = YEARS_OF_EXPERIENCE_XPATH)
	WebElement experienceLength;

	@FindBy(xpath = PERSONNEL_RESP_NO_XPATH)
	WebElement persResponsibility;

	@FindBy(xpath = RESP_FOR_BUDGET_NO_XPATH)
	WebElement budgResponsibility;

	@FindBy(xpath = EMPLOYER_LOCATION_XPATH)
	WebElement empLocation;

	@FindBy(xpath = EMPLOYER_INDUSTRY_XPATH)
	WebElement empIndustry;

	@FindBy(xpath = NUMBER_OF_EMPLOYEES_XPATH)
	WebElement emplNum;

	@FindBy(xpath = OPTION_1000_EMPLOYEES_XPATH)
	WebElement empNumOption;

	@FindBy(xpath = EDUCATION_XPATH)
	WebElement education;

	@FindBy(xpath = MASTERS_DEGREE_XPATH)
	WebElement mastersDegree;

	@FindBy(xpath = STUDY_SUBJECT_XPATH)
	WebElement fieldOfStudy;

	@FindBy(xpath = ENGINEERING_PROFESSION_XPATH)
	WebElement engineering;

	@FindBy(xpath = STUDIES_INSTITUTION_XPATH)
	WebElement university;

	@FindBy(xpath = LMU_XPATH)
	WebElement lmu;

	@FindBy(xpath = YEAR_OF_BIRTH_XPATH)
	WebElement birthDate;

	@FindBy(xpath = YEAR_OF_BIRTH_OPTION_XPATH)
	WebElement birthDateOption;

	@FindBy(xpath = GENDER_FEMALE_XPATH)
	WebElement gender;

	@FindBy(xpath = REGISTER_BTN_XPATH)
	WebElement register;
	
	
	public void FullTime() {
		fullTimeJob.click();
	}
	
	public void annualSalary(String salary) {
		grossSalary.sendKeys(salary);
	}
	
	public void annualBonuses(String bonus) {
		grossBenefits.sendKeys(bonus);
	}
	
	public void satisfiedWithPrevJob() {
		currentSalarySatisfication.click();
	}
	
	public void jobTitle(String title) {
		lastOccupation.sendKeys(title);
	}
	
	public void qualification(String knowledge) {
		qualifications.sendKeys(knowledge);
	}
	
	public void experience() {
		experience.click();
		experienceLength.click();
	}
	
	public void noPersonnelResp() {
		persResponsibility.click();
	}
	
	public void noBudgetResp() {
		budgResponsibility.click();
	}
	
	public void employerLocation(String city) {
		empLocation.sendKeys(city);
	}
	
	public void fieldOfBusiness(String field) {
		empIndustry.sendKeys(field);
	}
	
	public void numberOfEmplyees() {
		emplNum.click();
		empNumOption.click();
	}
	
	public void empEducation() {
		education.click();
		mastersDegree.click();
	}
	
	public void fieldOfStudies() {
		fieldOfStudy.click();
		engineering.click();
	}
	
	public void emplUniversity() {
		university.click();
		lmu.click();
	}
	
	public void empBirthday() {
		birthDate.click();
		birthDateOption.click();
	}
	
	public void femaleGender() {
		gender.click();
	}
	
	public StepStoneHomePage registerToPlanSalary() {
		register.click();
		return new StepStoneHomePage(driver);
	}
}
