package BaseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import utils.Configuration;

import static utils.IConstant.*;

public class BaseClass {

	protected WebDriver driver;
	public HomePage homePage;
	Configuration config;

	@BeforeMethod

	public void setUp() {
		// System.setProperty("WebDriver.chrome.driver",
		// "C:\\Users\\MainUser\\eclipse-workspace\\com.usps\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver.exe");
		// This is a Dynamic path
		/*
		 * System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 * ChromeOptions cOptions=new ChromeOptions();
		 * cOptions.addArguments("--remote-allow-origins=*"); driver = new
		 * ChromeDriver(cOptions);
		 */
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeOptions options=new
		 * ChromeOptions(); options.addArguments("--remote-allow-origins=*"); driver =
		 * new ChromeDriver(options);
		 * 
		 * WebDriverManager.firefoxdriver().setup(); driver=new FirefoxDriver();
		 * 
		 * WebDriverManager.edgedriver().setup(); driver=new EdgeDriver();
		 */
		/*
		 * System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		 * FirefoxOptions fOptions=new FirefoxOptions();
		 * fOptions.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		 * driver=new FirefoxDriver(fOptions);
		 */
		config = new Configuration();
		initDriver();
		driver.manage().window().maximize();
		// driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get(config.getProperties(URL));
		long pageLoadTime = Long.parseLong(config.getProperties(PAGELOAD_WAIT));
		long implicitlyWait = Long.parseLong(config.getProperties(iMPLICITLY_WAIT));
		long explicitlyWait = Long.parseLong(config.getProperties(EXPLICITLY_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
		initClasses();
	}

	private void initDriver() {
		String browserName = config.getProperties(BROWSER);

		switch (browserName) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeOptions cOptions = new ChromeOptions();
			cOptions.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(cOptions);
			break;
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			FirefoxOptions fOptions = new FirefoxOptions();
			fOptions.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver(fOptions);
			break;
		case "EDGE":
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			driver = new EdgeDriver();
		default:
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		}
	}

	private void initClasses() {
		homePage = new HomePage(driver);
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
