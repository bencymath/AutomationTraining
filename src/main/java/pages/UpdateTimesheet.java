package pages;


import java.io.File;

import java.nio.file.Paths;
import java.util.List;
import java.util.Map;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import utilities.GenericUtilities;
import utilities.PageUtilities;



public class  UpdateTimesheet{

	static WebDriver driver;
	JavascriptExecutor js;
	
			public  UpdateTimesheet(WebDriver driver){
			this.driver=driver;
			this.js=(JavascriptExecutor)this.driver;
		    PageFactory.initElements(driver,this);
		    		   	}
			
		@FindBy(xpath="/html/body/span/span/span[1]/input")
		public static WebElement clientdroptextbox;
		@FindBy (xpath="//select[@data-krajee-select2]")
		public static WebElement clientdropdown;	
		//@FindBy(xpath="//span[contains(text(),'Inglewood Nursing Home')]")
		//public static WebElement clientdropdownselect;
		@FindBy(xpath="//*[@id=\"select2-timesheet-client_id-container\"]/span")
		public static WebElement clientsideclick;
		
		@FindBy(xpath="//select[@data-krajee-select2]")
		private static WebElement dropdown2;
		@FindBy(id="timesheet-branch_id")
		public  WebElement dropdown1;
		
		@FindBy(xpath="//*[@id=\"select2-timesheet-client_id-container\"]/span")	//*[@id="select2-timesheet-client_id-container"]/span
		public static  WebElement openclientdrop;
		@FindBy (xpath="//div[@class='form-group field-timesheet-client_id required has-success']/select[@id='timesheet-client_id']")
		public static WebElement clientoptionselect;
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[2]/div[1]/span/span[1]/span")
		public  WebElement clientselected;
		@FindBy(xpath="//span[@title='Middleton Grove']")
		private static WebElement spandropdown;
		@FindBy(id="timesheet-worker_id")
		private static WebElement workerdropdown;
		@FindBy(xpath="//label[contains(text(),'Branch')]")
		private static WebElement branchlabel;
		@FindBy(xpath="//label[contains(text(),'Client')]")
		private static WebElement clientlabel;
		@FindBy(xpath="//label[contains(text(),'Worker')]")
		private static WebElement workerlabel;
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[1]/div[1]/div")
		private static WebElement branchlabelerror;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[1]/div/div[1]/button")
		private static WebElement addratebtn;
		
		
		@FindBy(id="rate-0-type_id")
		private static WebElement ratedescription;
		
		@FindBy(id="rate-0-frequency")
		private static WebElement frequency;
		
		@FindBy(name="Rate[0][units]")
		private static WebElement units;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[1]/div/div[2]/div[1]/div/div/div[3]/div/label")
		private static WebElement unitslabel;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[1]/div/div[2]/div/div/div/div[3]/div/div")
		private static WebElement unitslabelerror;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[1]/div/div[2]/div/div/div/div[3]/div/div")
		private static WebElement unitsintlabelerror;
		
		@FindBy(name="Rate[0][pay]")
		private static WebElement pay;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[1]/div/div[2]/div[1]/div/div/div[3]/div/label")
		private static WebElement paylabel;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[1]/div/div[2]/div/div/div/div[4]/div/div")
		private static WebElement paylabelerror;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[1]/div/div[2]/div/div/div/div[4]/div/div")
		private static WebElement payintlabelerror;
		
		@FindBy(name="Rate[0][bill]")
		private static WebElement bill;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[1]/div/div[2]/div[1]/div/div/div[5]/div/label")
		private static WebElement billlabel;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[1]/div/div[2]/div/div/div/div[5]/div/div")
		private static WebElement billlabelerror;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[1]/div/div[2]/div/div/div/div[5]/div/div")
		private static WebElement billintlabelerror;
		
		@FindBy(className="//*[@id=\"dynamic-form\"]/div/div[4]/div[1]/div/div[1]/i")
		private static WebElement rates;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[1]/div/div[2]/div[2]/button/i")
		private static WebElement closeextraratefield;
		
