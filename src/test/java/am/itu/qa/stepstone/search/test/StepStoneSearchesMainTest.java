package am.itu.qa.stepstone.search.test;

import org.testng.annotations.Test;

import am.itu.qa.stepstone.base.test.StepStoneBaseTest;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;
import am.itu.qa.stepstone.search.page.StepStoneAdvancedSearchPage;
import am.itu.qa.stepstone.search.page.StepStoneAvailableITJobsPage;

public class StepStoneSearchesMainTest extends StepStoneBaseTest {
	
	@Test
	public void makeAdvancedSearches() throws InterruptedException {
		System.out.println("     ");
		System.out.println("--1--ACCEPTS COOKIES");
		System.out.println("     ");
		StepStoneHomePage homePage = new StepStoneHomePage(driver);
		homePage.acceptCookies();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--2--CLICKS ON 'ADVANCED SEARCH' ICON");
		System.out.println("     ");
		StepStoneAdvancedSearchPage advSearch = homePage.clickAdvancedSearchIcon();
		Thread.sleep(4000);
		
		System.out.println("     ");
		System.out.println("--3--SELECTS 'IT' FIELD TO SPECIFY DETAILED SEARCH");
		System.out.println("     ");
		advSearch.selectsIT();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--4--SELECTS 'QA ENGINEER' TO LOOK FOR");
		System.out.println("     ");
		advSearch.selectQA();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--5--AS COUNTRY SELECTS 'GERMANY' TO LOOK FOR A JOB");
		System.out.println("     ");
		advSearch.selectCountry();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--6--AS CITY SELECTS 'MUNICH' TO LOOK FOR A JOB");
		System.out.println("     ");
		advSearch.selectCity();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--7--AS REGION SELECTS 'LAIM' TO LOOK FOR A JOB");
		System.out.println("     ");
		advSearch.selectRegion();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--8--CLICKS ON CONTRACT TYPE");
		System.out.println("     ");
		advSearch.selectEmploymentType();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--9--SELECTS PERMANENT CONTRACT");
		System.out.println("     ");
		advSearch.selectSolidEmployee();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--10--CLICKS ON 'WORK TYPE'");
		System.out.println("     ");
		advSearch.selectWorkingType();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--11--SELECTS 'HOME OFFICE'");
		System.out.println("     ");
		advSearch.selectHomeOffice();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--12--CLICKS ON 'SECTOR'");
		System.out.println("     ");
		advSearch.selectFieldToWork();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--13--SELECTS 'IT & INTERNET' FIELD'");
		System.out.println("     ");
		advSearch.selectITField();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--14--CLICKS ON 'LEVEL OF EXPERIENCE'");
		System.out.println("     ");
		advSearch.selectWorkExperience();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--15--SELECTS 'EXPERIENCE REQUIRED'");
		System.out.println("     ");
		advSearch.selectProfessionalExperience();
		Thread.sleep(2000);

		System.out.println("     ");
		System.out.println("--16--CLICKS ON 'SEARCH' BUTTON");
		System.out.println("     ");
		StepStoneAvailableITJobsPage itJobs = advSearch.clickSearchBtn();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--17--TYPES EMAIL ADDRESS TO RECEIVE EMAILS ABOUT THE NEW AVAILABLE JOBS");
		System.out.println("--18--CLICKS ON 'SEND' BUTTON AND CLOSES THE POPUP WINDOW");
		System.out.println("     ");
		itJobs.typeEmailToReceiveJobOffers("tgyurjyan@yahoo.com");
		Thread.sleep(5000);
		
		System.out.println("     ");
		System.out.println("--19--CLICKS ON LOGO TO GO TO MAIN PAGE");
		System.out.println("     ");
		homePage = itJobs.clickLogo();
		Thread.sleep(2000);
		
		System.out.println("     ");
		System.out.println("--20--FINDS 'ADVANCED SEARCH' BUTTON TO BE ASSURE THAT IS ON MAIN PAGE");
		System.out.println("     ");
		homePage.findAdvancedSearch();
		Thread.sleep(2000);
		
		
	}

}
