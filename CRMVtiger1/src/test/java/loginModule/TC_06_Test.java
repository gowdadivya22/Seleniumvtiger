package loginModule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlibraries.BaseClass;
import genericlibraries.LiestenerImplementation;
@Listeners(genericlibraries.LiestenerImplementation.class)

public class TC_06_Test extends BaseClass{
	@Test
	public void organizationcreating() throws InterruptedException {
		homepage.getOrganizationsLink().click();
		LiestenerImplementation.logger.log(Status.INFO, "clicked on organization link");
		orgpage.getCreateOrganizationIcon().click();
		LiestenerImplementation.logger.log(Status.INFO, "clciked on create new organization icon");

		createorgclass.getOrganizationNameTF().sendKeys(ppt.readingdataFromPropertyFile("org")+jutil.generatingRandomNumber(100));
		LiestenerImplementation.logger.log(Status.INFO, "organization name has been entered into organization text field");

		utility.selectReference(createorgclass.getIndustryDropdown()).selectByValue("Banking");
		LiestenerImplementation.logger.log(Status.INFO, "Banking has been selected in industry dropdown");
		utility.selectReference(createorgclass.getAccountTypeDropdown()).selectByValue("Customer");
		LiestenerImplementation.logger.log(Status.INFO,"Customer has been selected in getAccounttype dropdown");

		Thread.sleep(1000);
		createorgclass.getGroupRadioButton().click();
		LiestenerImplementation.logger.log(Status.INFO, "clicked on group radio button");
		

		Thread.sleep(3000);

		utility.handlingDropown(createorgclass.getAssignedtoDropdon(), 1);
		LiestenerImplementation.logger.log(Status.INFO, "under grouped dropdown element is selected");

		createorgclass.getSavebutton().click();	
	

		Thread.sleep(7000);

		if(createorgclass.getFinalConfirmationtext().isDisplayed()){
			LiestenerImplementation.logger.log(Status.INFO, "new organisation is displayed");
		}
		else {
			LiestenerImplementation.logger.log(Status.INFO, "new organisation is not displayed");
		}
			
	}}
	