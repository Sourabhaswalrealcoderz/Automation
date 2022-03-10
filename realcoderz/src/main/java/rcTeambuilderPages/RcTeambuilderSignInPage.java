package rcTeambuilderPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RcTeambuilderSignInPage extends RcTeambuilderFunctions {
	
	
WebDriver driver;
	
	
	
	public RcTeambuilderSignInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	
	public void enterEmail(String args) {
		driver.findElement(By.id("username")).sendKeys(args);
	}
	public void enterpassword(String args) {
		driver.findElement(By.id("password")).sendKeys(args);
	}
	
	public void login() {
		driver.findElement(By.id("login")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement icon=driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div[3]/div/nav/div/ul/li[2]/a/div/small"));
		clickOn(driver, icon, 10);
		
		Actions action =new Actions(driver);
		WebElement loginas=driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div[3]/div/nav/div/ul/li[2]/div/div[2]/a"));
		
		action.moveToElement(loginas).build().perform();
		
		WebElement hrtab=driver.findElement(By.xpath("//a[contains(text(),'Human Resource')]"));
		clickOn(driver, hrtab, 10);
		
		
	}
	

}
