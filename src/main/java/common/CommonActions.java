package common;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class CommonActions {
	
		public static void clickElement(WebElement element) {
			try {
				element.click();
			} catch (NoSuchElementException | NullPointerException e) {
				e.printStackTrace();
			}

		}

		public static void inputText(WebElement element, String input) {
			try {
				element.sendKeys(input);
			} catch (NoSuchElementException | NullPointerException e) {
				e.printStackTrace();
			}
		}

	}

//HW number 2
	//1)//img[@id='at-hp-rp-img-m']

	//2)//a[@id='mail-ship-width' and @class='menuitem']
	
	//3)//a[@id='login-register-header' or @class='link-reg']
	
	//4)//a[text()='Grocery']
	
	//5)//a[contains(text(),'Orders')]




