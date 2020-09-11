package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		googleSearchPageTest();
	}
	
	public static void googleSearchPageTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects obj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://google.com");
		obj.setTextInSearchBox("Seven wonders");
		obj.clickSearchBox(); 
		driver.close();
		System.out.println("Test completed successfully by usin POM");
		
		
	}
	
}
