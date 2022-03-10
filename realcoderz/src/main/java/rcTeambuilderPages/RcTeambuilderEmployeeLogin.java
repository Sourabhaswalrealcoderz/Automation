package rcTeambuilderPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RcTeambuilderEmployeeLogin extends RcTeambuilderFunctions{
	
	
	WebDriver driver;
	
	
	
	public RcTeambuilderEmployeeLogin(WebDriver driver) {
		super();
		this.driver = driver;
	}


	
	public void enterEmail(String args) {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(args);
	}
	public void enterpassword(String args) {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("password")).sendKeys(args);
	}
	
	public void employeeLogin() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("login")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}

	
}
