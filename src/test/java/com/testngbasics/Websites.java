package com.testngbasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class Websites {
	
	WebDriver driver;


	@Test
	@Parameters({"url"})
	public void web(String url) throws InterruptedException {
		driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		driver.close();
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.close();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting");
		 System.setProperty("webdriver.ie.driver",
					"C:\\mySelenium\\projects\\Automation\\src\\test\\resources\\drivers\\IEDriverServer.exe");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Done");
	}

}
