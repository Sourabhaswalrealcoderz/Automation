package rcTeambuilderPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RcTeambuilderFunctions {
	
	
public static  void sendKeys(WebDriver driver1, WebElement element, int Timeout , String value) {
		
		try {
			new WebDriverWait(driver1,Timeout).until(ExpectedConditions.visibilityOf(element));
			Thread.sleep(2000);
			element.sendKeys(value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void clickOn(WebDriver driver1, WebElement element, int Timeout ) {
		
		
		try {
			new WebDriverWait(driver1, Timeout).until(ExpectedConditions.elementToBeClickable(element));
			Thread.sleep(2000);
			element.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void clear(WebDriver  driver1, WebElement element, int Timeout) {
		
		
		try {
			new WebDriverWait(driver1, Timeout).until(ExpectedConditions.visibilityOf(element));
			Thread.sleep(2000);
			element.clear();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
