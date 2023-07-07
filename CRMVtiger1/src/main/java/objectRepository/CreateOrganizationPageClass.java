package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPageClass {
	
	public WebElement getOrganizationNameTF() {
		return OrganizationNameTF;
	}

	public WebElement getIndustryDropdown() {
		return IndustryDropdown;
	}

	public WebElement getAccountTypeDropdown() {
		return accountTypeDropdown;
	}

	public WebElement getGroupRadioButton() {
		return GroupRadioButton;
	}

	public WebElement getAssignedtoDropdon() {
		return assignedtoDropdon;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

	public WebElement getFinalConfirmationtext() {
		return FinalConfirmationtext;
	}

	public CreateOrganizationPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "accountname")
	private WebElement OrganizationNameTF;
	  
	@FindBy(name = "industry")
	private WebElement IndustryDropdown;

	@FindBy(name = "accounttype")
	private WebElement accountTypeDropdown;

	@FindBy(xpath = "//input[@value='T']")
	private WebElement GroupRadioButton;


	@FindBy(name = "assigned_group_id")
	private  WebElement assignedtoDropdon;

	@FindBy(xpath = "(//input[@title=\"Save [Alt+S]\"])[2]")
	private WebElement savebutton;

	@FindBy(xpath = "//span[@class='dvHeaderText']")    //span[@class='dvHeaderText']
	private WebElement FinalConfirmationtext;
}



	
