package genericlibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.CreateNewLeadPage;
import objectRepository.CreateOrganizationPageClass;
import objectRepository.CreatingContactpageClass;
import objectRepository.EventCreate;
import objectRepository.HomePageClass;
import objectRepository.LoginPage;
import objectRepository.OrganizationsPageClass;

public class BaseClass {
	public static  WebDriver driver;
	public PropertiesUtility ppt=new PropertiesUtility();
	public JavaUtility jutil = new JavaUtility();
	public WebDriverUtility utility= new WebDriverUtility();

	public LoginPage login;
	public HomePageClass homepage;
	public OrganizationsPageClass orgpage;
	public CreateOrganizationPageClass createorgclass;
	public CreatingContactpageClass createcontact;
	public CreateNewLeadPage createlead;
	public EventCreate event;
	

	@BeforeClass(alwaysRun=true)
	public void LaunchingBrowser() {
		
		if(ppt.readingdataFromPropertyFile("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		
			driver=new ChromeDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}	
		
		driver.get(ppt.readingdataFromPropertyFile("url"));

		login=new LoginPage(driver);
		login.getUsernameTF().sendKeys(ppt.readingdataFromPropertyFile("username"));
		login.getPasswordTF().sendKeys(ppt.readingdataFromPropertyFile("password"));
		login.getLoginButton().click();
		
	}
	@AfterMethod(alwaysRun=true)
	public void logginOut() {
		System.out.println("logged out");
	
		System.out.println("end");
	}
	@BeforeMethod(alwaysRun=true)
	public void navigatingToApplication() {
		homepage=new HomePageClass(driver);
		orgpage=new OrganizationsPageClass(driver);
		createorgclass=new CreateOrganizationPageClass(driver);
		createcontact=new  CreatingContactpageClass(driver);
		createlead =new CreateNewLeadPage(driver);
		event=new EventCreate(driver);
		
		
		
	}
	@AfterClass(alwaysRun=true)
	public void teardownTheBrowser()
	{
	driver.navigate().refresh();
	login.getImagebutton().click();
	login.getSignoutbutton().click();
		driver.quit();
	}
}