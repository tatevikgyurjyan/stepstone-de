package am.itu.qa.stepstone.recruiters.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static am.itu.qa.stepstone.recruiters.page.StepStoneRecruitersConstants.*;
import am.itu.qa.stepstone.home.page.StepStoneHomePage;

public class StepStoneRecruitersPage extends StepStoneHomePage {

	public StepStoneRecruitersPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = RECRUITING_NEWS_XPATH)
	WebElement recruitingNews;

	public StepStoneRecruitingNewsPage clickOnNews() {
		recruitingNews.click();
		return new StepStoneRecruitingNewsPage(driver);
	}
	
}
