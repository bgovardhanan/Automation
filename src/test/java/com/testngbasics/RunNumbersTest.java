package com.testngbasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RunNumbersTest {
	
	@Test (invocationCount = 3)
	  public void f() {
		System.out.println("Runnumberstest test ");
	  }
	  @BeforeMethod 
	  public void beforeMethod() {
		  
		  System.out.println("Runnumberstest before method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  
		  System.out.println("Runnumberstest after method");
	  }

}
