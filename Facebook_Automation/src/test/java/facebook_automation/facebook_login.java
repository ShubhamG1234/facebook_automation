package facebook_automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class facebook_login {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHUBHAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
@Test
public void loginPage()
{
	
	driver.get("http://www.facebook.com/");
   driver.manage().window().maximize();
   driver.findElement(By.name("email")).sendKeys("XYZ");
   
   driver.findElement(By.name("pass")).sendKeys("Pass123");
   //driver.findElement(By.cssSelector("input#pass")).sendKeys("iuhrglsjhur");
   //driver.findElement(By.partialLinkText("Forgotton")).click();
   
    String title = driver.getTitle();
    System.out.println(title);
    String url = driver.getCurrentUrl();
    System.out.println(url);
    String source = driver.getPageSource();
    System.out.println(source);
    driver.navigate().to("http://www.google.com/");
    driver.navigate().back();
    driver.navigate().refresh();
    driver.navigate().forward();
    //Thread.sleep(6000); //in miliSeconds
    //driver.nto("http://www.flipkart.com/");
    //driver.close();
    
}




@Test
public void New_User()throws InterruptedException{
	WebElement element = driver.findElement(By.id("mtr"));
	Select sct=new Select(element);
	Boolean listboxType=sct.isMultiple();
	System.out.println(listboxType);
	List <WebElement>list =sct.getOptions();
	int size =list.size();
	System.out.println("Element Count is"+size );
	for (WebElement welement : list){
		String text = welement.getText();
		System.out.println(text);
	}
	sct.selectByIndex(0);
	sct.selectByValue("V");
	sct.selectByVisibleText("Samosa");
	List <WebElement> list2 =sct.getAllSelectedOptions();
	int size2 = list2.size();
	System.out.println(size2);
	for (WebElement welement2 : list2){
		String text2 = welement2.getText();
		System.out.println(text2);
	}
	sct.deselectByIndex(0);
	sct.selectByValue("V");
	sct.selectByVisibleText("Kachori");
	Thread.sleep(3000);
	
	sct.selectByValue("V");
	sct.selectByVisibleText("Kachori");
	WebElement firstSelectElement= sct.getFirstSelectedOption();
	String FirstSelectElement= firstSelectElement.getText();
	System.out.println("First select element: "+FirstSelectElement);
	Thread.sleep(3500);
	sct.deselectAll();
}



}
