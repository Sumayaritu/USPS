package BaseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {

	WebDriver driver;
	public HomePage homePage;

	@BeforeMethod

	public void setUp() {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\MainUser\\eclipse-workspace\\gov.cms.portal\\drive\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.usps.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		homePage = new HomePage(driver);

	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

	
	
	
	
	

}
