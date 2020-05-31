package seleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EbayTestcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver",
				"C:\\mySelenium\\projects\\Automation\\src\\test\\resources\\drivers\\IEDriverServer.exe");

		// TC1 Open amazon
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		System.out.println("Test Case 1:");
		System.out.println(driver.getTitle());
		System.out.println("Title Length" + driver.getTitle().length());
		// System.out.println(driver.getPageSource());
		// List<WebElement> alist = driver.findElements(By.tagName("a"));
		// WebElement e = driver.findElement(By.tagName("a"));
		// System.out.println(alist.size());

		
		  //TC2 Click Best Seller System.out.println("Test Case 2:");
		  driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
		  Thread.sleep(4000); System.out.println(driver.getTitle());
		  System.out.println("Title Length" + driver.getTitle().length());
		  System.out.println(driver.getCurrentUrl()); 
		  System.out.println("URL Length" + driver.getCurrentUrl().length());
		  
		  //TC3 Click Baby System.out.println("Test Case 3:");
		  driver.findElement(By.xpath("//a[text()='Baby']")).click();
		  Thread.sleep(4000); System.out.println(driver.getTitle());
		  System.out.println("Title Length" + driver.getTitle().length());
		  System.out.println(driver.getCurrentUrl()); System.out.println("URL Length" +
		  driver.getCurrentUrl().length());
		  
		  //TC4 Goback to Best Sellers page using navigate
		  System.out.println("Test Case 4:"); driver.navigate().back();
		  Thread.sleep(4000); System.out.println(driver.getTitle());
		  System.out.println("Title Length" + driver.getTitle().length());
		  System.out.println(driver.getCurrentUrl()); System.out.println("URL Length" +
		  driver.getCurrentUrl().length());
		  
		  //TC5 Validate all headsing Heading System.out.println("Test Case 5:");
		  Thread.sleep(4000); List<WebElement> alist =
		  driver.findElements(By.tagName("h3"));
		  System.out.println("Headings validation" + alist.size());
		  System.out.println(driver.findElement(By.xpath("//h3[text()='Toys & Games']")
		  ).getText());
		  System.out.println(driver.findElement(By.xpath("//h3[text()='Electronics']"))
		  .getText()); System.out.println(driver.findElement(By.
		  xpath("//h3[text()='Camera & Photo']")).getText());
		  System.out.println(driver.findElement(By.xpath("//h3[text()='Video Games']"))
		  .getText());
		  System.out.println(driver.findElement(By.xpath("//h3[text()='Books']")).
		  getText()); System.out.println(driver.findElement(By.
		  xpath("//h3[text()='Clothing, Shoes & Jewelry']")).getText());
		 

		// TC6 Search masks
			System.out.println("Test Case 6:");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Masks");
			Thread.sleep(1000);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
			// driver.findElement(By.xpath("//input[@type='submit']")).click();

			//TC8
			Thread.sleep(2000);
			
			
		// System.out.println("Tag vales" + alist.get(1));
		// int listlength = 0;
		// while (listlength < alist.size())
		// {
		// System.out.println(alist.get(listlength));
		// }

		driver.close();
		// List<String> obj = new ArrayList<String>();

	}

}
