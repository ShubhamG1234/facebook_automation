package facebook_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frames {
		public WebDriver driver;
		@BeforeMethod
		public void setup() {			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SHUBHAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			}
		@Test
		public void Frames_Functions() throws InterruptedException{
			driver.get("C:\\Users\\SHUBHAM\\Desktop\\TST\\qsp.html\\");
			driver.manage().window().maximize();
			driver.switchTo().frame(0);
			driver.findElement(By.id("t1")).sendKeys("Pinkman");
			Thread.sleep(3000);
			driver.switchTo().parentFrame();
			driver.findElement(By.id("t2")).sendKeys("27");
			Thread.sleep(2000);
			driver.close();
		}
}
