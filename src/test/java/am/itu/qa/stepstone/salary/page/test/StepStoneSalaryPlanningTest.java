package am.itu.qa.stepstone.salary.page.test;

import org.testng.annotations.Test;

import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;
import am.itu.qa.stepstone.salaryplanner.page.StepStoneSalaryPlannerPage;

public class StepStoneSalaryPlanningTest extends StepStoneBaseTest {

	@Test
	public void planSalary() throws InterruptedException {
		// 1. Accepts cookies
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();

		// 2. Click on "Start the Salary Planner" icon
		Thread.sleep(4000);
		StepStoneSalaryPlannerPage plannerPage = homePage.clickSalaryPlannerLink();

		// 3. Fill permanent position in last 12 months
		Thread.sleep(4000);
		plannerPage.FullTime();

		// 4. Fill annual gross base salary
		Thread.sleep(4000);
		plannerPage.annualSalary("60000");

		// 5. Fill variable payments
		plannerPage.annualBonuses("5000");

		// 6. How satisfied with current job?
		plannerPage.satisfiedWithPrevJob();

		// 7. Last job title
		plannerPage.jobTitle("Engineer");

		// 8. Fill qualifications
		plannerPage.qualification("Engineering");

		// 9. Years of experience
		plannerPage.experience();

		// 10. No personnel responsibility
		plannerPage.noPersonnelResp();

		// 11. No Budget responsibility
		plannerPage.noBudgetResp();

		// 12. Last employer city
		plannerPage.employerLocation("Munich, Germany");

		// 13. Employer's business
		plannerPage.fieldOfBusiness("Banken");

		// 14.Number of employees in the company
		plannerPage.numberOfEmplyees();

		// 15.Fill highest degree of education
		plannerPage.empEducation();

		// 16. Field of Studies
		plannerPage.fieldOfStudies();

		// 17.University where studied
		plannerPage.empEducation();

		// 18. Date of birth
		plannerPage.empBirthday();

		// 19. Employee gender
		plannerPage.femaleGender();

		// 20. Register to generate personal salary planner
		plannerPage.registerToPlanSalary();
	}
}
