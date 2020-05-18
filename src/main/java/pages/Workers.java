package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Workers {
	WebDriver driver;
	public  Workers(WebDriver driver){
		this.driver=driver;
	    PageFactory.initElements(driver,this);
	   	}
	@FindBy(xpath="//a[@href='/payrollapp/deduction/index']")
	public static WebElement deductiontabnext;
	
	@FindBy(xpath="//*[@id=\"w1\"]/div/b[2]")
	public WebElement workerentry;
	
	@FindBy(xpath="//*[@id=\"w3\"]/li[6]/a")
	public WebElement timesheettab;
	
	public void workersbtnclick() {
		deductiontabnext.click();
	}
	
	public String getNumberOfWorkerValues() {
		 return	workerentry.getText();
		}
	
	public void clickTimesheet() {
		timesheettab.click();
	}
	
	
		

}


