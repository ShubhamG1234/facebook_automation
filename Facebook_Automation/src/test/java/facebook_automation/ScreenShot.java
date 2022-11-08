package facebook_automation;

import java.io.File;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShot {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {	
		//Scanner scan = new Scanner(System.in);
		//int val = scan.nextInt();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHUBHAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		}
	@Test
	public void Take_Screenshot() throws IntrruptedException, IOException{
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='email']"));
		mobileNumber.sendKeys("9011669513");
		WebElement Password = driver.findElement(By.cssSelector("#Pass123"));
		Password.sendKeys("Password1234");
		TakeScreenshot ts = (TakeScreenshot)driver;
		File Sfile = ts.getScreenshotAs(OutputType,FILE);
		File Dfile = new File(".\\Facebook_Screenshot\\"+"Facebook0001.png");
		FileHandler.copy(Sfile,Dfile);
		driver.close();
	}
}
