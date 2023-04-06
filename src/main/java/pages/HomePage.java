package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "home-input")
	WebElement searchButton;

	@FindBy(id = "mail-ship-width")
	WebElement sendButton;

	@FindBy(id = "login-register-header")
	WebElement signInButton;
	
	@FindBy (xpath="//input[@name=\"username\"]")
	WebElement userName;
	
	@FindBy (xpath="//img[@src=\"https://www.usps.com/global-elements/header/images/utility-header/logo-sb.svg\"]")
	WebElement logo;

	public void clickSearchButton() throws InterruptedException {
		searchButton.click();
		Thread.sleep(4000);
	}

	public void clickSendButton() throws InterruptedException {
		sendButton.click();
		Thread.sleep(4000);
	}

	public void clickSignInButton() throws InterruptedException {
		clickElement(signInButton);
		Thread.sleep(4000);
	}

	public void inputTextInSearchButton() throws InterruptedException {
		searchButton.sendKeys("11223344");
		Thread.sleep(4000);
	}
	public boolean logoDisplayed() {
	boolean uspsLogo=	logo.isDisplayed();
		System.out.println("Is the Logo Displayed?"+uspsLogo);
		return false;
	}
	public void clickSignInThenClickUserNameThenInputText() throws InterruptedException {
		clickElement(signInButton);
		Thread.sleep(4000);
		clickElement(userName);
		Thread.sleep(4000);
		inputText(userName,"Sumaya123");
		Thread.sleep(4000);
	}


}
