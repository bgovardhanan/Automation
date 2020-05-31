import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class LearnTestNG {
	WebDriver driver;
  @Test
  public void bestSellers() throws InterruptedException {
	  driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
	  Thread.sleep(2000);
  }
  
  public void baby() throws InterruptedException {
	  driver.findElement(By.xpath("//a[text()='Baby']")).click();
	  Thread.sleep(2000);
  }
  
  public void masks() throws InterruptedException {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Masks");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  Thread.sleep(2000);
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(driver.getTitle());
	  System.out.println(driver.getCurrentUrl()); 
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.ie.driver",
				"C:\\mySelenium\\projects\\Automation\\src\\test\\resources\\drivers\\IEDriverServer.exe");
	  driver = new InternetExplorerDriver();
	  driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
	  driver.get("https://www.amazon.com/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
