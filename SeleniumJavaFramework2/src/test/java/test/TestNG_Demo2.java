package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {

	  static WebDriver driver= null;
	  @BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir"); 
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	  @Test
	public static void googleSearch2() {
		//go to google.com
		driver.get("https://google.com");
		//enter text in searchbox
		driver.findElement(By.name("q")).sendKeys("seven wonders");
		//Click on Search button
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	  @Test
		public static void googleSearch3() {
			//go to google.com
			driver.get("https://google.com");
			//enter text in searchbox
			driver.findElement(By.name("q")).sendKeys("seven wonders");
			//Click on Search button
			driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		}
	  @AfterTest
	public void tearDownTest() {
		driver.close();
		System.out.println("Test Completed successfully");
	}

}
