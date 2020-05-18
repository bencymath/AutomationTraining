package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewApprovedTimeSheet {
	
WebDriver driver;
	
	public  ViewApprovedTimeSheet(WebDriver driver){
		this.driver=driver;
	    PageFactory.initElements(driver,this);
	    		   	}
	
	@FindBy(xpath="//td[contains(text(),'0')]")
	private static WebElement viewtimesheetno;

	@FindBy(xpath="//td[contains(text(),'The Vines')]")
	private static WebElement viewclientname;

	@FindBy(xpath="//td[contains(text(),'Eduard')]")
	private static WebElement viewworker;

	@FindBy(xpath="//td[contains(text(),'Apr 15, 2018')]")
	private static WebElement viewdate;
	
	public String getTimeSheetNum() {
		return viewtimesheetno.getText();
	}
	public String getClientName() {
		return viewclientname.getText();
	}
	public String getWorker() {
		return viewworker.getText();
	}
	public String getDate() {
		return viewdate.getText();
	}
	
	public String[] getDetails() {
		  String viewdetails[]=new String[]{getTimeSheetNum(),getClientName(),getWorker()};
		  return viewdetails;
		}

	

}
