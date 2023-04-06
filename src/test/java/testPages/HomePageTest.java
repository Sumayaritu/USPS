package testPages;



import java.sql.Driver;

import org.openqa.selenium.By;
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

	@Test(enabled =false, priority = 1)
	public void clickSignInButtonTest() throws InterruptedException {
		homePage.clickSignInButton();
	}
	
	@Test
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
		homePage.logoDisplayed();//Actual Result
		Assert.assertTrue(true);//Expected Result
	}
	
}




