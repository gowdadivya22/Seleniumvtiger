package loginModule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlibraries.BaseClass;
import genericlibraries.LiestenerImplementation;
@Listeners(genericlibraries.LiestenerImplementation.class)
public class TC_05_Test extends BaseClass {
	
	@Test
	public void ceateEvenetTestcase() throws InterruptedException {
		//pass
		event.getQuickCreateDropdown().click();
		LiestenerImplementation.logger.log(Status.INFO, "clicked on  quick create dropdown");
	
		utility.handlingDropDown("Events", event.getQuickCreateDropdown());
		LiestenerImplementation.logger.log(Status.INFO, "clicked on new event options");
		Thread.sleep(5000);
		
		event.getSubjectTextfield().sendKeys("demo");
		LiestenerImplementation.logger.log(Status.INFO, "enter subject in the subject text field");
		
		//homepage.getDatestartTF().sendKeys("2023-07-25");
		utility.enteringDataIntoElement(driver,event.getDatestartTF(), "2023-07-25");
		LiestenerImplementation.logger.log(Status.INFO, "starting date is entered");
		
		Thread.sleep(2000);
		
		//homepage.getEndDateTF().sendKeys("2023-07-27");
		
		utility.enteringDataIntoElement(driver,event.getEndDateTF(), "2023-07-27");
		LiestenerImplementation.logger.log(Status.INFO, "end date is entered");

		Thread.sleep(2000);

		event.getSavebutton().click();
		LiestenerImplementation.logger.log(Status.INFO, "clicked on save button");
}


 



	}
	


	



