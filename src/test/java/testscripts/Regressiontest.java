package testscripts;
import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Workers;
import pages.ApprovedTimeSheet;
import pages.Client;
import pages.Company;
import pages.Deduction;
import pages.CreateTimeSheet;
import pages.Homepage;
import pages.Login;
import pages.PendingTimeSheet;
import pages.TimeSheet;
import pages.UpdateTimesheet;
import pages.ViewApprovedTimeSheet;
import pages.ViewSelectedTimeSheetDetails;
import testscripts.TestHelper;
import utilities.ExcelToDataProvider;
import utilities.PageUtilities;


public class Regressiontest extends TestHelper {
/*
	@Test(dataProvider = "userdetails")
    public void fillUserForm(String username, String password)
    {
    	ExcelToDataProvider excelToDataProvider=new ExcelToDataProvider(driver);
    	excelToDataProvider.setUsername(username, password);
    	String testuser=excelToDataProvider.usertextbox.getAttribute("value");
    	String testpwd=excelToDataProvider.passwordtxtbox.getAttribute("value");
 //   	Assert.assertEquals(testuser, username);
//    	Assert.assertEquals(testpwd, password);
    }
	public Object[][] getUsernamePassword(String xlFilePath,String sheetName ) throws Exception{
		String root = System.getProperty("user.dir");
		xlFilePath = "\\src\\test\\resources\\sample\\loginqabible.xlsx"; 
		String abspath = root+xlFilePath;
    	return ExcelToDataProvider.testData(abspath,"Sheet1");
    }
     
    @DataProvider(name="userdetails" )
    public Object[][] userFormData() throws Exception
    {
    	String root = System.getProperty("user.dir");
		String xlFilePath = "\\src\\test\\resources\\sample\\loginqabible.xlsx"; 
		String abspath = root+xlFilePath;
        Object[][] data =ExcelToDataProvider.testData(abspath, "Sheet1");
        return data;
    }
    
  
    

  @Test
  public void verifyWrongLoginDetails()   { 
	  	Login login= new Login(driver);
       	login.login("carol", "1q2w3e4");
	    Homepage homepage=new Homepage(driver);
	    Assert.assertEquals(login.getWrongLoginError(), "Incorrect username or password.");
	    }
  
  
	@Test
   public void verifyNoLoginForIncorrectUsernameandCorrectPassword() {
	   Login login= new Login(driver);
      	login.login("caro","1q2w3e4r");
	    Homepage homepage=new Homepage(driver);
	    Assert.assertEquals(login.getWrongLoginError(), "Incorrect username or password.");
   }
	
	@Test
	public void verifyNoLoginForCorrectUsernameandInCorrectPassword() {
		   Login login= new Login(driver);
	      	login.login("carol","1q2w3e4");
		    Homepage homepage=new Homepage(driver);
		    Assert.assertEquals(login.getWrongLoginError(), "Incorrect username or password.");
	   }
	
  @Test 
  public void verifyNullLoginErrorisDisplayed()  {
	  	Login login= new Login(driver);
       	login.login("","");
       	Assert.assertEquals(login.getLabelEmptyUserField(), "Username cannot be blank.");
       	login.clickPasswordTxtBox();
  	    Assert.assertEquals(login.getLabelEmptyPwdField(),"Password cannot be blank.");    
  }

  @Test
   public void correctLogin()   {   
	  
	  	Login login= new Login(driver);
       	login.login("carol","1q2w3e4r");
	    Homepage homepage=new Homepage(driver);
	    Assert.assertEquals(homepage.getHomePageWelcomeMsg(), "logged in");
	    }
   
  @Test 
  public void verifyUserIsAbleToUploadFileWhileCreatingTimeSheetPageIsInJPGFormat()   {
	  Login login= new Login(driver);
      login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab();
	  CreateTimeSheet createTimeSheet=new CreateTimeSheet(driver);
	  createTimeSheet.clickCreateTimeSheet();
	  createTimeSheet.uploadJPGFile();
	  Assert.assertTrue(createTimeSheet.isFileUploadInJPGFormat());
    }
   
     @Test  
  public void verifyToolTipForTextBoxWhenNoFileIsUploadedInCreatTimeSheetPage() {
	  Login login= new Login(driver);
      login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab();
	  CreateTimeSheet createTimeSheet=new CreateTimeSheet(driver);
	  createTimeSheet.clickCreateTimeSheet();
	  Assert.assertEquals("Select an image...", createTimeSheet.getToolTipTxtForTxtBox());
	  }
	   
//  @Test  
  public void verifyToolTipForBrowseButtonWhenNoFileIsUploadedInCreatTimeSheetPage() {
	  Login login= new Login(driver);
      login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab();
	  CreateTimeSheet createTimeSheet=new CreateTimeSheet(driver);
	  createTimeSheet.clickCreateTimeSheet();
//	  Assert.assertEquals("No file chosen", createTimeSheet.getToolTipTxtForBrowseBtn());
	  }
    
    @Test 
  public void verifyToolTipForTextBoxWhenFileSelectedInCreateTimeSheetPage()   {
	  Login login= new Login(driver);
      login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab();
	  CreateTimeSheet createTimeSheet=new CreateTimeSheet(driver);
	  createTimeSheet.clickCreateTimeSheet();
	  createTimeSheet.uploadJPGFile();
	  createTimeSheet.getToolTipTxtForTxtBox();
	  Assert.assertEquals(createTimeSheet.getToolTipTxtForTxtBox(),createTimeSheet.getUploadJPEGFileName());
	  Assert.assertEquals(createTimeSheet.getToolTipTxtForRemoveButton(),"Clear selected files");
	  Assert.assertEquals(createTimeSheet.getgetToolTipTxtForUploadButton(),"Upload selected files");
    }
   */ 
    @Test 
    public void verifyRemoveFileOnRemoveBtnClickInCreateTimeSheetPage()   {
  	  Login login= new Login(driver);
      login.login("carol","1q2w3e4r");
  	  Homepage homepage=new Homepage(driver);
  	  homepage.clickTimeSheetTab();
  	  CreateTimeSheet createTimeSheet=new CreateTimeSheet(driver);
  	  createTimeSheet.clickCreateTimeSheet();
  	  createTimeSheet.uploadJPGFile();
  	  createTimeSheet.removeFileUpload();
  	  Assert.assertTrue(createTimeSheet.getFileRemovedStatus());
      }
/*
  @Test
  public void verifyUserIsNotAbleToUploadCreateTimeSheetNonJPGWhileCreatingTimeSheetPage()  {
	  Login login= new Login(driver);
      login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab();
	  CreateTimeSheet createTimeSheet=new CreateTimeSheet(driver);
	  createTimeSheet.clickCreateTimeSheet();
	  createTimeSheet.uploadNonJPGFile();
	  Assert.assertFalse(createTimeSheet.isFileUploadInJPGFormat());
	  Assert.assertEquals(createTimeSheet.getFileUploadErrorMsgDisp(),"Please upload jpg files !!!");
	  }
   
  @Test
  public void verifyUserIsAbletoDismissAlertInCreateTimesheetPage() {
	  Login login= new Login(driver);
      login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab();
	  CreateTimeSheet createTimeSheet=new CreateTimeSheet(driver);
	  createTimeSheet.clickCreateTimeSheet();
	  createTimeSheet.clickSkipBtn();    
	  createTimeSheet.dismissAlert();
	  Assert.assertEquals("Alert dismissed", createTimeSheet.getTimeSheetDismissAlertMsg());
	  }
	 
	  @Test
  public void verifyUserIsAbletoGoToDashboardFromCreateTimesheetPage() {
	  Login login= new Login(driver);
      login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab();
	  CreateTimeSheet createTimeSheet=new CreateTimeSheet(driver);
	  createTimeSheet.clickCreateTimeSheet();
	  createTimeSheet.clickSkipBtn();    
	  createTimeSheet.dismissAlert();
	  createTimeSheet.clickDashBoard();
	  Assert.assertEquals(homepage.getHomePageWelcomeMsg(), "logged in");
	  }

  @Test
  public void verifyPendingValuesAreDisplayedInViewTimeSheetPage() {
	  Login login= new Login(driver);
      login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab();
	  PendingTimeSheet pendingTimeSheet=new PendingTimeSheet(driver);
	  String[] details=pendingTimeSheet.getDetails();
	  pendingTimeSheet.clickViewBtn();
	  ViewSelectedTimeSheetDetails viewSelectedTimeSheetDetails=new ViewSelectedTimeSheetDetails(driver);
	  Assert.assertEquals(details,viewSelectedTimeSheetDetails.getDetails());
	  }	

	   @Test
  public void verifyUserIsAbleToGoToDashboardFromViewPendingTimeSheetPage() {
	  Login login= new Login(driver);
      login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab();
	  PendingTimeSheet pendingTimeSheet=new PendingTimeSheet(driver);
	  String[] details=pendingTimeSheet.getDetails();
	  pendingTimeSheet.clickViewBtn();
	  ViewSelectedTimeSheetDetails viewSelectedTimeSheetDetails=new ViewSelectedTimeSheetDetails(driver);
	  viewSelectedTimeSheetDetails.clickDashBoard();
	  Assert.assertEquals(homepage.getHomePageWelcomeMsg(), "logged in");
	  }

	   @Test
	   public void verifyValuesFromApprovedTimeSheetPageAreDisplayedinTableForApprovedTimeSheet() {
	 	  Login login= new Login(driver);
	      login.login("carol","1q2w3e4r");
	 	  Homepage homepage=new Homepage(driver);
	 	  homepage.clickTimeSheetTab();
	 	  PendingTimeSheet pendingTimeSheet=new PendingTimeSheet(driver);
	 	  pendingTimeSheet.clickApprovedTimeSheet();
	 	  ApprovedTimeSheet approvedTimeSheet=new ApprovedTimeSheet(driver);
	 	  approvedTimeSheet.getDetails();
	 	  String details[]=approvedTimeSheet.getDetails();
	 	  approvedTimeSheet.clickViewApprovedTimeSheetPage();
	 	  ViewApprovedTimeSheet viewApprovedTimeSheet=new ViewApprovedTimeSheet(driver);
	 	  Assert.assertEquals(details,viewApprovedTimeSheet.getDetails());
	 	  }
	 
	 @Test
  public void verifyPendingValuesAreDisplayedInTimeSheetPage() {
	  Login login= new Login(driver);
      login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab();
	  PendingTimeSheet pendingTimeSheet=new PendingTimeSheet(driver);
	  String details[]=pendingTimeSheet.getDetails();
	  pendingTimeSheet.clickUpdateBtn();
	  UpdateTimesheet updateTimesheet=new UpdateTimesheet(driver);
	  Assert.assertEquals(details,updateTimesheet.getSelectedTimeSheetDetails());
	  }
	  
	 @Test
	public void verifyLogOutFromCreateTimeSheetPage() {
		  Login login= new Login(driver);
	      login.login("carol","1q2w3e4r");
		  Homepage homepage=new Homepage(driver);
		  homepage.clickTimeSheetTab();
		  PendingTimeSheet pendingTimeSheet=new PendingTimeSheet(driver);
		  pendingTimeSheet.getDetails();
		  pendingTimeSheet.clickUpdateBtn();
		  TimeSheet timeSheet=new TimeSheet(driver);
		  timeSheet.logout();
		  }
	
  @Test
  public void verifyLogOutfromViewPendingTimeSheetPage() {
	  Login login= new Login(driver);
      login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab();
	  PendingTimeSheet pendingTimeSheet=new PendingTimeSheet(driver);
	  pendingTimeSheet.getDetails();
	  pendingTimeSheet.clickViewBtn();
	  ViewSelectedTimeSheetDetails viewSelectedTimeSheetDetails=new ViewSelectedTimeSheetDetails(driver);
	  viewSelectedTimeSheetDetails.getDetails();
	  viewSelectedTimeSheetDetails.logoutFromViewTimeSheetPage();
	  Assert.assertEquals(login.getLoginPageWelcomeMsg(),"log in");
	  }
 
  @Test
  public void verifyUserIsAbleToLogOutFromCreateTimeSheetPage(){
  		Login login= new Login(driver);
      	login.login("carol","1q2w3e4r");
  	  	Homepage homepage=new Homepage(driver);
  	  	homepage.clickTimeSheetTab();
  	  	CreateTimeSheet CreateTimeSheet=new CreateTimeSheet(driver);
  	  	CreateTimeSheet.clickCreateTimeSheet();
  	  	CreateTimeSheet.uploadJPGFile();
  	  	CreateTimeSheet.removeFileUpload();      //rename 
  	  	CreateTimeSheet.logoutFromCreateTimeSheetPage(); //rename
  	  	Assert.assertEquals(login.getLoginPageWelcomeMsg(), "log in");
  }
   
  @Test  
  public void verifyAlertAcceptInCreateTimesheet() {
	  Login login= new Login(driver);
      login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab();
	  CreateTimeSheet CreateTimeSheet=new CreateTimeSheet(driver);
	  CreateTimeSheet.clickCreateTimeSheet();
	  CreateTimeSheet.clickSkipBtn();    
	  CreateTimeSheet.acceptAlert();
	  Assert.assertEquals("Alert accepted", CreateTimeSheet.getTimeSheetAcceptAlertMsg());
	  }
	  
	  @Test 
  public void verifyUserTimeSheetDetailsIsSaved() {
	  Login login= new Login(driver);
      login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab(); //click rename
	  CreateTimeSheet createTimeSheet=new CreateTimeSheet(driver);
	  createTimeSheet.clickCreateTimeSheet();
	  createTimeSheet.clickSkipBtn();            
	  createTimeSheet.acceptAlert();
	  UpdateTimesheet updateTimesheet=new UpdateTimesheet(driver);
	  updateTimesheet.selectBranchValue("Eastbourne City"); // enter details common method
	  updateTimesheet.select_Client("Middleton");
      updateTimesheet.selectWorker("George");
      updateTimesheet.selectDivisionValue("weq");
      updateTimesheet.selectCalendardate("15-03-2019");
      updateTimesheet.selectEmployee("Contractor");
      updateTimesheet.selectJob("Registered Nurse");   
      updateTimesheet.selectTimesheet("Cleaner");
      updateTimesheet.enterPODetails("695034");
      updateTimesheet.enterTimesheetDetails("123456");//
	  String [] timesheetdetails=updateTimesheet.getenteredTimeSheetDetails();
	  updateTimesheet.clickAddRateBtn();
	  updateTimesheet.selectRateDescription("Monday Day");
	//timesheet3.acceptAlert();
//    timesheet3.performaction(timesheet3ob.ratedescription);
	//timesheet3ob.acceptAlert();
	  updateTimesheet.selectFrequency(1);       
	  updateTimesheet.enterUnits("12345");
	  updateTimesheet.enterPay("4567");
	  updateTimesheet.enterBill("6789");
	  updateTimesheet.clickRemoveRateClick();   
	  updateTimesheet.clickAddExpenseBtn();
	  updateTimesheet.selectAdhoc("Mileage");   
	  updateTimesheet.enterExpenseUnit("4567");   
	  updateTimesheet.enterExpensePay("4789");
	  updateTimesheet.enterExpenseBill("47895");
	  updateTimesheet.clickAddDeductionBtn();    
	  updateTimesheet.selectDeduction("Training");    
	  updateTimesheet.enterDednValue("4567");
	  updateTimesheet.clickSave();
	  TimeSheet timeSheet=new TimeSheet(driver);   
	  Assert.assertEquals(timesheetdetails, timeSheet.getSavedTimeSheetDetails());
  }
	 
	
	  @Test 
	  public void verifyLogOutFromSavedTimeSheetPage() {
		  Login login= new Login(driver);
	      login.login("carol","1q2w3e4r");
		  Homepage homepage=new Homepage(driver);
		  homepage.clickTimeSheetTab();   //rename
		  CreateTimeSheet createTimeSheet=new CreateTimeSheet(driver);
		  createTimeSheet.clickCreateTimeSheet();
		  createTimeSheet.clickSkipBtn();                //rename
		  createTimeSheet.acceptAlert();
		  UpdateTimesheet updateTimesheet=new UpdateTimesheet(driver);
		  updateTimesheet.selectBranchValue("Eastbourne City");
		  updateTimesheet.select_Client("Middleton");
		  updateTimesheet.selectWorker("George");
		  updateTimesheet.selectDivisionValue("weq");
		  updateTimesheet.selectCalendardate("15-03-2019");
		  updateTimesheet.selectEmployee("Contractor");
		  updateTimesheet.selectJob("Registered Nurse");
		  updateTimesheet.selectTimesheet("Cleaner");
		  updateTimesheet.enterPODetails("695034");
		  updateTimesheet.enterTimesheetDetails("123456");
		  updateTimesheet.clickAddRateBtn();
		  updateTimesheet.selectRateDescription("Monday Day");
		  updateTimesheet.selectFrequency(1);
		  updateTimesheet.enterUnits("12345");
		  updateTimesheet.enterPay("4567");
		  updateTimesheet.enterBill("6789");
		  updateTimesheet.clickRemoveRateClick();
		  updateTimesheet.clickAddExpenseBtn();
		  updateTimesheet.selectAdhoc("Mileage");
		  updateTimesheet.enterExpenseUnit("4567");
		  updateTimesheet.enterExpensePay("4789");
		  updateTimesheet.enterExpenseBill("47895");
		  updateTimesheet.clickAddDeductionBtn();
		  updateTimesheet.selectDeduction("Training");
		  updateTimesheet.enterDednValue("4567");
		  updateTimesheet.clickSave();
		  TimeSheet timeSheet=new TimeSheet(driver);
		  timeSheet.logout();
		  Assert.assertEquals(login.getLoginPageWelcomeMsg(), "log in");
	  }
 

@Test 
  public void verifyNullErrorInTimesheetPage()  {
	  Login login= new Login(driver);
      login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab();
	  CreateTimeSheet CreateTimeSheet=new CreateTimeSheet(driver);
	  CreateTimeSheet.clickCreateTimeSheet();
	  CreateTimeSheet.clickSkipBtn();            
	  CreateTimeSheet.acceptAlert();
	  UpdateTimesheet updateTimesheet = new UpdateTimesheet(driver);
	  updateTimesheet.selectBranchValue("-- Please Select --");
	  updateTimesheet.selectDivisionValue("-- Please Select --");
	  updateTimesheet.selectCalendardate("");
	  updateTimesheet.clearCal();
	  updateTimesheet.clickAddRateBtn();
	  updateTimesheet.enterUnits("");
	  updateTimesheet.enterBill("");
	  updateTimesheet.enterPay("");
	  updateTimesheet.selectTimesheet("-- Please Select --");
	  updateTimesheet.enterTimesheetDetails("");
// 	  timesheet.acceptAlert();
	 // timesheetob.acceptAlert();
	  updateTimesheet.clickRemoveRateClick();
	  updateTimesheet.clickAddExpenseBtn();
	  updateTimesheet.enterExpenseUnit("");
	  updateTimesheet.enterExpensePay("");
	  updateTimesheet.enterExpenseBill("");
	  updateTimesheet.clickAddDeductionBtn();
	  updateTimesheet.selectDeduction("-- Please Select --");
	  updateTimesheet.enterDednValue("");
	  String[] error=new String[] {"Branch cannot be blank.","Division cannot be blank.","Week End Date cannot be blank.","Category cannot be blank.","Timesheet Number cannot be blank.","Units cannot be blank.","Pay(£) cannot be blank.","Bill(£) cannot be blank.","Units cannot be blank.","Pay(£) cannot be blank.","Bill(£) cannot be blank.","Amount cannot be blank."};
	  Assert.assertEquals(updateTimesheet.getNullTimeSheetErrorLabels(),error); 
  }
 
  
  @Test 
  public void verifyDetailsNotSavedForNullErrorInTimesheetError()  {
	  Login login= new Login(driver);
      login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab();
	  CreateTimeSheet CreateTimeSheet=new CreateTimeSheet(driver);
	  CreateTimeSheet.clickCreateTimeSheet();
	  CreateTimeSheet.clickSkipBtn();            
	  CreateTimeSheet.acceptAlert();
	  UpdateTimesheet updateTimesheet = new UpdateTimesheet(driver);
	  updateTimesheet.selectBranchValue("-- Please Select --");  //change method name remove null
	  updateTimesheet.selectDivisionValue("-- Please Select --");   
	  updateTimesheet.selectCalendardate("");
	  updateTimesheet.selectTimesheet("-- Please Select --");
	  updateTimesheet.enterPODetails(""); // change 
	  updateTimesheet.enterTimesheetDetails("");
	  updateTimesheet.clickAddRateBtn();
// 	  timesheet.addDescByIndex(0);
// 	  timesheet.acceptAlert();
	 // timesheetob.acceptAlert();
	  updateTimesheet.selectFrequency(1);
	  updateTimesheet.enterUnits("");
	  updateTimesheet.enterPay("");
	  updateTimesheet.enterBill("");
	  updateTimesheet.clickRemoveRateClick();
	  updateTimesheet.clickAddExpenseBtn();
	  updateTimesheet.enterExpenseUnit("");
	  updateTimesheet.enterExpensePay("");
	  updateTimesheet.enterExpenseBill("");
	  updateTimesheet.clickAddDeductionBtn();
	  updateTimesheet.selectDeduction("-- Please Select --");
	  updateTimesheet.enterDednValue("");
	  updateTimesheet.clickSave();
	  Assert.assertEquals(updateTimesheet.getNotSavedMessage(), "Not saved");  // expected, actual
  }
  
  

@Test  
public void verifyIntegerValuesEnteredInTimesheetDetails()   {
	  Login login= new Login(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab();
	  CreateTimeSheet CreateTimeSheet=new CreateTimeSheet(driver);
	  CreateTimeSheet.clickCreateTimeSheet();
	  CreateTimeSheet.clickSkipBtn();            
	  CreateTimeSheet.acceptAlert();
	  UpdateTimesheet updateTimesheet=new UpdateTimesheet(driver);
	  updateTimesheet.selectDivisionValue("weq");
	  updateTimesheet.selectCalendardate("06-08-2015");
	  updateTimesheet.enterPODetails("piorqwrjkqwbfjq*^*");
	  updateTimesheet.enterTimesheetDetails("qe%%$$^");
	  updateTimesheet.clickAddRateBtn();
	  //timesheet.acceptAlert();
	 // timesheet.acceptAlert();
	  updateTimesheet.enterUnits("#$afsaf");
	  updateTimesheet.enterPay("uheurhe^%&");
	  updateTimesheet.enterBill("pqrwqrtw");
	  updateTimesheet.clickRemoveRateClick();
	  updateTimesheet.clickAddExpenseBtn();
	  updateTimesheet.enterExpenseUnit("#$afsaf");
	  updateTimesheet.enterExpensePay("uheurhe^%&");
	  updateTimesheet.enterExpenseBill("pqrwqrtwt");
	  updateTimesheet.clickAddDeductionBtn();
	  updateTimesheet.enterDednValue("#$#rtr");    
	  String error[]=new String[]{"Timesheet Number must be an integer.","Units must be a number.","Pay(£) must be a number.","Units must be a number.","Pay(£) must be a number.","Amount must be a number."};
	  Assert.assertEquals(updateTimesheet.getIntErrorTimeSheetDetails(), error);
}  

	@Test  
	public void verifyDetailsAreNotSavedForNonIntegerValuesEnteredInTimesheetDetails()   {
		  Login login= new Login(driver);
		  login.login("carol","1q2w3e4r");
		  Homepage homepage=new Homepage(driver);
		  homepage.clickTimeSheetTab();
		  CreateTimeSheet CreateTimeSheet=new CreateTimeSheet(driver);
		  CreateTimeSheet.clickCreateTimeSheet();
		  CreateTimeSheet.clickSkipBtn();            
		  CreateTimeSheet.acceptAlert();
		  UpdateTimesheet updateTimesheet=new UpdateTimesheet (driver);
		  updateTimesheet.selectDivisionValue("weq");
		  updateTimesheet.selectCalendardate("06-04-2017");
		  updateTimesheet.enterPODetails("piorqwrjkqwbfjq*^*"); //rename
		  updateTimesheet.enterTimesheetDetails("qe%%$$^");
		  updateTimesheet.clickAddRateBtn();
		  //timesheet.acceptAlert();
		 // timesheet.acceptAlert();
		  updateTimesheet.enterUnits("#$afsaf");
		  updateTimesheet.enterBill("pqrwqrtwtq^&&");
		  updateTimesheet.enterPay("uheurhe^%&%&%&");
		  updateTimesheet.clickAddExpenseBtn();
		  updateTimesheet.enterExpenseUnit("#$afsaf");
		  updateTimesheet.enterExpenseBill("pqrwqrtwtq^&&");
		  updateTimesheet.enterExpensePay("uheurhe^%&%&%&");
		  updateTimesheet.clickAddDeductionBtn();
		  updateTimesheet.enterDednValue("@#$##@$#@");
		  updateTimesheet.clickSave();
		  Assert.assertEquals(updateTimesheet.getNotSavedMessage(), "Not saved");
	}
	
@Test  
public void verifyNullandNonIntegerValuesEnteredInTimesheetDetails()   {
	  Login login= new Login(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickTimeSheetTab();
	  CreateTimeSheet CreateTimeSheet=new CreateTimeSheet(driver);
	  CreateTimeSheet.clickCreateTimeSheet();
	  CreateTimeSheet.clickSkipBtn();            
	  CreateTimeSheet.acceptAlert();
	  UpdateTimesheet updateTimesheet=new UpdateTimesheet(driver);
	  updateTimesheet.selectBranchValue("-- Please Select --");
	  updateTimesheet.selectTimesheet("-- Please Select --");
	  updateTimesheet.selectCalendardate("15-03-2018");
	  updateTimesheet.enterTimesheetDetails("@#@#@$@$");
	  Assert.assertEquals(updateTimesheet.getBranchLabelErrorTxt(),"Branch cannot be blank.");
	  Assert.assertEquals(updateTimesheet.getclickCategoryErrorTxt(),"Category cannot be blank.");
	  Assert.assertEquals(updateTimesheet.getclickIntTimeSheetErrorTxt(),"Timesheet Number must be an integer.");
	  
}

@Test 
public void verifyNumberofClientEntriesInTimesheetTabAreEqualToClientTable()  {
	  Login login= new Login(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickClientTab();
	  Client client=new Client(driver);
	  String clientvaluesnumber= client.getNumberOfClientValues();
	  System.out.println(client.getNumberOfClientValues());
	  client.clickTimesheetTab();
	  CreateTimeSheet CreateTimeSheet=new CreateTimeSheet(driver);
	  CreateTimeSheet.clickCreateTimeSheet();
	  CreateTimeSheet.clickSkipBtn();            
	  CreateTimeSheet.acceptAlert();
	  UpdateTimesheet updateTimesheet=new UpdateTimesheet(driver);
	  Assert.assertEquals(updateTimesheet.number_of_clientList()+"", clientvaluesnumber);
	 }

@Test 
public void verifyWorkerEntriesInTimesheetTabAreEqualToWorkerTable() {
	  Login login= new Login(driver);
	  login.login("carol","1q2w3e4r");
	  Homepage homepage=new Homepage(driver);
	  homepage.clickWorkerTab();
	  Workers workers=new Workers(driver);
	  String workvalnumber=workers.getNumberOfWorkerValues();
	  workers.clickTimesheet();
	  CreateTimeSheet CreateTimeSheet=new CreateTimeSheet(driver);
	  CreateTimeSheet.clickCreateTimeSheet();
	  CreateTimeSheet.clickSkipBtn();    
	  CreateTimeSheet.acceptAlert();
	  UpdateTimesheet updateTimesheet=new UpdateTimesheet(driver);
	  Assert.assertNotEquals(workvalnumber, updateTimesheet.get_WorkerListCount()+"");
}
*/
	  }
  

