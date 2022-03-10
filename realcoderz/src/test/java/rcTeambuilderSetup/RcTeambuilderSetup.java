package rcTeambuilderSetup;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import rcTeambuilderPages.RcTeambuilderEmployeeLogin;
import rcTeambuilderPages.RcTeambuilderEmployeeOperation;
import rcTeambuilderPages.RcTeambuilderHrOperation;
import rcTeambuilderPages.RcTeambuilderSignInPage;

public class RcTeambuilderSetup {
	
	
		String driverPath = ".\\driver\\chromedriver.exe";
		WebDriver driver;
		RcTeambuilderSignInPage obRcTeambuilderSignInPage;
		RcTeambuilderHrOperation obRcTeambuilderHrOperation;
		RcTeambuilderEmployeeLogin obTeambuilderEmployeeLogin;
		RcTeambuilderEmployeeOperation obTeambuilderEmployeeOperation;
	
		
		
		
		
		
		
		@Test(priority=1)
		public void setup() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://realplatformui-hwr7nalbaq-uc.a.run.app/");
		}
		
		
		
		@Test(priority=2)
		public void hrSignIn() {
			obRcTeambuilderSignInPage=new RcTeambuilderSignInPage(driver);
			obRcTeambuilderSignInPage.enterEmail("sourabhselenium@yahoo.com");
			obRcTeambuilderSignInPage.enterpassword("@Swal15121998");
			obRcTeambuilderSignInPage.login();
			
		}
		
		
		@Test(priority=3)
		public void addPolicy() {
			obRcTeambuilderHrOperation =new RcTeambuilderHrOperation(driver);
			obRcTeambuilderHrOperation.addPolicybyHr();
		}


		@Test(priority=4)
		public void adddocument() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			obRcTeambuilderHrOperation=new RcTeambuilderHrOperation(driver);
		obRcTeambuilderHrOperation.adddocumentbyHr();
		}


		@Test(priority=5)
		public void addTask() {
			obRcTeambuilderHrOperation=new RcTeambuilderHrOperation(driver);
			obRcTeambuilderHrOperation.addtaskbyHr();
		}



		@Test(priority=6)
		public void assignDocument() {
			obRcTeambuilderHrOperation=new RcTeambuilderHrOperation(driver);
			obRcTeambuilderHrOperation.assignDocumentbyHr();
		}


		@Test(priority=7)
		public void assignTask() {
			obRcTeambuilderHrOperation=new RcTeambuilderHrOperation(driver);
			obRcTeambuilderHrOperation.assignTaskbyHr();
		}



		

		
		@Test(priority=8)
		public void employeeSignIn() {
			try {
				Thread.sleep(9000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			obTeambuilderEmployeeLogin=new RcTeambuilderEmployeeLogin(driver);
			obTeambuilderEmployeeLogin.enterEmail("employeerealcoderz@yahoo.com");
			obTeambuilderEmployeeLogin.enterpassword("@Swal15121998");
			obTeambuilderEmployeeLogin.employeeLogin();
			
			
			
		}
		
		
		
		@Test(priority=9)
		public void uploadDocument() {
			obTeambuilderEmployeeOperation=new RcTeambuilderEmployeeOperation(driver);
			obTeambuilderEmployeeOperation.uploadDocumentbyEmployee();
			
		}
		
		
		
		@Test(priority=10)
		public void hrLoginAgain() {
			try {
				Thread.sleep(9000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			obRcTeambuilderSignInPage=new RcTeambuilderSignInPage(driver);
			obRcTeambuilderSignInPage.enterEmail("sourabhselenium@yahoo.com");
			obRcTeambuilderSignInPage.enterpassword("@Swal15121998");
			obRcTeambuilderSignInPage.login();
			
			
		}
		
		
	
		
		
		@Test(priority=11)
		public void closedDriver() {
			driver.close();
		}

		

}
