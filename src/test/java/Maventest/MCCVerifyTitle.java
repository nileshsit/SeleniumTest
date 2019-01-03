package Maventest;

import library.Utility;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

//import MCC1.SendReportEmail;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MCCVerifyTitle {
	
	ExtentReports report;
	ExtentTest logger; 
	WebDriver driver;
	
	@Test
	public void verifyBlogTitle()
	{
		
	 System.setProperty("webdriver.gecko.driver","D:\\NILESH SELENIUM\\MY SELENIUM\\SOFTWARES\\geckodriver\\geckodriver.exe");

	 report=new ExtentReports("D:\\NILESH SELENIUM\\EXTENTREPORT_OUTPUT\\myccVerifyTitle.html");
	 //report=new ExtentReports("D:\\server_automation\\myCCVerifyTitle.html");
	 //report=new ExtentReports("/var/log/apache2/myCCVerifyTitle.html");

	logger=report.startTest("Verify MyCC HomePage Title");

		  	   
	  driver = new FirefoxDriver();
	
	driver.manage().window().maximize();

	logger.log(LogStatus.INFO, "Browser started ");

	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
	
	driver.get("http://myclasscampus.com/home");
	
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
	
	logger.log(LogStatus.INFO, "Application is up and running");

	
	String title=driver.getTitle();
	
	Assert.assertTrue(title.contains("Google")); 

	logger.log(LogStatus.PASS, "Title verified");
	
	
	}
	

	@AfterMethod
	public void tearDown(ITestResult result) throws EmailException, InterruptedException
	{
		
		
	if(result.getStatus()==ITestResult.FAILURE)
	{

	Thread.sleep(10000);	 
	String screenshot_path=Utility.captureScreenshot(driver, result.getName());
	String image= logger.addScreenCapture(screenshot_path);
	logger.log(LogStatus.FAIL, "Title is not verified");
	logger.log(LogStatus.FAIL, "Title verification", image);


	}
    
	report.endTest(logger);
	report.flush();
	
	 SendReportEmail.sendEmail();
	
	//driver.get("D:\\NILESH SELENIUM\\EXTENTREPORT_OUTPUT\\mycc1.html");
	}

}
