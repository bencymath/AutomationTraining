package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Company {
	
	WebDriver driver;
	JavascriptExecutor js= (JavascriptExecutor) driver;
	public  Company(WebDriver driver){
		this.driver=driver;
	    PageFactory.initElements(driver,this);
	   	}
	@FindBy(xpath="//tr/td[contains(text(),'Eastbourne')]")
	private static WebElement value;
	
	@FindBy(xpath="/html/body/section/div/div/div[1]/ul/li[1]/a")
	private static WebElement branchtab;
	
	@FindBy(tagName="td")
	private static WebElement compcol;
	
	@FindBy(xpath="//*[@id=\"w0\"]/table")
	private static WebElement comptable;
	
	@FindBy(linkText="Division")
	private static WebElement division;
	
	@FindBy(xpath="//a[@href='/payrollapp/client/index']")
	public static WebElement clienttab;

	@FindBy(xpath="//*[@id=\"w0\"]/div[6]/div/button")
	public static WebElement savebtn;
	
	@FindBy(name="Company[company_email]")
	public static WebElement emailbtn;
	
	@FindBy(xpath="/html/body/section/div/div/div[1]/ul/li[2]/a")
	private static WebElement branchpage;
	
	@FindBy(xpath="//a[@href='/payrollapp/timesheet/index']")
	public static WebElement timesheettab;
	
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Eastbourne')]")
	private static WebElement divbranchtabval;
	
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Accounts')]")
	private static WebElement divtabval;
	
	public void companyBtnClick() {
		clienttab.click();
	}
	public void SaveBtnClick() {
		savebtn.click();
	}
	public void branchBtnClick()
	{
		branchpage.click();
	}
	
	public void divTabClick() {
		division.click();
	}
	public String getCompanyTableTxt()
	{
		String companytableval=value.getText();
		return companytableval;
	}
	public String getDivTableTxt()
	{
		String divtableval=divtabval.getText();
		return divtableval;
	}
	
	public String getDivBranchTabVal() {
		return divbranchtabval.getText();
	}
	
	public void goToTimesheet() {
		timesheettab.click();
	}
	
	
		
	


	
}
