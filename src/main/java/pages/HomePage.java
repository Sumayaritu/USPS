package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;

	public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
	
}

	@FindBy(how=How.ID,using ="home-input")
	WebElement searchButton ;
	
	@FindBy(id="mail-ship-width")
	WebElement sendButton;
	
	@FindBy(id="login-register-header")
	WebElement signInButton;

	public void clickSearchButton() throws InterruptedException {
		searchButton.click();
		Thread.sleep(4000);
	}
	public void clickSendButton() throws InterruptedException {
		sendButton.click();
		Thread.sleep(4000);
	}
	public void clickSignInButton() throws InterruptedException {
		signInButton.click();
		Thread.sleep(4000);
	}
	

	


}
