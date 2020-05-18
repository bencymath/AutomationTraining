package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class Client {
	WebDriver driver;
	public  Client(WebDriver driver){
		this.driver=driver;
	    PageFactory.initElements(driver,this);
	   	}
	@FindBy(xpath="//a[@href='/payrollapp/worker/index']")
	public static WebElement workerstabnext;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Inglewood Nursing Home')]")
	private static WebElement clientablevalue;
	@FindBy(xpath="//table[@class='table table-striped table-bordered']")
	private static WebElement fulltable;
	@FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr")
	public List<WebElement> row;
	@FindBy(xpath="//*[@id=\"w1\"]/div/b[2]")
	private static WebElement clientcount;
	@FindBy(xpath="//*[@id=\"w3\"]/li[6]/a")
	private static WebElement clienttab;
	
	public void clientbtnclick() {
		workerstabnext.click();
	}
	
	
	public void findnumberofrows() {
		//WebElement TogetRows = row;
	List<WebElement>TotalRowsList = row;
		System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
	}
	public String getNumberOfClientValues() {
	PageUtilities.isElementLoaded(driver, clientcount, 1);
	 return	clientcount.getText();
	}
	
	public void clickTimesheetTab() {
		PageUtilities.waitforelementtobeclickable(driver, clienttab, 2);
		clienttab.click();
	}
	
	
}