		@FindBy(xpath="//*[@id=\"select2-timesheet-worker_id-container\"]") 
		private static WebElement selectedworker;
		
		@FindBy(id="timesheet-division_id")
		private static WebElement divisiondropdown;
		
		@FindBy(xpath="//input[@id='timesheet-date']")
		private static WebElement caltextbox;
		
		@FindBy(xpath="//*[@id=\"timesheet-date-kvdate\"]/span[1]/i")
		private static WebElement daycal;
		
		@FindBy(className="datepicker-days")
		private static List <WebElement> daycaldrop;
		
		@FindBy(className="datepicker-switch")
		private static WebElement datepickerswitch;
		
		@FindBy(xpath="/html/body/div[2]/div[2]/table/thead/tr[2]/th[1]")
		private static WebElement previousyear;
		
		@FindBy(xpath="/html/body/div[2]/div[2]/table/tbody/tr/td/span[3]")
		private static WebElement month;
		
		@FindBy(xpath="/html/body/div[2]/div[1]/table/tbody/tr[3]/td[6]")
		private static WebElement day;
		
		@FindBy(id="timesheet-employment_type")
		private static WebElement empdropdown;
		
		@FindBy(xpath="//*[@id=\"timesheet-employment_type\"]")
		private static WebElement empselected;
		
		@FindBy(id="timesheet-description")
		private static WebElement jobdescriptiontimesheet;
		
		@FindBy(id="timesheet-category")
		private static WebElement timesheetcategory;
		
		@FindBy(id="timesheet-po_number")
		private static WebElement ponumbertxtbox;
		
		@FindBy(id="timesheet-timesheet_number")
		private static WebElement timesheetnum;
		
		@FindBy(xpath="//*[@id=\"timesheet-date-kvdate\"]/span[2]")  
		private static WebElement clearcal;
		
		@FindBy(xpath="//div[contains(text(),'Week End Date cannot be blank.')]")
		private static WebElement clearcalerror;
		
		@FindBy(xpath="//label[contains(text(),'Category')]")
		private static WebElement categorylabel;
		
		@FindBy(xpath="//div[contains(text(),'Category cannot be blank.')]")
		private static WebElement categorylabelerror;
		
		@FindBy(xpath="//label[contains(text(),'Timesheet Number')]")
		private static WebElement timenumberlabel;
		
		@FindBy(xpath="//div[contains(text(),'Timesheet Number cannot be blank.')]")
		private static WebElement timenumberlabelerror;
		
		@FindBy(xpath="//div[contains(text(),'Timesheet Number must be an integer.')]")
		private static WebElement timenumberintlabelerror;
		
		@FindBy(xpath="//label[contains(text(),'Division')]")
		private static WebElement divlabel;
		
		@FindBy(xpath="//div[contains(text(),'Division cannot be blank.')]")
		private static WebElement divlabelerror;
		
				
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[3]/div[1]/span/span[1]/span/span[2]")
		private static WebElement workersideclick;
		
		@FindBy(xpath="/html/body/span/span/span[1]/input")
		private static WebElement workertextbox;
		
		@FindBy(xpath="//*[@id=\"expense-0-units\"]")
		private static WebElement expenseunit;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[2]/div/div[2]/div/div/div/div[3]/div/label")
		private static WebElement expenseunitlabel;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[2]/div/div[2]/div/div/div/div[3]/div/div")
		private static WebElement expenseunitlabelerror;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[2]/div/div[2]/div/div/div/div[3]/div/div")
		private static WebElement expenseintunitlabelerror;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[2]/div/div[1]/button")
		private static WebElement addexpense;
		
		@FindBy(xpath="//*[@id=\"expense-0-pay\"]")
		private static WebElement expensepay;
		
