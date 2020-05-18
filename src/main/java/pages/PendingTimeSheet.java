package pages;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class PendingTimeSheet {
	WebDriver driver;
	
	public  PendingTimeSheet(WebDriver driver){
		this.driver=driver;
	    PageFactory.initElements(driver,this);
	    		   	}
	@FindBy(xpath="//td[contains(text(),'234')]")
	private static WebElement timesheetno;
	
	@FindBy(xpath="//td[contains(text(),'Middleton Grove')]")
	private static WebElement client;
	
	@FindBy(xpath="//td[contains(text(),'Ramona')]")
	private static WebElement worker;
	
	@FindBy(xpath="//td[contains(text(),'Apr 8, 2020')]")
	private static WebElement weekdate;
	
	@FindBy(xpath="//td[contains(text(),'Pending')]")
	private static WebElement approvalstats;
	
	@FindBy(xpath="//*[@id=\"grid\"]/table/tbody/tr[1]/td[7]/a[1]")
	private static WebElement viewbtn;
	
	@FindBy(xpath="//*[@id=\"grid\"]/table/tbody/tr[1]/td[7]/a[2]")
	private static WebElement updatebtn;
	
	@FindBy(linkText="Approved Timesheets")
	private static WebElement approvedtimesheet;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr")
	public List <WebElement> table;
	
	@FindBy(xpath="//tr")
	public List <WebElement> tablerow;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr/td")
	public List <WebElement> tablecol;
	
	@FindBy(xpath="//th")                   
	private static WebElement tableheader;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr[\"+i+\"]/td[\"+j+\"]")                   
	private static WebElement datacell;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr[\"+i+\"]/td[1]")
	private static WebElement strdatatype;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr/td[3]")
	private static List <WebElement> strDesc;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr/td[4]")
	private static List <WebElement>  strExample;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr/td[5]")
	private static List <WebElement>  strDefaultVal;
	
	
		public String getPendingTimesheetno() {
			PageUtilities.isElementLoaded(driver, timesheetno, 2);
			return timesheetno.getAttribute("value");
		}
		public String getPendingClient() {
			return client.getText();
		}
		public String getPendingWorker() {
			return worker.getText();
		}
		
		public String getPendingWeekDate() {
			return weekdate.getText();
		}
		
		public String[] getDetails() {
		  String details[]=new String[]{getPendingClient(),getPendingWorker()};
		  return details;
		}
		
		public void clickViewBtn() {
			viewbtn.click();
		}
		
		public void clickUpdateBtn () {
			updatebtn.click();
		}
		
		public void clickApprovedTimeSheet() {
			approvedtimesheet.click();
		}
		public void getHashTableval() {
			//count rows
	        List<WebElement> row = tablerow;
			int totalrow = row.size();
			System.out.println(" Total rows : "+totalrow);
			
			

			List<WebElement> columns=tablecol;
			int totalColumns = columns.size();
 			System.out.println(" Total columns : "+totalColumns);
 			
		
			List<WebElement> cells=tablecol;
			
			System.out.println("Cell size : "+cells.size());
		
			
			for(int i=0;i<cells.size();i++) {
				WebElement cell = cells.get(i);
				if(i%7==0) {
					System.out.println("Check box : "+cell.getText());
				} else if (i%7==1) {
					System.out.println("TS Num : "+cell.getText());
				} else if (i%7==2) {
					System.out.println("Client : "+cell.getText());
				} else if (i%7==3) {
					System.out.println("Worker : "+cell.getText());
				} else if (i%7==4) {
					System.out.println("Date : "+cell.getText());

				} else if (i%7==5) {
					System.out.println("Approval status : "+cell.getText());
				} else if (i%7==6) {
					System.out.println("Icon : "+cell.getText());
				}
				
			}
			
			

			
		}
		
		

		}
	

 			
		
		



		
		


