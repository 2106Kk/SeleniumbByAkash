package tstng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngclass {
	
	@BeforeClass
	public void beforeClass() {
		
	System.out.println("before annotation");	
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method");
	}
	
	@Test
	public void test() {
		System.out.println("test");
	}
	
	@AfterClass
	public void afterlass() {
		System.out.println("after class");
	}
}