		@FindBy(xpath="//*//*[@id=\"dynamic-form\"]/div/div[4]/div[2]/div/div[2]/div/div/div/div[4]/div/label")
		private static WebElement expensepaylabel;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[2]/div/div[2]/div/div/div/div[4]/div/div")
		private static WebElement expensepaylabelerror;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[2]/div/div[2]/div/div/div/div[4]/div/div")
		private static WebElement expenseintpaylabelerror;
		
		@FindBy(xpath="//*[@id=\"expense-0-bill\"]")
		private static WebElement expensebill;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[2]/div/div[2]/div/div/div/div[5]/div/label")
		private static WebElement expensebilllabel;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[2]/div/div[2]/div/div/div/div[5]/div/div")
		private static WebElement expensebilllabelerror;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[2]/div/div[2]/div/div/div/div[5]/div/div")
		private static WebElement expenseintbilllabelerror;
		
		@FindBy(id="deduction-0-type")
		private static WebElement deductiondropdown;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[3]/div/div[2]/div/div/div/div[2]/div/label")
		private static WebElement deductiondropdownlabel;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[3]/div/div[2]/div/div/div/div[2]/div/div")
		private static WebElement deductiondropdownlabelerror;
		
		@FindBy(xpath="//*[@id=\"deduction-0-amount\"]")
		private static WebElement deductionamt;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[3]/div/div[2]/div/div/div/div[3]/div/label")
		private static WebElement deductionamtlabel;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[3]/div/div[2]/div/div/div/div[3]/div/div")
		private static WebElement deductionamtlabelerror;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[3]/div/div[2]/div/div/div/div[3]/div/div")
		private static WebElement deductionintamtlabelerror;
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[3]/div/div[1]/button")
		private static WebElement adddeduction;
		
		@FindBy(xpath="//*[@id=\"expense-0-type_id\"]")
		private static WebElement adhocdropdwn; 
		
		@FindBy(xpath="//*[@id=\"dynamic-form\"]/div/div[4]/div[4]/button")
		private static WebElement savebtn;
		
		@FindBy(xpath="//*[@id=\"select2-timesheet-client_id-container\"]")
		private static WebElement selectedclientval;
		
		@FindBy(xpath="//*[@id=\"select2-timesheet-worker_id-container\"]")
		private static WebElement selectedworkerval;
		
		@FindBy(xpath="//*[@id='timesheet-timesheet_number']") 
		private static WebElement timesheetnumval;
		
		@FindBy(xpath="/html/body/header/div[1]/div/div[2]/div[1]/ul/li[2]/a")
		private static WebElement userclick;
		
		@FindBy(xpath="/html/body/header/div[1]/div/div[2]/div[1]/ul/li[2]/ul/div/li[2]/a")
		private static WebElement logout;
		

		
		public int number_of_clientList()  {
			
		PageUtilities.isElementLoaded(driver, clientsideclick, 2);
		clientsideclick.click();
		Select selectobj=new Select(dropdown2);
		//PageUtilities.isElementLoaded(driver, dropdown2, 1);		
		List<WebElement> num=selectobj.getOptions();
				
		//js.executeScript("arguments[0].scrollIntoView();", num.get(2));
		System.out.println(num.size());
		return  num.size();
		}	
				
			
public void select_Client(String txt) {
	PageUtilities.isElementLoaded(driver, clientsideclick, 1);
	clientsideclick.click();
	clientdroptextbox.sendKeys(txt);
	clientdroptextbox.sendKeys(Keys.ENTER);
//	PageUtilities.isElementLoaded(driver, clientdroptextbox, 2);
	
		}
public String getClientDropDwnTextVal() {
//	PageUtilities.waitforelementtobeclickable(driver, clientdroptextbox, 2);
String	clientdropdowntxt=clientselected.getText();
String[]clientarray=clientdropdowntxt.split("\n");
 return clientarray[1];
	 
}

	public String getBranchLabel() {
	return	dropdown1.getText();
	}
	
	
	
	public void clickClientLabel() {
		clientlabel.click();
		clientlabel.click();
	}
	
	public void clickWorkerLabel() {
		workerlabel.click();
	}
	
