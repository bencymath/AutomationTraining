package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApprovedTimeSheet {
WebDriver driver;
	
	public  ApprovedTimeSheet(WebDriver driver){
		this.driver=driver;
	    PageFactory.initElements(driver,this);
	    		   	}
@FindBy(xpath="//td[contains(text(),'0')]")
private static WebElement timesheetno;

@FindBy(xpath="//td[contains(text(),'The Vines')]")
private static WebElement clientname;

@FindBy(xpath="//td[contains(text(),'Eduard')]")
private static WebElement worker;

@FindBy(xpath="//td[contains(text(),'Apr 15, 2018')]")
private static WebElement date;

@FindBy(xpath="//*[@id=\"grid\"]/table/tbody/tr[1]/td[6]/a")
private static  WebElement viewbtn;

public String getTimeSheetNum() {
	return timesheetno.getText();
}
public String getClientName() {
	return clientname.getText();
}
public String getWorker() {
	return worker.getText();
}
public String getDate() {
	return date.getText();
}
public void clickViewApprovedTimeSheetPage() {
	viewbtn.click();
}

public String[] getDetails() {
	  String details[]=new String[]{getTimeSheetNum(),getClientName(),getWorker()};
	  return details;
	}




}
