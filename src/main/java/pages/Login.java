package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import utilities.ExcelToDataProvider;
import utilities.PageUtilities;
public class Login {
	
	public WebDriver driver;
	   	public  Login(WebDriver driver)
	{
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	    		}
	@FindBy(xpath="//*[@id=\"login-form\"]/div[1]/p")
	private static WebElement userlabel;
	
	@FindBy(xpath="//p[@class=contains(text(),'Password cannot be blank.')]")
	private static WebElement passwordlabel;
	
	@FindBy(how=How.ID ,using="loginform-username")
	private static WebElement usertextbox;
	
	@FindBy(how=How.ID ,using="loginform-password")
	private static WebElement passwordtxtbox;
	
	@FindBy(xpath="//*[@id=\"login-form\"]/div[5]/button")
	private static WebElement loginbutton;
	
	@FindBy (xpath="//p[contains(text(),'Incorrect username or password.')]") 
	private static WebElement wrongloginlabel;
	
	
	public  void login(String username,String password){
		
		 usertextbox.sendKeys(username);
		 passwordtxtbox.sendKeys(password);
		 loginbutton.click();
		 	}
	
	public void verifyLogin(String username,String password) {
		usertextbox.sendKeys(username);
		passwordtxtbox.sendKeys(password);
		loginbutton.click();
	}
	public boolean isBlankUserField() {
	    boolean val1;
		PageUtilities.isElementLoaded(driver, usertextbox, 1);
		if (usertextbox.getAttribute("value").contentEquals(""))
		{
			val1=true;
			
		}
		return val1=true;
	}
	public String getLabelEmptyUserField() {
		
	return	userlabel.getText();

	}
	public boolean isBlankPwdField() {
		boolean val2;
		if (passwordtxtbox.getAttribute("value").contentEquals(""))
		{
			val2=true;
			
		}
		return val2=true;
	}
	public String getLabelEmptyPwdField() {
		PageUtilities.isElementLoaded(driver, passwordlabel, 2);
		return passwordlabel.getText();
	}
		
	public void clickPasswordTxtBox() {
		passwordtxtbox.click();
	}
	
	public String getLoginPageWelcomeMsg() {
		String text="log in";
		return text;
		}
	
	public String getWrongLoginError() {
		PageUtilities.isElementLoaded(driver, wrongloginlabel, 2);
		return wrongloginlabel.getText();
	}
	
}
