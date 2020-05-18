package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class ViewSelectedTimeSheetDetails {
WebDriver driver;
	
	public  ViewSelectedTimeSheetDetails(WebDriver driver){
		this.driver=driver;
	    PageFactory.initElements(driver,this);
	    		   	}
	@FindBy(xpath="//td[contains(text(),'8789')]")
	public WebElement timesheetno;
	
	@FindBy(xpath="//td[contains(text(),'Middleton Grove')]")
	public WebElement client;
	
	@FindBy(xpath="//td[contains(text(),'Ramona')]")
	public WebElement worker;
	
	@FindBy(xpath="//td[contains(text(),'Mar 31, 2020')]")
	public WebElement weekdate;
	
	@FindBy(xpath="//td[contains(text(),'Pending')]")
	public WebElement approvalstats;
	
	@FindBy(xpath="/html/body/header/div[1]/div/div[2]/div[1]/ul/li[2]/a")
	public WebElement userclick;
	
	@FindBy(xpath="/html/body/header/div[1]/div/div[2]/div[1]/ul/li[2]/ul/div/li[2]/a")
	public WebElement logout;
	// dont use copy xpath
	@FindBy(linkText="Dashboard")
	public WebElement dashboard;
	
	public String getViewTimesheetno() {
		return timesheetno.getText();
	}
	public String getViewClient() {
		
		return client.getText();
	}
	public String getViewPendingWorker() {
		return worker.getText();
	}
	
	public String getViewPendingWeekDate() {
		return weekdate.getText();
	}
	
	public void logoutFromViewTimeSheetPage() {
		userclick.click();
		logout.click();
		
	}
	public void clickDashBoard() {
		dashboard.click();
	}
	
	public String[] getDetails() {
	String viewdetails[]=new String[]{getViewClient(),getViewPendingWorker()};
	return viewdetails;
	}
}
	


