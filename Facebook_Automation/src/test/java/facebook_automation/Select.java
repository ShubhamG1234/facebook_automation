package facebook_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Select {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHUBHAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
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
