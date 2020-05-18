package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class TimeSheet {
	WebDriver driver;
	public  TimeSheet(WebDriver driver){
		this.driver=driver;
	    PageFactory.initElements(driver,this);
	    		   	}
	
	@FindBy(xpath="//td[contains(text(),'123456')]") 	
	private static WebElement timesheetno;
	
	@FindBy(xpath="//td[contains(text(),'Middleton Grove')]")
	private static WebElement client;
	
	@FindBy(xpath="//td[contains(text(),'George')]")
	private static WebElement worker;
	
	@FindBy(xpath="//td[contains(text(),'Registered Nurse')]")
	private static WebElement jobdescription;
	
	@FindBy(xpath="//*[@id=\"w1\"]/tbody/tr[1]/td") 
	private static WebElement date;
	
	@FindBy(xpath="//td[contains(text(),'Contractor')]")
	private static WebElement employment;
	
	@FindBy(xpath="//td[contains(text(),'Cleaner')]")
	private static WebElement category;
	
	@FindBy(xpath="//td[contains(text(),'695034')]")
	private static WebElement postno;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private static WebElement userclick;
	
	@FindBy(xpath="//a[@class='logout-btn']")
	private static WebElement logout;  
	
	
	public String getTimeSheetNo() {
		PageUtilities.isElementLoaded(driver, timesheetno,2);
		return timesheetno.getText();
	}
	
	public String getClient() {
		PageUtilities.waitforelementtobeclickable(driver, client, 2);
		return client.getText();
	}
	
	public String getWorker() {
		PageUtilities.waitforelementtobeclickable(driver, worker, 2);
		return worker.getText();
	}
	
	public String getJobDescription() {
		PageUtilities.waitforelementtobeclickable(driver,jobdescription, 2);
		return jobdescription.getText();
	}
	
	public String getEmpType() {
		PageUtilities.waitforelementtobeclickable(driver,employment, 2);
		return employment.getText();
	}
	
	public String getCategory() {
		PageUtilities.waitforelementtobeclickable(driver,category, 2);
		return category.getText();
	}
	
	public String getPostNo() {
		PageUtilities.waitforelementtobeclickable(driver,postno, 2);
		return postno.getAttribute("value");
	}
	
	public void logout() {
		PageUtilities.waitforelementtobeclickable(driver, userclick, 2);
		userclick.click();
		PageUtilities.waitforelementtobeclickable(driver, logout, 2);
		logout.click();
		
		
	}
	
	public String[] getSavedTimeSheetDetails() {
		String[] details=new String[]{getClient(),getWorker(),getEmpType(),getJobDescription(),getCategory()};
		return details;
	}

}
