package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {
private static WebDriver driver = null;
	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("MyFirstTest", "This Test checks the functionality of google");
        
        String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO,"Starting the test");
		driver.get("https://google.com");
		test1.pass("Naviated to Google");
		driver.findElement(By.name("q")).sendKeys("seven wonders");
		test1.pass("enterd the text in to Google");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Enter key hited");
		driver.close();
		driver.quit();
		test1.pass("Closed the browser");
		test1.pass("Test Completed");
		
		 // creates a toggle for the given test, adds all log events under it    
        ExtentTest test2 = extent.createTest("MyFirstTest", "This Test checks the functionality of google");
        
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		test2.log(Status.INFO,"Starting the test");
		driver.get("https://google.com");
		test2.pass("Naviated to Google");
		driver.findElement(By.name("q")).sendKeys("seven wonders");
		test2.pass("enterd the text in to Google");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test2.fail("Enter key hited");
		driver.close();
		driver.quit();
		test2.pass("Closed the browser");
		test2.pass("Test Completed");
		
		 // calling flush writes everything to the log file
        extent.flush();
	}

}
