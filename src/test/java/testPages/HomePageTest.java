package testPages;

import org.testng.annotations.Test;

import BaseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
	@Test(enabled=true,priority = 2)
	public void  clickSearchButtonTest() throws InterruptedException {
		homePage.clickSearchButton();
	}
	@Test(enabled=false,priority = 3)
	public void clickSendButtonTest() throws InterruptedException {
		homePage.clickSendButton();
	}
	@Test(enabled=false,priority = 1)
	public void clickSignInButtonTest() throws InterruptedException {
		homePage.clickSignInButton();
	}
	

}