	public String getBranchLabelErrorTxt() {
		PageUtilities.isElementLoaded(driver, branchlabelerror,2);
		return branchlabelerror.getText();
		}
	
	public void selectWorker(String txt) {
		workersideclick.click();
		workertextbox.sendKeys(txt);
		workertextbox.sendKeys(Keys.ENTER);
		}
	public String getWorkerSelected() {
		return selectedworker.getText();
	}
	
	public String selectCalendardate(String date) {  // set xpath for dd mm yy specific
		caltextbox.sendKeys(date);
	   return date;
	}	
	
	public String getCalVal() {
		return caltextbox.getAttribute("value");
	}
	
	
	
	public int get_WorkerListCount()  {
		PageUtilities.waitforelementtobeclickable(driver, workersideclick, 2);
		workersideclick.click();
				Select selectobj=new Select (workerdropdown);
			//	PageUtilities.isElementLoaded(driver, workerdropdown, 1);		
				List<WebElement> num=selectobj.getOptions();	
				System.out.println(num.size());
				return  num.size();
						
		}	
		
		
			public void enterPODetails(String txt) {
			 	ponumbertxtbox.sendKeys(txt);
			}
			public void enterTimesheetDetails(String txt) {
			 	timesheetnum.sendKeys(txt);	
			}
			
			public String getPostNum() {
			//	PageUtilities.isElementLoaded(driver, ponumbertxtbox, 2);
			return	ponumbertxtbox.getAttribute("value");
			}
			
			
			public String getTimeSheetNum() {
	//			PageUtilities.isElementLoaded(driver, timesheetnum, 1);
				return	timesheetnum.getAttribute("value");
				}
			
	//		public void acceptAlert() {
	//			driver.switchTo().alert().accept();
	//		}
			
			public String getDivLabelErrorTxt() {
				PageUtilities.isElementLoaded(driver, divlabelerror,2);
				return divlabelerror.getText();
			}
				
			
			public String getClearCalErrorTxt() {
			//	PageUtilities.isElementLoaded(driver, clearcalerror,2);
				return clearcalerror.getText();
			}
			
			
			public String getclickCategoryErrorTxt() {
			//	PageUtilities.isElementLoaded(driver, categorylabelerror,2);
				return categorylabelerror.getText();
			}
			
			
				
			public String getclickClearTimeSheetErrorTxt() {
				
				return timenumberlabelerror.getText();
			}
			
			public String getclickIntTimeSheetErrorTxt() {
			//	PageUtilities.isElementLoaded(driver, timenumberlabel,2);
				timenumberlabel.click();
				PageUtilities.isElementLoaded(driver, timenumberintlabelerror,2);
				return timenumberintlabelerror.getText();
			}
			
			public void clickAddRateBtn() {
			//	PageUtilities.waitforelementtobeclickable(driver, addratebtn, 2);
				
				PageUtilities.performaction(ratedescription, driver);
				addratebtn.click();
			}
			
			public void enterUnits(String txt)
			{
			//	PageUtilities.isElementLoaded(driver, units, 2);
				units.sendKeys(txt);
			}
			public void enterPay(String txt)
			{
				PageUtilities.isElementLoaded(driver, units, 2);
				pay.sendKeys(txt);
			}
			public void enterBill(String txt)
			{
			//	PageUtilities.isElementLoaded(driver, units, 2);
				bill.sendKeys(txt);
			}
			
			
			public void enterExpenseUnit(String txt) {
				expenseunit.sendKeys(txt);
			}
			public void enterExpensePay(String txt) {
				expensepay.sendKeys(txt);
			}
			public void enterExpenseBill(String txt) {
				expensebill.sendKeys(txt);
			}
			
			public void enterDednValue(String txt) {
				deductionamt.sendKeys(txt);	
				deductionamtlabel.click();
				PageUtilities.scrollintoview(driver);
				PageUtilities.scrollintoview(driver);
			}
			
			
			public String getEnterUnits()
			{
				return units.getText();
			}
			
