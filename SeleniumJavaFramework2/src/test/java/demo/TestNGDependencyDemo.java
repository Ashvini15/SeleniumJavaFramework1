package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	@Test(dependsOnMethods = {"test2"},priority=1)
	public void test1() {
	System.out.println("Test 1");	
	}
	@Test(dependsOnGroups = "sanity1" )
	public void test2() {
	System.out.println("Test 2");	
	}
	@Test(groups="sanity1")
	public void test3() {
		System.out.println("Test 3");	
		}

}
