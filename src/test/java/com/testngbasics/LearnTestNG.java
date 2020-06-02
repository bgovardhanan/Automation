package com.testngbasics;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class LearnTestNG {
	WebDriver driver;
  @Test  (priority = 2, groups = "Links", dependsOnGroups = "Search")
  public void bestSellers() throws InterruptedException {
	  driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
	  Thread.sleep(4000);
  }
  
  @Test  (priority = 3, groups = "Links", expectedExceptions = IOException.class)
  public void baby() throws InterruptedException {
	  driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
	  Thread.sleep(4000);
	  driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[text()='Baby']")).click();
	  Thread.sleep(4000);
  }
  
  @Test (priority = 1, groups = "Search", invocationCount = 2 )
  public void masks() throws InterruptedException {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Masks");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  
	  
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.ie.driver",
				"C:\\mySelenium\\projects\\Automation\\src\\test\\resources\\drivers\\IEDriverServer.exe");
	  driver = new InternetExplorerDriver();
	  driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
	  driver.get("https://www.amazon.com/");
	  Thread.sleep(3000);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
	  System.out.println(driver.getTitle());
	  System.out.println(driver.getCurrentUrl()); 
	  
	 //Assert.assertEquals(driver.getTitle(), "Amazon.com : Masks", "Matched");
	  
	  driver.close();
	  
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Starting selenium");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Test Complete");
  }

}
