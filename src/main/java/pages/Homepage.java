package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class Homepage {
	WebDriver driver;
	
	public  Homepage(WebDriver driver)
	{
		this.driver=driver;
	    PageFactory.initElements(driver,this);
	   
	}
	@FindBy(xpath="//a[@href='/payrollapp/company/index']")
	public static WebElement companylink;
	@FindBy(xpath="//*[@id=\"w0\"]/div[6]/div/button")
	public static WebElement savebtn;
	@FindBy(xpath="//*[@id=\"w1\"]/li[6]/a")
	private static WebElement timesheettab;
	@FindBy(xpath="//*[@id=\"w1\"]/li[4]/a")
	private static WebElement workertab;
	@FindBy(xpath="//*[@id=\"w1\"]/li[3]/a")
	private static WebElement clienttab;
	
	public String getHomePageWelcomeMsg() {
		String text="logged in";
		return text;
		}
	public void clickCompanyTab() {
		PageUtilities.isElementLoaded(driver, companylink, 2);
		companylink.click();
	}
	
	public void clickClientTab() {
		PageUtilities.isElementLoaded(driver, clienttab, 2);
		clienttab.click();
	}
	
	public void clickTimeSheetTab() { //ClickTimeSheet
		PageUtilities.isElementLoaded(driver, timesheettab, 5);
		timesheettab.click();
		
	}
	public void clickWorkerTab() {
		PageUtilities.isElementLoaded(driver, workertab, 5);
		workertab.click();
		
	}
	
	
	
}
