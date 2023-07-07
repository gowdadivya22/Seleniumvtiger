package loginModule;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlibraries.BaseClass;
import genericlibraries.LiestenerImplementation;
@Listeners(genericlibraries.LiestenerImplementation.class)
public class TC_04_Test extends BaseClass {

	@Test
	public void creatingcontatcWithexsistingOrg() throws InterruptedException {

		createcontact.getContactssLink().click();
		LiestenerImplementation.logger.log(Status.INFO, "clicked on contacts link");
		createcontact.getCreatingContactPlusIcon().click();
		LiestenerImplementation.logger.log(Status.INFO, "clicked on create new contact button ");
		createcontact.getLastNameTf().sendKeys(ppt.readingdataFromPropertyFile("lastname"));
		LiestenerImplementation.logger.log(Status.INFO, "last name is entered");
		String parentId = driver.getWindowHandle();
		createcontact.getExistingOrganizationSelectionIcon().click();
		LiestenerImplementation.logger.log(Status.INFO, "click on existing organisation link  ");
		utility.switchingtargetPage(driver,driver.getWindowHandles(), parentId);
		LiestenerImplementation.logger.log(Status.INFO, "control is shifted to child browser");
		Thread.sleep(2000);
		createcontact.getExixtingOrganizationName().click();
		LiestenerImplementation.logger.log(Status.INFO, "existing organisation is selected");
		Thread.sleep(5000);
		utility.switchingBackToMain(driver,parentId);
		LiestenerImplementation.logger.log(Status.INFO, "control is shifted to main browser");
		Thread.sleep(2000);
		createorgclass.getSavebutton().click();


	}
}













