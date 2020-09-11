package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {
	@Test
	@Parameters({"Name","Location"})
 public void test(String name,@Optional("Akola") String loc) {
	 System.out.println("My name is : "+name+" and I am from "+loc);
 }
}
