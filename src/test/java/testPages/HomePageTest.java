package testPages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

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

	@Test
	public void use_of_sendKeys_then_click_by_return_key_of_laptop() throws InterruptedException {
		driver.findElement(By.id("login-register-header")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=\"username\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Sumaya", Keys.RETURN);
		Thread.sleep(4000);
	}

}
