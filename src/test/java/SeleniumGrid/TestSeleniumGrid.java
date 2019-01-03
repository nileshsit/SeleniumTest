package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestSeleniumGrid {


	@Test
	public void test1() throws MalformedURLException{
		
		//System.setProperty("webdriver.gecko.driver","D:\\NILESH SELENIUM\\MY SELENIUM\\SOFTWARES\\geckodriver\\geckodriver.exe");
		
  	   DesiredCapabilities cap = DesiredCapabilities.firefox();
  	   cap.setVersion("58.0.1");
	   cap.setCapability("marionette", true);
		cap.setPlatform(Platform.WINDOWS);
			
		// URL url=new URL("http://192.168.1.200:4444/wd/hub");
		URL url=new URL("http://192.168.1.200:5555/wd/hub");
		 WebDriver driver = new RemoteWebDriver(url, cap);
		
		 driver.get("http://myclasscampus.com/home");
		 System.out.println("Title is"+ driver.getTitle());
		 
		 
		 URL url3=new URL("http://192.168.1.29:5555/wd/hub"); //Node IP Address 
		 WebDriver driver3 = new RemoteWebDriver(url3, cap);
		
		 driver3.get("http://myclasscampus.com/home");
		 System.out.println("Machine3 uprunning site and Title is: "+ driver3.getTitle());
		
		 URL url4=new URL(" http://192.168.1.61:5555/wd/hub"); //Node IP Address 
		 WebDriver driver4 = new RemoteWebDriver(url4, cap);
		
		 driver4.get("http://myclasscampus.com/home");
		 System.out.println("Machine4 uprunning site and Title is: "+ driver4.getTitle());
	

		 cap.setVersion("46.0.1"); //to run script on firefox 46.0.1 version 
		 
		 URL url2 = new URL("http://192.168.1.18:5555/wd/hub"); //Node IP Address 
		 WebDriver driver2 = new RemoteWebDriver(url2, cap);
		
		 driver2.get("http://myclasscampus.com/home");
		 System.out.println("Machine2 uprunning site and Title is: "+ driver2.getTitle());
		
		
	}
}
