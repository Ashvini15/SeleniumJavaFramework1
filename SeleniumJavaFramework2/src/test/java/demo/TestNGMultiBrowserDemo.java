package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestNGMultiBrowserDemo {
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir"); 
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		
		System.out.println("Browser Name is : "+browserName);
		System.out.println("Thread id is:"+Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", projectPath+"\\Drivers\\iedriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		
		
		
		
		//go to google.com
		driver.get("https://google.com");
		
	}
	@BeforeTest
	public void test1() throws Exception {
		driver.get("https://google.com");
		Thread.sleep(4000);
	}
	@AfterTest
	public void teardown() {
		driver.close();
//		driver.quit();
		System.out.println("Test Completed successfully");
	}
}
