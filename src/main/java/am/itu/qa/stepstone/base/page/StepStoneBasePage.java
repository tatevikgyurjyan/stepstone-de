package am.itu.qa.stepstone.base.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class StepStoneBasePage {

	protected WebDriver driver;

	public StepStoneBasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

}
