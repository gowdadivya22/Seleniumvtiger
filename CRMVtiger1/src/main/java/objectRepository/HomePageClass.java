package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {
	
	public WebElement getOrganizationsLink() {
		return OrganizationsLink;
	}

	public WebElement getQuickCreateDropdown() {
		return quickCreateDropdown;
	}

	public WebElement getSubjectTextfield() {
		return SubjectTextfield;
	}

	public WebElement getDatestartTF() {
		return datestartTF;
	}

	public WebElement getEndDateTF() {
		return EndDateTF;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

	public HomePageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Organizations")
	private WebElement OrganizationsLink;

	@FindBy(id = "qccombo")
	private WebElement quickCreateDropdown;
	
	@FindBy(name = "subject")
	private WebElement SubjectTextfield;
	
	@FindBy(name = "date_start")
	private WebElement datestartTF;

	@FindBy(name = "due_date")
	private WebElement EndDateTF;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebutton;
	
	

}



