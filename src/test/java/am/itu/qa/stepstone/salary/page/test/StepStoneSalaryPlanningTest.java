package am.itu.qa.stepstone.salary.page.test;

import org.testng.annotations.Test;

import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;
import am.itu.qa.stepstone.salaryplanner.page.StepStoneSalaryPlannerPage;

public class StepStoneSalaryPlanningTest extends StepStoneBaseTest {

	@Test
	public void planSalary() throws InterruptedException {
		System.out.println("     ");
		System.out.println("--1--ACCEPTS COOKIES");
		System.out.println("     ");
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--2--CLICKS ON 'START SALARY PLANNER' ICON");
		System.out.println("     ");
		Thread.sleep(4000);
		StepStoneSalaryPlannerPage plannerPage = homePage.clickSalaryPlannerLink();

		System.out.println("     ");
		System.out.println("--3--FILLS PERMANENT POSITION IN LAST 12 MONTHS");
		System.out.println("     ");
		Thread.sleep(9000);
		plannerPage.FullTime();

		System.out.println("     ");
		System.out.println("--4--FILLS ANNUAL GROSS BASE SALARY");
		System.out.println("     ");
		Thread.sleep(4000);
		plannerPage.annualSalary("60000");

		System.out.println("     ");
		System.out.println("--5--FILLS VARIABLE PAYMENTS");
		System.out.println("     ");
		plannerPage.annualBonuses("5000");

		System.out.println("     ");
		System.out.println("--6--CHOOSES HOW SATICFIED IS WITH CURRENT JOB");
		System.out.println("     ");
		plannerPage.satisfiedWithPrevJob();

		System.out.println("     ");
		System.out.println("--7--SELECTS LAST JOB TITLE");
		System.out.println("     ");
		plannerPage.jobTitle("Engineer");

		System.out.println("     ");
		System.out.println("--8--FILLS QUALIFICATIONS");
		System.out.println("     ");
		plannerPage.qualification("Engineering");

		System.out.println("     ");
		System.out.println("--9--SELECTS YEARS OF EXPERIENCE");
		System.out.println("     ");
		plannerPage.experience();

		System.out.println("     ");
		System.out.println("--10--NO PERSONNEL RESPONSIBILITY");
		System.out.println("     ");
		plannerPage.noPersonnelResp();

		System.out.println("     ");
		System.out.println("--11--NO BUDGET RESPONSIBILITY");
		System.out.println("     ");
		plannerPage.noBudgetResp();

		System.out.println("     ");
		System.out.println("--12--LAST EMPLOYER CITY");
		System.out.println("     ");
		plannerPage.employerLocation("Munich, Germany");

		System.out.println("     ");
		System.out.println("--13--EMPLOYER'S BUSINESS");
		System.out.println("     ");
		plannerPage.fieldOfBusiness("Banken");

		System.out.println("     ");
		System.out.println("--14--NUMBER OF EMPLOYEES IN THE COMPANY");
		System.out.println("     ");
		plannerPage.numberOfEmplyees();

		System.out.println("     ");
		System.out.println("--15--HIGHEST DEGREE OF EDUCATION");
		System.out.println("     ");
		plannerPage.empEducation();

		System.out.println("     ");
		System.out.println("--16--FIELD OF STUDIES");
		System.out.println("     ");
		plannerPage.fieldOfStudies();

		System.out.println("     ");
		System.out.println("--17--UNIVERSITY WHERE STUDIED");
		System.out.println("     ");
		plannerPage.empEducation();

		System.out.println("     ");
		System.out.println("--18--DATE OF BIRTH");
		System.out.println("     ");
		plannerPage.empBirthday();

		System.out.println("     ");
		System.out.println("--19--EMPLOYEE GENDER");
		System.out.println("     ");
		plannerPage.femaleGender();

		System.out.println("     ");
		System.out.println("--20--REGISTER TO GENERATE PERSONAL SALARY PLANNER");
		System.out.println("     ");
		plannerPage.registerToPlanSalary();
	}
}
