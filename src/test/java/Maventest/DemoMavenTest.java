package Maventest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;


public class DemoMavenTest {
	
	WebDriver driver;
	
	@Test
	public void test(){
		
		System.out.println("Welocm to Demo test of Maven Project");
		   //System.setProperty("webdriver.gecko.driver","D:\\NILESH SELENIUM\\MY SELENIUM\\SOFTWARES\\geckodriver\\geckodriver.exe");
		   driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://myclasscampus.com/home");
			
			System.out.println(driver.getTitle());	
			
		
	}

}
