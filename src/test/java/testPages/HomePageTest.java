package testPages;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = false, priority = 2)
	public void clickSearchButtonTest() throws InterruptedException {
		homePage.clickSearchButton();
	}

	@Test(enabled = false, priority = 3)
	public void clickSendButtonTest() throws InterruptedException {
		homePage.clickSendButton();
	}

	@Test(enabled = false, priority = 1)
	public void clickSignInButtonTest() throws InterruptedException {
		homePage.clickSignInButton();
	}

	@Test(enabled = false)
	public void clickSignInThenClickUserNameThenInputTextTest() throws InterruptedException {
		homePage.clickSignInThenClickUserNameThenInputText();
	}

	@Test(enabled = false)
	public void use_of_linkText_as_locator() throws InterruptedException {
		driver.findElement(By.linkText("Send")).click();
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void use_of_partialLinkText_as_locator() {
		driver.findElement(By.partialLinkText("Sen")).click();
	}

	@Test(enabled = false)
	public void use_of_cssSelector_as_locator() {
		driver.findElement(By.cssSelector("a#link-locator")).click();
	}

	@Test(enabled = false)
	public void inputTextInSearchButtonTest() throws InterruptedException {
		homePage.inputTextInSearchButton();
	}

	@Test(enabled = false)
	public void logoDisplayedTest() {
		homePage.logoDisplayed();// Actual Result
		Assert.assertTrue(true);// Expected Result
	}

	@Test(enabled = false)
	public void use_of_isDisplayed_in_logo() {
		boolean elementDisplayed = driver.findElement(By
				.xpath("//img[@src=\"https://www.usps.com/global-elements/header/images/utility-header/logo-sb.svg\"]"))
				.isDisplayed();
		System.out.println("Is the Logo Displayed?Ans:" + elementDisplayed);
	}

	@Test(enabled = false)
	public void use_of_isEnabled_in_signIn_button() {
		boolean signInButtonEnabled = driver.findElement(By.id("login-register-header")).isEnabled();
		System.out.println("Is the Sign In Button Enabled?Ans:" + signInButtonEnabled);
	}

	@Test(enabled = false)
	public void use_of_getTitle_method_in_homePage() {
		System.out.println("The Title of the Page is:" + driver.getTitle());
	}

	@Test(enabled = false)
	public void use_of_getCurrentURL_method() {
		driver.findElement(By.className("link-reg")).click();
		System.out.println("The Title of the Page is:" + driver.getTitle());
		System.out.println("The Current URL is:" + driver.getCurrentUrl());
	}

	@Test(enabled = false)
	public void use_of_getText_method() {
		WebElement signInButton = driver.findElement(By.className("link-reg"));
		System.out.println("The Text for WebElement is:" + signInButton.getText());
	}

	@Test(enabled = false)
	public void use_of_getAttribute_method() {
		String value = driver.findElement(By.className("link-reg")).getAttribute("class");
		System.out.println("The value of the Class Attribute is:" + value);
	}

	@Test(enabled = false)
	public void use_of_sendKeys_then_clear_method() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"home-input\"]")).sendKeys("1234567");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=\"home-input\"]")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=\"home-input\"]")).sendKeys("1234567");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=\"home-input\"]")).clear();
	}

	@Test(enabled = false)
	public void use_of_sendKeys_then_click_by_enter_key_of_laptop() throws InterruptedException {
		driver.findElement(By.id("login-register-header")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=\"username\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Sumaya", Keys.ENTER);
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void use_of_sendKeys_then_click_by_return_key_of_laptop() throws InterruptedException {
		driver.findElement(By.id("login-register-header")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=\"username\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Sumaya", Keys.RETURN);
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void use_of_nevigate_method() throws InterruptedException {
		driver.navigate().to("https://www.cvs.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

	@Test(enabled = false)
	public void use_of_set_size_for_window() throws InterruptedException {
		System.out.println("The Size of the maximize screen is:" + driver.manage().window().getSize());
		dimension = new Dimension(700, 800);
		driver.manage().window().setSize(dimension);
		Thread.sleep(4000);
		System.out.println("The Size of the set screen is:" + driver.manage().window().getSize());
	}

	@Test(enabled = false)
	public void logoDisplayedTest2() {
		homePage.logoDisplayed();// Actual Result
		Assert.assertTrue(true);// Expected Result
	}

	@Test(enabled = false)
	public void use_of_getTitle_method_with_assertion() {
		String expected = "Welcome | USPS";
		String actual = driver.getTitle();
		System.out.println("The title of the homePage is:" + actual);
	}

	@Test(enabled = false)
	public void use_of_getTitle_method_with_soft_assertion() {
		String expected = "Welcome | USPS       ";
		String actual = driver.getTitle();
		System.out.println("The title of the homePage is:" + actual);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actual, expected, "HomePage title doesn't match");
	}

	@Test(enabled = false)
	public void use_of_mouse_hoverAction() throws InterruptedException {
		Thread.sleep(4000);
		driver.navigate().to("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement patientCare = driver
				.findElement(By.xpath("//a[normalize-space(text())='Patient Care' and @class=\"hidden-xs dropdown\"]"));
		Actions actions = new Actions(driver);
		Thread.sleep(4000);
		actions.moveToElement(patientCare).build().perform();
		System.out.println("The Title of the WebPage is:" + patientCare.getText());
	}

	@Test(enabled = false)
	public void use_of_dropDown_select_by_visibleText_method() throws InterruptedException {
		driver.navigate().to("https://www.mountsinai.org/");
		Thread.sleep(4000);
		WebElement selectLanguage1 = driver.findElement(By.xpath("//select[@class=\"goog-te-combo\"]"));
		Thread.sleep(4000);
		Select select = new Select(selectLanguage1);
		select.selectByVisibleText("Bengali");
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void use_of_select_by_index_method() throws InterruptedException {
		driver.navigate().to("https://portal.cms.gov/portal/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='cms-forgot-userid']")).click();
		Thread.sleep(4000);
		System.out.println("The Current URL is:" + driver.getCurrentUrl());
		WebElement forgotUserId = driver.findElement(By.xpath("//select[@name='cms-forgotid-birthDate']"));
		Thread.sleep(4000);
		select = new Select(forgotUserId);
		select.selectByIndex(10);
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void use_of_select_by_value_method() throws InterruptedException {
		driver.navigate().to("https://portal.cms.gov/portal/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='cms-forgot-userid']")).click();
		Thread.sleep(4000);
		System.out.println("The Current URL is:" + driver.getCurrentUrl());
		WebElement forgotUserId = driver.findElement(By.xpath("//select[@id='cms-forgotid-birthYear']"));
		Thread.sleep(4000);
		select = new Select(forgotUserId);
		select.selectByValue("1997");
		Thread.sleep(4000);
	}
	
	@Test(enabled = false)

	public void use_of_javaScriptExecutor_method_in_signInButton() throws InterruptedException {
		WebElement signInButton=driver.findElement(By.id("login-register-header"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",signInButton);
		Thread.sleep(4000);
	}
	@Test(enabled = false)
	public void loggerPositiveMethodTest() throws InterruptedException {
		homePage.loggerPositiveMethod();
	}
	@Test(enabled = false)
	public void use_of_sendKeys_method_by_javaScriptExecutor_then_click() throws InterruptedException {
		WebElement signInButton=driver.findElement(By.id("login-register-header"));
		Thread.sleep(4000);
		js.executeScript("arguments[0].click()",signInButton);
		Thread.sleep(4000);
		WebElement userName=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		js.executeScript("arguments[0].click()",userName);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Sumaya' ",userName );
		Thread.sleep(4000);
	}
	@Test(enabled = false)
	public void use_of_hidden_element_by_selenium_method() throws InterruptedException {
		driver.navigate().to("https://enthrallit.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id=\"formButton3\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='form-control']//parent::form[@id='form3']")).sendKeys("April2023");
	}
	@Test(enabled = false)
	public void use_of_hidden_element_by_JavascriptExecutor() throws InterruptedException {
		driver.navigate().to("https://enthrallit.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id=\"formButton3\"]")).click();
		WebElement searchField=driver.findElement(By.xpath("//input[@class='form-control']//parent::form[@id='form3']"));
		js.executeScript("arguments[0].value='April2023' ", searchField);
	}
	@Test(enabled = false)
	public void use_of_explicitly_wait_number1() throws InterruptedException {
		driver.navigate().to("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(4000);
		WebElement patientCare=	driver.findElement(By.xpath("//a[normalize-space(text())='Patient Care' and @class='hidden-xs dropdown']"));
		wait.until(ExpectedConditions.visibilityOf(patientCare)).click();
	}
	@Test(enabled = false)
	public void use_of_explicitly_wait_number2() throws InterruptedException {
		driver.navigate().to("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"))).click();
	}
	@Test(enabled = false)
	public void use_of_scrollDown_and_scrollUp_by_actions_class() throws InterruptedException {
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(4000);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		Thread.sleep(4000);
	}
	@Test
	public void use_of_scrollDown_and_scrollUp_by_javaScriptExecutor() throws InterruptedException {
		js.executeScript("window.scrollBy(0,900)","");//Scroll Down till 2000 px
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-900)","");//Scroll Up 
		Thread.sleep(4000);
	}

}
