package am.itu.qa.stepstone.base.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class StepStoneBaseTest {

	public WebDriver driver;

	@Parameters({ "browser", "driverPath", "driverType" })
	@BeforeTest
	public void setBrowser(String browser, String driverPath, String driverType) {
		System.out.println("driver type is " + driverType);

		System.out.println("driver path is " + driverPath);
		
		System.setProperty(driverType, driverPath);
		if (browser.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized"); // open Browser in maximized mode
			options.addArguments("--headless"); //run browser headlessly
			options.addArguments("disable-infobars"); // disabling infobars
			options.addArguments("--disable-extensions"); // disabling extensions
			options.addArguments("--disable-gpu"); // applicable to windows os only
			options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
			options.addArguments("--no-sandbox"); // Bypass OS security model
			driver = new ChromeDriver(options);
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