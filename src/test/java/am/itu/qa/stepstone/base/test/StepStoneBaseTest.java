package am.itu.qa.stepstone.base.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class StepStoneBaseTest {

	public WebDriver driver;

	@Parameters({ "browser", "driverPath", "driverType" })
	@BeforeTest
	public void setBrowser(String browser, String driverPath, String driverType) {

		System.setProperty(driverPath, driverType);
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get("https://www.stepstone.de/en");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterTest() {

		driver.quit();
	}
}