			public String getUnitsLabelErrorTxt() {
				PageUtilities.waitforelementtobeclickable(driver, unitslabelerror, 2);
				return unitslabelerror.getText();
			}
			
			public String getUnitsIntLabelErrorTxt() {
				PageUtilities.waitforelementtobeclickable(driver, unitslabelerror, 2);
				return unitsintlabelerror.getText();
			}
			
			
			public String getEnterPay()
			{
				return pay.getText();
			}
			
			
			
			public String getPayLabelErrorTxt() {
				PageUtilities.waitforelementtobeclickable(driver, paylabelerror, 2);
				return paylabelerror.getText();
			}
			
			public String getPayIntLabelErrorTxt() {
			    
				return payintlabelerror.getText();
			}
			
			public String getEnterBill()
			{
				return bill.getText();
			}
			
			
			public String getBillLabelErrorTxt() {
				PageUtilities.waitforelementtobeclickable(driver, billlabelerror, 2);
				return billlabelerror.getText();
			}
			
			public String getBillIntLabelErrorTxt() {
				PageUtilities.waitforelementtobeclickable(driver, billintlabelerror, 1);
				return billintlabelerror.getText();
			}
			
			public void clickRemoveRateClick() {
				PageUtilities.waitforelementtobeclickable(driver, closeextraratefield, 2);
				closeextraratefield.click();
			}
			
			public void acceptAlert() {
			
			driver.switchTo().alert().accept();
					}
		
			public void clickAddExpenseBtn() {
				addexpense.click();
			}
			
			
			public String getEnterExpenseUnit() {
				return expenseunit.getText();
			}
			
			
			
			public String getExpenseUnitLabelErrorTxt() {
			//	PageUtilities.isElementLoaded(driver, expenseunitlabelerror, 2);
				return expenseunitlabelerror.getText();
			}
			
			public String getExpenseIntUnitLabelErrorTxt() {
			//	PageUtilities.isElementLoaded(driver, expenseunitlabelerror, 2);
				return expenseintunitlabelerror.getText();
			}
			
			public String getEnterPayExpense() {
				return expensepay.getText();
			}
			
			
			public String getPayExpenseLabelErrorTxt() {
			//	PageUtilities.isElementLoaded(driver, expensepaylabelerror, 2);
				return expensepaylabelerror.getText();
			}
			
			public String isPayIntExpenseLabelErrorTxt() {
			//	PageUtilities.isElementLoaded(driver, expenseunitlabelerror, 2);
				return expenseunitlabelerror.getText();
			}
						
			public String getBillExpenseLabelErrorTxt() {
			//	PageUtilities.isElementLoaded(driver, expensebilllabelerror, 2);
				return expensebilllabelerror.getText();
			}
			
			public String isBillIntExpenseLabelError() {
			//	PageUtilities.isElementLoaded(driver, expenseintbilllabelerror, 2);
				return expenseintbilllabelerror.getText();
			}
			
			public void clickAddDeductionBtn() {
			//	PageUtilities.isElementLoaded(driver, deductiondropdown, 2);
				PageUtilities.performaction(adddeduction,driver);
				adddeduction.click();
			}
			
			public void clickDednLabel() {
				PageUtilities.isElementLoaded(driver, deductiondropdownlabel, 1);
				deductiondropdownlabel.click();
				deductiondropdownlabel.click();
			}
			
			public String getDednLabelErrorTxt() {
				PageUtilities.isElementLoaded(driver, deductiondropdownlabelerror, 2);
				return deductiondropdownlabelerror.getText();
			}
			
			public String getEnterDednAmt() {
				return deductionamt.getText();
			}
			
			
			
			public String getDednAmtLabelErrorTxt() {
			//	PageUtilities.isElementLoaded(driver, deductionamtlabelerror, 2);
				return deductionamtlabelerror.getText();
			}
			
			public String getDednIntAmtLabelErrorTxt() {
				PageUtilities.isElementLoaded(driver, deductionamtlabelerror, 2);
				return deductionintamtlabelerror.getText();
			}
			
