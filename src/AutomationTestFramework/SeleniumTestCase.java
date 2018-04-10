package AutomationTestFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.testng.annotations.Test;

public class SeleniumTestCase {
	
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		testgooglrsearch();
	}
	
	@Test	
	public static void testgooglrsearch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\exe\\chromedriver_win32\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver = new ChromeDriver();	

		//it will open the google page
		driver.get("http://google.in");
		//we expect the title “Google “ should be present
		String Expectedtitle = "Google";
		//it will fetch the actual title
		String Actualtitle = driver.getTitle();
		System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
		//it will compare actual title and expected title
		
		//print out the result
		System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
		
		driver.quit();	
	}
}
