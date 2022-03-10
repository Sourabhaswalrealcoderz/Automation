package rcTeambuilderPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RcTeambuilderEmployeeOperation extends RcTeambuilderFunctions {
	
	WebDriver driver;
	Select event;
	public RcTeambuilderEmployeeOperation(WebDriver driver) {
		super();
		this.driver = driver;
	}

	
	public void uploadDocumentbyEmployee() {
		
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement  onboardemployee=driver.findElement(By.xpath("//*[@id=\"sidebarToggleTop\"]/div[1]/ul/li[2]"));
		clickOn(driver, onboardemployee, 10);
		
		
		WebElement preonboardingemployee=driver.findElement(By.xpath("//*[@id=\"menu\"]/div/ul/li[3]/a"));
		clickOn(driver, preonboardingemployee, 10);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement upload=driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/ul/li/div/div[4]/div/div[2]/div/label"));
		clickOn(driver, upload, 10);
		
		try {
			Robot robot=new Robot();
			robot.setAutoDelay(2000);
			StringSelection stringSelection=new StringSelection("C:\\Users\\Admin\\Downloads\\photo.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			robot.setAutoDelay(1000);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.setAutoDelay(1000);
			
			
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			
			
			
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement uploadclick=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/ul/li/div/div[4]/div/div[3]/div/div/div[2]/span/i"));
		clickOn(driver, uploadclick, 10);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement logout=driver.findElement(By.xpath("//*[@id=\"sidebarToggleTop\"]/a"));
		clickOn(driver, logout, 10);
		
		WebElement yeslogout=driver.findElement(By.xpath("//*[@id=\"examplelogout\"]/div/div/div[2]/a[1]"));
		clickOn(driver, yeslogout, 10);

		
		
		

		
	}
	
	

}
