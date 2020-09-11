package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	public static void main(String[] args) throws Exception{
		test();
	}
 public static void test() throws IOException, InterruptedException {
	 String projectPath = System.getProperty("user.dir"); 
	 System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tinyupload.com/");
		driver.findElement(By.name("uploaded_file")).click();
	Runtime.getRuntime().exec("E:\\FileUpload.exe");
	Thread.sleep(3000);
	//driver.close();
	
 }
}
