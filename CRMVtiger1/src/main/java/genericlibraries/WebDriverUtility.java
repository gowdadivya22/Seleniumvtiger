package genericlibraries;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * This class contains all the reusable methods of WebDriver
 * @author Admin
 *
 */
public class WebDriverUtility  implements IConstantInterface{
	public static  WebDriver driver;
/**
 * This method is used to perform drag and drop
 * @param src
 * @param Destination
 */
	
	public void dragAndDrop(WebElement src,WebElement Destination ) {
		Actions action =new Actions(driver);
		action.dragAndDrop(src, Destination).perform();
	}
	
/**
 * This method is used to right click on an element 
 */

	public void rightclick() {
		Actions action =new Actions(driver);
		action.contextClick().perform();		
	}
/**
 * This method is used to right click on an element 	
 * @param element
 */
	public void rightClick(WebElement element) {
		Actions action =new Actions(driver);
		action.contextClick(element).perform();
	}
/**
 * This method is used to double click on an element	
 */
	public void doubleclick() {
		Actions action =new Actions(driver);
		action.doubleClick().perform();
	}
	/**
	 * This method is used to double click on an element	
	 * @param element
	 */
	public void doubleclick(WebElement element) {
		Actions action =new Actions(driver);
		action.doubleClick(element).perform();
	}
	/**
	 * This method is used to mouseHover to an element
	 * @param element
	 */
	public void mouseHoveringOnElement(WebElement element) {
		Actions action =new Actions(driver);
		action.moveToElement(element).perform();
	}
	/**
	 * This method is used to select an element  from dropdown 
	 * @param dropdown
	 * @return
	 */
	public Select selectReference(WebElement dropdown) {
		Select select=new Select(dropdown);//reference
		return select;
	}
	/**
	 * This method is used to select an element  from dropdown using value
	 * @param dropdown
	 * @param Value
	 */
	public void handlingDropdown(WebElement dropdown,String Value) {
		Select select=new Select(dropdown);
		try {
			select.selectByVisibleText(Value);
		}catch(NoSuchElementException e) {
			select.selectByValue(Value);
		}
	}
	
	public void handlingDropDown(String value, WebElement dropdown)
	{
		Select select = new Select(dropdown);
				select.selectByValue(value);
	}
	/**
	 * This method is used to select an element  from dropdown using index
	 * @param dropdown
	 * @param index
	 */
	public void handlingDropown(WebElement dropdown,int index) {
		Select select=new Select(dropdown);
		select.selectByIndex(index);
	}
	/**
	 * This method is used to scroll down by using element location
	 * @param x
	 * @param y
	 */
	public void scrollingAction(int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	/**
	 * This method is used to scroll down by clicking on element
	 * @param element
	 * @param data
	 */
	public void clickingOnElement(WebElement element, String data) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	/**
	 * This method is used to enter data to textfield
	 * @param element
	 * @param Value
	 */
	public void enteringDataIntoElement(WebDriver driver,WebElement element,String Value) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='"+Value+"'",element);
	}
	/**
	 * This method is used to clear data from textfield
	 * @param element
	 * @param Value
	 */
	public void clearingDataFromElement(WebElement element,String Value) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=' '",element);
	}
	/**
	 * This method is used to switch to frame by using index
	 * @param index
	 */
	public void switchingToFrame(int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * This method is used to switch to frame using frame element
	 * @param element
	 */
	public void switchingToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * This method is used to switch back from frame
	 */
	public void switchingBackToMain() {
		driver.switchTo().defaultContent();
	}
	/**
	 * This method is used to handle alert
	 * @return
	 */
	public Alert switchToAlert() {
		Alert alert=driver.switchTo().alert();
		return alert;
	}
	/**
	 * 
	 * @param longTime
	 * @return 
	 */
	public WebDriverWait explicitWaitingStatement(int longTime) {
		WebDriverWait wait=new WebDriverWait(driver,longTime);
		return wait;
	}
	/**
	 * This method is used to switch to window
	 * @param allWindowId
	 * @param targetWindowTitle
	 */
	public void switchToWindow(Set<String> allWindowId,String targetWindowTitle) {
	for(String id:allWindowId) {
		driver.switchTo().window(id);
		if(targetWindowTitle.equalsIgnoreCase(driver.getTitle()))
				break;
		else {
			driver.close();
		}
		}
	}
	
	

//dedicatedly for vtiger
	public void switchingtargetPage(WebDriver driver,Set<String> allWindowId, String parentId) {
		for(String id:allWindowId) {
			driver.switchTo().window(id);
		}
		
	}
	public static String takingScreenshot(String screenshotName) {
		TakesScreenshot ss =(TakesScreenshot) driver;
		File photo =ss.getScreenshotAs(OutputType.FILE);
		String ldt = LocalDateTime.now().toString().replace(":", "-");
		
		String path = System.getProperty("user.dir")+SSPATH+screenshotName+""+ldt+".png";
		File destination=new File(path);
		
		try {
			FileUtils.copyFile(photo, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return path;
		
	}

	public void switchingBackToMain(WebDriver driver,String parentId) {
		driver.switchTo().window(parentId);
		
	}
	public void switchingTo() {
		driver.switchTo().defaultContent();
		
	}
}
	








	
	
	


