package genericlibraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1234 
{
	@Test(dataProvider="testdata",dataProviderClass=ExcelUtility.class)
	public void readingDataUsingDataProvider(String username, String password) throws InterruptedException
	{

	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys(password);
	
	driver.close();
	}
}