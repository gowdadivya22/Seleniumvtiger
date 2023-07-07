package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingContactpageClass 
{
	 @FindBy(xpath = "//img[@alt=\"Create Contact...\"]")
	private WebElement creatingContactPlusIcon;
	
	@FindBy(name="lastname")
	private WebElement lastNameTf;
	
	@FindBy(name="account_name")
	private WebElement organizationNameTf;
	
	@FindBy(xpath="//input[normalize-space(@value)='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/select.gif\" and contains(@onclick,'return')]")
	private WebElement existingOrganizationSelectionIcon;
	
	@FindBy(xpath="//a[text()='my org']")
	private WebElement exixtingOrganizationName;

	@FindBy(linkText = "Contacts")
	private WebElement ContactssLink;

	public WebElement getContactssLink() {
		return ContactssLink;
	}
	public WebElement getExistingOrganizationSelectionIcon() {
		return existingOrganizationSelectionIcon;
	}
	public CreatingContactpageClass(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
		
	}
	public WebElement getExixtingOrganizationName() {
		return exixtingOrganizationName;
	}

	public WebElement getCreatingContactPlusIcon() {
		return creatingContactPlusIcon;
	}

	public WebElement getLastNameTf() {
		return lastNameTf;
	}

	public WebElement getOrganizationNameTf() {
		return organizationNameTf;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	

}

	