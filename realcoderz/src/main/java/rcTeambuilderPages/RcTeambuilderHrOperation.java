package rcTeambuilderPages;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RcTeambuilderHrOperation extends RcTeambuilderFunctions {

	WebDriver driver;
	Select event;

	String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	int length = 5;
	int i;
	public static String docname;
	public static String taskname;

	Random rand = new Random();

	public RcTeambuilderHrOperation(WebDriver driver) {
		super();
		this.driver = driver;
	}

	// ADD POLICY

	public void addPolicybyHr() {
		String randomString = "";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement onboard = driver
				.findElement(By.xpath("//h3[contains(text(),'Onboard')]"));
		clickOn(driver, onboard, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement hractivepolicy = driver
				.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[4]"));
		clickOn(driver, hractivepolicy, 10);
		WebElement addpolicy = driver
				.findElement(By.xpath("//body/div[@id='root']/div[@id='main-wrapper']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/i[1]"));
		clickOn(driver, addpolicy, 10);

		char[] text = new char[length];

		for (i = 0; i < length; i++) {

			text[i] = character.charAt(rand.nextInt(character.length()));

		}

		for (i = 0; i < text.length; i++) {
			randomString += text[i];

		}

		WebElement policytype = driver.findElement(By.cssSelector("#policyType"));
		sendKeys(driver, policytype, 10, randomString);
		WebElement policyname = driver.findElement(By.cssSelector("#policyName"));
		sendKeys(driver, policyname, 10, randomString);

		WebElement file = driver.findElement(By.cssSelector("#file"));
		sendKeys(driver, file, 10, "C:\\Users\\Admin\\Downloads\\Anuj.pdf");

		WebElement duedate = driver.findElement(By.cssSelector("#dueDate"));
		sendKeys(driver, duedate, 10, "25022022");

		WebElement department = driver.findElement(By.cssSelector("#department"));
		department.click();
		Select event = new Select(department);
		event.selectByValue("167");

		WebElement save = driver.findElement(
				By.xpath("//button[contains(text(),'Save')]"));
		clickOn(driver, save, 10);
		
		
		



	}

	// ADD DOCUMENT

	public void adddocumentbyHr() {
		
		String randomString = "";
		System.out.println("Debug 1");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement onboardemployes = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='main-wrapper']/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]/a[1]"));
		clickOn(driver, onboardemployes, 10);
		System.out.println("Debug 2");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement searchemployee = driver.findElement(By.xpath("//*[@id=\"search-bar-0\"]"));
		sendKeys(driver, searchemployee, 10, "employee realcoderz");
		System.out.println("Debug 3");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement preonboarding = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/span[1]/div[1]"));
		clickOn(driver, preonboarding, 10);
		System.out.println("Debug 4");

		WebElement assign = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]"));
		clickOn(driver, assign, 10);
		System.out.println("Debug 5");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement document = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[2]/div[1]/div[1]/button[1]"));
		clickOn(driver, document, 10);
		System.out.println("Debug 6");

		char[] text = new char[length];

		for (i = 0; i < length; i++) {

			text[i] = character.charAt(rand.nextInt(character.length()));

		}

		for (i = 0; i < text.length; i++) {
			randomString += text[i];

		}

		docname = new String(randomString);
		System.out.println("Document name "+docname);
		

		WebElement documentname = driver.findElement(By.xpath("//*[@id=\"documentName\"]"));
		sendKeys(driver, documentname, 10, randomString);

		WebElement countrydropdown = driver.findElement(By.xpath("//*[@id=\"countryCodeSelector\"]"));
		clickOn(driver, countrydropdown, 10);
		event = new Select(countrydropdown);
		event.selectByValue("IN");

		WebElement save = driver
				.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/center[1]/button[1]"));
		clickOn(driver, save, 10);

	}

	// ADD TASK

	public void addtaskbyHr() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String randomString = "";
		char[] text = new char[length];

		for (i = 0; i < length; i++) {

			text[i] = character.charAt(rand.nextInt(character.length()));

		}

		for (i = 0; i < text.length; i++) {
			randomString += text[i];

		}

		taskname = new String(randomString);
		System.out.println("Added task "+taskname);

		WebElement task = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]"));

		clickOn(driver, task, 10);

		WebElement taskname = driver.findElement(By.xpath("//*[@id=\"taskName\"]"));
		sendKeys(driver, taskname, 10, randomString);

		WebElement tasktype = driver.findElement(By.xpath("//*[@id=\"taskType\"]"));
		clickOn(driver, tasktype, 10);
		event = new Select(tasktype);
		event.selectByVisibleText("Prep");

		WebElement countrydropdown2 = driver.findElement(By.xpath("//*[@id=\"countryCode\"]"));
		clickOn(driver, countrydropdown2, 10);
		event = new Select(countrydropdown2);
		event.selectByValue("IN");

		WebElement save = driver
				.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/center[1]/button[1]"));
		clickOn(driver, save, 10);

	}

	public void assignDocumentbyHr() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		System.out.print("Assign document "+docname);
		String ele = "//li[contains(text(),'" + docname + "')]";
		System.out.print(ele);

		WebElement check = driver.findElement(By.xpath("//li[contains(text(),'" + docname + "')]"));
		clickOn(driver, check, 10);

		WebElement checkdocumenttype = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/div[2]/select[1]"));
		clickOn(driver, checkdocumenttype, 10);
		event = new Select(checkdocumenttype);
		event.selectByValue("Education");

		WebElement duedate = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/div[3]/div[1]/div[1]/input[1]"));
		sendKeys(driver, duedate, 10, "Feb, 25 2022");

		WebElement priority = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/div[4]/select[1]"));
		clickOn(driver, priority, 10);
		event = new Select(priority);
		event.selectByValue("High");

		JavascriptExecutor jsdown = (JavascriptExecutor) driver;

		WebElement buttonsave = driver.findElement(By.xpath("//*[@id=\"button\"]"));

		jsdown.executeScript("arguments[0].scrollIntoView();", buttonsave);

		clickOn(driver, buttonsave, 10);

		JavascriptExecutor jsup = (JavascriptExecutor) driver;

		jsup.executeScript("window.scrollTo(document.body.scrollHeight, 0)");

	}

	public void assignTaskbyHr() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.print("Assign task "+ taskname);

		WebElement tasktab = driver
				.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/b[2]/input[1]"));
		clickOn(driver, tasktab, 10);
		WebElement taskcheck = driver.findElement(By.xpath("//li[contains(text(),'" + taskname + "')]"));
		clickOn(driver, taskcheck, 10);

		WebElement priority = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/div[2]/select[1]"));
		event = new Select(priority);
		event.selectByValue("Medium");

		WebElement duedate = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/div[3]/div[1]/div[1]/input[1]"));
		sendKeys(driver, duedate, 10, "Feb, 25 2022");

		WebElement poc = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/div[4]/select[1]"));
		event = new Select(poc);
		event.selectByValue("206,Priti Chauhan");

		JavascriptExecutor jsdown = (JavascriptExecutor) driver;

		WebElement buttonsave = driver.findElement(By.xpath("//button[@id='button']"));

		jsdown.executeScript("arguments[0].scrollIntoView();", buttonsave);

		clickOn(driver, buttonsave, 10);
		JavascriptExecutor jsup = (JavascriptExecutor) driver;

		WebElement logout=driver.findElement(By.xpath("//*[@id=\"sidebarToggleTop\"]/a"));
		clickOn(driver, logout, 10);
		
		WebElement yeslogout=driver.findElement(By.xpath("//*[@id=\"examplelogout\"]/div/div/div[2]/a[1]"));
		clickOn(driver, yeslogout, 10);

	}
	
	
	
	
	
	
	
	

}
