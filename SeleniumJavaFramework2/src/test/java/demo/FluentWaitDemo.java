package demo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		test();
	}
	public static void test() throws Exception {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("seven wonders");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//driver.findElement(By.linkText("New 7 Wonders of the World")).click();
		
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(30))
	                .pollingEvery(Duration.ofSeconds(2))
	                .ignoring(NoSuchElementException.class);
		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       WebElement linkElement =  driver.findElement(By.linkText("The Seven Wonders - Ancient History Encyclopedia"));
		       if(linkElement.isEnabled()) {
		    	   System.out.println("Element found using Fluent Wait)");   
		       }
		       return linkElement;
		     }
		   });
		   element.click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