			public void clickSave() {
				JavascriptExecutor js=(JavascriptExecutor)driver;
				PageUtilities.waitforelementtobeclickable(driver, savebtn, 2);
				PageUtilities.performaction(savebtn,driver);
				savebtn.click();
			}
			
			public String getSelectedClientValToUpdate() {
			//	PageUtilities.isElementLoaded(driver,selectedclientval, 2);
				String selclientval= selectedclientval.getText();
				String[]selclientvaltoupdate=selclientval.split("\n");
				return selclientvaltoupdate[1];
			}
			
			public String getSelectedWorkerValToUpdate() {
				String selworkval=selectedworkerval.getText();
				String[]selworkvaltoupdate=selworkval.split("\n");
				String [] shortselworkval=selworkvaltoupdate[1].split(" ");
				return shortselworkval[0];
			}
			
			public String getEnteredTimeSheetNmToUpdate() {
				return timesheetnumval.getText();
			}
			
			public void logout() {
				userclick.click();
				logout.click();
				
			}
			
			public String getNotSavedMessage() {
				 String text="Not saved";
				 return text;
			}
			
			public void selectFrequency(int index)
			{
				PageUtilities.selectValue(driver,frequency, index);
			}
			
			
			public String  selectEmployee(String txt) {
				return PageUtilities.selectValue(driver, empdropdown, txt);
			}
			
			
			public String selectJob(String txt) {
			  return	PageUtilities.selectValue(driver, jobdescriptiontimesheet, txt);
			}
			public String selectTimesheet(String txt) {
			return	PageUtilities.selectValue(driver, timesheetcategory, txt);
			}
			public void selectRateDescription(String txt) {
				PageUtilities.selectValue(driver, ratedescription, txt);
			}
			public void selectAdhoc(String txt) {
				PageUtilities.selectValue(driver, adhocdropdwn, txt);
			}
			public void selectDeduction(String txt) {
				PageUtilities.isElementLoaded(driver, deductiondropdown, 2);
				PageUtilities.selectValue(driver, deductiondropdown, txt);
			}
			public void selectBranchValue(String txt) {
				PageUtilities.isElementLoaded(driver, dropdown1, 2);
				PageUtilities.selectValue(driver, dropdown1, txt);	
			}
			public void selectDivisionValue(String txt) {
				PageUtilities.selectValue(driver,divisiondropdown, txt);	
			}

			public void clearCal() {
				clearcal.click();
		//		clearcalerror.click();
			}
			
			public String[] getenteredTimeSheetDetails() {
				
				String[] details= {getSelectedClientValToUpdate(),getSelectedWorkerValToUpdate(),selectEmployee("Contractor"),selectJob("Registered Nurse"),selectTimesheet("Cleaner")};
				return details;		
				}
			
			
			
			public String[] getSelectedTimeSheetDetails() {
				String[] details= {getSelectedClientValToUpdate(),getSelectedWorkerValToUpdate()};
				return details;		
				}
			
			public String[] getNullTimeSheetErrorLabels() {
				String[] details=new String[] {getBranchLabelErrorTxt(),getDivLabelErrorTxt(),getClearCalErrorTxt(),getclickCategoryErrorTxt(),getclickClearTimeSheetErrorTxt(),getUnitsLabelErrorTxt(),getPayLabelErrorTxt(),getBillLabelErrorTxt(),getExpenseUnitLabelErrorTxt(),getPayExpenseLabelErrorTxt(),getBillExpenseLabelErrorTxt(),getDednAmtLabelErrorTxt()};
				return details;
			}
			
			
			
			public String[] getIntErrorTimeSheetDetails() {
				String[] interror=new String[] {getclickIntTimeSheetErrorTxt(),getUnitsIntLabelErrorTxt(),getPayIntLabelErrorTxt(),getExpenseIntUnitLabelErrorTxt(),getPayIntLabelErrorTxt(),getDednIntAmtLabelErrorTxt()};
				return interror;
			}
			
			
	
	}
