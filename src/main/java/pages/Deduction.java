package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deduction {
	WebDriver driver;
	public  Deduction(WebDriver driver){
		this.driver=driver;
	    PageFactory.initElements(driver,this);
	   	}
	@FindBy(xpath="//a[@href='/payrollapp/timesheet/index']")
	private static WebElement timesheettabnext;
	
	public void deductionbtnclick() {
		timesheettabnext.click();
	}
	
	

}

