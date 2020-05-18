package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class CreateTimeSheet {
	WebDriver driver;
	String jpegfile="src/test/resources/sample/java.jpg";
	String pngfile="src/test/resources/sample/p.png";
	
	public  CreateTimeSheet(WebDriver driver){
		this.driver=driver;
	    PageFactory.initElements(driver,this);
	    		   	}
	
	@FindBy(xpath="//*[@id=\"w0\"]/div[2]/button")
	public static WebElement skipbtnclick;
	
	@FindBy(id="file-logo")
	private static WebElement browsebtn;
	
	@FindBy(xpath="//*[@id=\"w0\"]/div[1]/div[1]/div[3]/div[1]/input")
	private static WebElement browsetextbox;
	
	@FindBy(xpath="//*[@id=\"w0\"]/div[1]/div[1]/div[3]/div[2]/button[1]")
	private static WebElement removefile;
	
	@FindBy(xpath="//*[@id=\"w0\"]/div[1]/div[1]/div[3]/div[2]/button[3]")
	private static WebElement uploadbtn;
	
	@FindBy(xpath="//div[contains(text(),'Please upload jpg files !!!')]")
	private static WebElement filerrormsg;
	
	@FindBy(xpath="//a[@href='/payrollapp/timesheet/create']")
	public static WebElement createtimesheetlink;
	
	@FindBy(xpath="//span[contains(text(),'Browse …')]")
	private static WebElement buttontool;
	
	@FindBy(xpath="/html/body/header/div[1]/div/div[2]/div[1]/ul/li[2]/a")
	private static WebElement userclick;
	
	@FindBy(xpath="/html/body/header/div[1]/div/div[2]/div[1]/ul/li[2]/ul/div/li[2]/a")
	private static WebElement logout;
	
	@FindBy(linkText="Dashboard")
	private static WebElement dashboard;
	
	public void clickCreateTimeSheet() {
		PageUtilities.isElementLoaded(driver, createtimesheetlink, 2);
		createtimesheetlink.click();
	}
	public void clickSkipBtn() {
		skipbtnclick.click();
		
	}
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public String getTimeSheetDismissAlertMsg() {
		String text="Alert dismissed";
		return text;
		}
	public String getTimeSheetAcceptAlertMsg() {
		String text="Alert accepted";
		return text;
		}
	
	public void uploadJPGFile() {   //declare path as variable
		PageUtilities.fileUpload(driver, browsebtn,jpegfile);
						
	}
	public String getUploadJPEGFileName() {
		String[] splitjpg = jpegfile.split("/");
		return splitjpg[4];
	}
	
	
	public void uploadNonJPGFile() 
	{
		PageUtilities.fileUpload(driver, browsebtn, pngfile);
						
	}
	
	public boolean isFileUploadInJPGFormat() {
	return	browsetextbox.getAttribute("value").endsWith(".jpg");
		}
	
	public String getFileUploadErrorMsgDisp() {
		PageUtilities.isElementLoaded(driver, filerrormsg, 2);
		return filerrormsg.getText();
	}
	
	public void removeFileUpload() {
		PageUtilities.waitforelementtobeclickable(driver, removefile, 5);
				removefile.click();
			}
	
	public boolean getFileRemovedStatus() {							//rename get browsertxtbox value and return null
		return browsetextbox.getText().contentEquals("");
	}
	
	public String getToolTipTxtForTxtBox() {
		PageUtilities.isElementLoaded(driver, browsetextbox, 3);
	return	browsetextbox.getAttribute("title");
	}
	
	public String getToolTipTxtForRemoveButton() {
		return  removefile.getAttribute("title");
	}
	
	public String getgetToolTipTxtForUploadButton() {
		return  uploadbtn.getAttribute("title");
	}
	
	

	public void logoutFromCreateTimeSheetPage() {
		userclick.click();
		logout.click();
	
	}
	
	public void clickDashBoard() {
		dashboard.click();
	}
}
