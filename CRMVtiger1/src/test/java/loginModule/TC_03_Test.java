package loginModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlibraries.BaseClass;
import genericlibraries.LiestenerImplementation;
@Listeners(genericlibraries.LiestenerImplementation.class)


public class TC_03_Test extends BaseClass {
	@Test
	public void CreateleadAndDuplicatelead() throws InterruptedException  {
		createlead.getLeadlink().click();
		LiestenerImplementation.logger.log(Status.INFO, "clicked on lead link");
		createlead.getLeadbutton().click();
		LiestenerImplementation.logger.log(Status.INFO, "clicked o lead button");
		createlead.getFirstnameTF().sendKeys(ppt.readingdataFromPropertyFile("firstname"));
		LiestenerImplementation.logger.log(Status.INFO, "first name is entered");
		createlead.getLastName().sendKeys(ppt.readingdataFromPropertyFile("lastname"));
		LiestenerImplementation.logger.log(Status.INFO, "last name is entered");
		createlead.getCompanyName().sendKeys(ppt.readingdataFromPropertyFile("company"));
		LiestenerImplementation.logger.log(Status.INFO, "company name is entered");
		createlead.getSaveButton().click();
		if(createlead.getNewleadinformation().isDisplayed()) {
			LiestenerImplementation.logger.log(Status.PASS, "lead name is displayed");
		}
		else
		{
			LiestenerImplementation.logger.log(Status.FAIL, "leadname is not displayed");
		}
		createlead.getDuplicatebutton().click();
		LiestenerImplementation.logger.log(Status.INFO, "clicked on duplicate button");
		Thread.sleep(4000);
		
		createlead.getSaveButton().click();
		if(createlead.getNewleadinformation().isDisplayed()) {
			LiestenerImplementation.logger.log(Status.PASS, "duplicate lead is created");
		}
		else
		{
			LiestenerImplementation.logger.log(Status.FAIL, "duplicate lead is not created");
		}
				createlead.getDeletebutton().click();
				LiestenerImplementation.logger.log(Status.INFO, "clicked on delete button");
				Thread.sleep(4000);
				driver.switchTo().alert().accept();
				LiestenerImplementation.logger.log(Status.INFO, "clicked on ok in alert popup");
				Thread.sleep(4000);
			WebElement Checkbox = driver.findElement(By.xpath("//a[contains(text(),'"+ppt.readingdataFromPropertyFile("firstname")+"')]/../..//input[@name=\"selected_id\"]"));
			LiestenerImplementation.logger.log(Status.INFO, "checkbox of the element which has to be deleted is located");
			Checkbox.click();
			LiestenerImplementation.logger.log(Status.INFO, "clciked on checkbox button");
			
			Thread.sleep(7000);

					createlead.getDeleteicon().click();
					LiestenerImplementation.logger.log(Status.INFO, "clicked on delete button");
					driver.switchTo().alert().accept();
					LiestenerImplementation.logger.log(Status.INFO, "clicked on ok in alet popup");
					Thread.sleep(7000);

		
		
	}}
		
