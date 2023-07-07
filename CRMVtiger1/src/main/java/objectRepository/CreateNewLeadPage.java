package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage {
	
	public WebElement getNewleadinformation() {
		return newleadinformation;
	}

	public WebElement getFirstnameTF() {
		return firstnameTF;
	}

	public WebElement getDeleteicon() {
		return deleteicon;
	}

	public WebElement getDeletebutton() {
		return deletebutton;
	}

	

	@FindBy(xpath="//a[text()='Leads']")
	private WebElement leadlink;
	
	@FindBy(xpath="//img[@title=\"Create Lead...\"]")
	private WebElement leadbutton;
	
	@FindBy(name="firstname")
	private WebElement firstnameTF;
	
	@FindBy(name="lastname")
	private WebElement lastName;
	
	@FindBy(name="company")
	private WebElement companyName;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"][1]")
	private WebElement saveButton;
	
	@FindBy(name="Duplicate")
	private WebElement duplicatebutton;
	
	
	@FindBy(name="Delete")
	private WebElement deletebutton;
	
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement deleteicon;
	
	@FindBy(xpath="//span[@class=\"dvHeaderText\"]")
	private WebElement newleadinformation;
	
	

	public WebElement getDuplicatebutton() {
		return duplicatebutton;
	}

	public WebElement getLeadlink() {
		return leadlink;
	}

	public WebElement getLeadbutton() {
		return leadbutton;
	}

	public CreateNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	

}
