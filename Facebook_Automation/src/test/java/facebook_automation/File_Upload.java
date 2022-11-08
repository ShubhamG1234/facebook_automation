package facebook_automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class File_Upload {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHUBHAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
	@Test
	public void auto_IT() throws InterruptedException, IOException{
		driver.get("https://www.freepdfconvert.com/pdf-to-word");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Choose PDF file')]")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Users\\SHUBHAM\\Desktop\\TST\\Upload_method.au3\\");
		Thread.sleep(3500);	
	}
	@Test
	public void File_Upload_multiple() throws InterruptedException{
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.findElement(By.xpath("//input[@type='file'][@multiple='RRR_UHD (10 Mb).jpg','RRR_UHD (3 Mb) gjjhffj.jpg']")).sendKeys("C:\\Users\\SHUBHAM\\Desktop\\TST\\RRR_UHD (10 Mb).jpg\\","C:\\Users\\SHUBHAM\\Desktop\\TST\\RRR_UHD (3 Mb) gjjhffj.jpg\\");
		Thread.sleep(3500);
		driver.findElement(By.xpath("//button[@type='button'][@ng-click='item.upload()']")).click();
		Thread.sleep(2500);
	}
	@Test
	public void File_Upload_single() throws InterruptedException{
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='file'][@single='RRR_UHD (10 Mb).jpg']")).sendKeys("C:\\Users\\SHUBHAM\\Desktop\\TST\\RRR_UHD (10 Mb).jpg\\");
		Thread.sleep(3500);
		driver.findElement(By.xpath("//button[@type='button'][@ng-click='item.upload()']")).click();
		Thread.sleep(2500);
	}
}
