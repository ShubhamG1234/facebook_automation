import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

package.Facebook_Automation;
import org.testng.annotations.Test;

public class Screenshot{
	public static WebDriver driver;
	@BeforeTest
	public void Driver() {
		System.out.println("Chrome Driver");
		
		
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHUBHAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
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
		File Dfile = new File(".\\Facebook_Screenshot\\"+"Facebook05.png");
		FileHandler.copy(Sfile,Dfile);
		driver.close();
	}
}