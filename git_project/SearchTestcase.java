package browsElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchTestcase {
	
@Test
	public void loginWebpage() throws InterruptedException {
		//open the login page
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techfios.com/test/billing/?ng=admin/");
	
		// login to techfios webpage
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.manage().window().maximize();
		
		// validating the search box
		
		driver.findElement(By.name("name")).sendKeys("jack");
		// clicking the enter button
		driver.findElement(By.name("name")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.close();
		
	}

}
