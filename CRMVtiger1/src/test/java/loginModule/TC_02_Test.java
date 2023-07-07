package loginModule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlibraries.BaseClass;
import genericlibraries.LiestenerImplementation;
@Listeners(genericlibraries.LiestenerImplementation.class)

public class TC_02_Test extends BaseClass {
	@Test
	public void LeadWithMandatoryfields() {
		
		//passing mandatory data to lead page
		
		createlead.getLeadlink().click();
		LiestenerImplementation.logger.log(Status.INFO, "clicked on lead link");
		createlead.getLeadbutton().click();
		LiestenerImplementation.logger.log(Status.INFO, "clicked on lead button");
		createlead.getLastName().sendKeys(ppt.readingdataFromPropertyFile("lastname"));
		LiestenerImplementation.logger.log(Status.INFO, "lastname is entered into the text field ");
		createlead.getCompanyName().sendKeys(ppt.readingdataFromPropertyFile("company"));
		LiestenerImplementation.logger.log(Status.INFO, "company name is enetered into the text field");
		createlead.getSaveButton().click();
		
		
		
	}

}
