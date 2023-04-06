package BaseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseClass {

	protected WebDriver driver;
	public HomePage homePage;

	@BeforeMethod

	public void setUp() {
		//System.setProperty("WebDriver.chrome.driver",
			//	"C:\\Users\\MainUser\\eclipse-workspace\\com.usps\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver.exe");
		//This is a Dynamic path
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		/*WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		driver=new FirefoxDriver();
		*/
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
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
