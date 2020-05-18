package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Login;

public class ExcelToDataProvider {
	public WebDriver driver;
   	public  ExcelToDataProvider(WebDriver driver)
{
	this.driver=driver;
    PageFactory.initElements(driver, this);
    		}
@FindBy(xpath="//*[@id=\"login-form\"]/div[1]/p")
public WebElement userlabel;

@FindBy(xpath="//p[@class=contains(text(),'Password cannot be blank.')]")
public WebElement passwordlabel;

@FindBy(how=How.ID ,using="loginform-username")
public WebElement usertextbox;

@FindBy(how=How.ID ,using="loginform-password")
public WebElement passwordtxtbox;

@FindBy(xpath="//*[@id=\"login-form\"]/div[5]/button")
public WebElement loginbutton;

@FindBy (xpath="//p[contains(text(),'Incorrect username or password.')]") 
public WebElement wrongloginlabel;
	 
	

		     
	    
	    
	    public void setUsername(String username, String password)
	    {
	    	usertextbox.clear();
	    	usertextbox.sendKeys(username);
	    	
	    	passwordtxtbox.clear();
	    	passwordtxtbox.sendKeys(password);
	    	loginbutton.click();
	    	
	       System.out.println("UserName: "+ username);
	      
	    }
	     
	     
	    @DataProvider(name="userdetails")
	    public  Object[][] userName(String xlFilePath, String sheetName) throws Exception
	    {
	        Object[][] data = testData(xlFilePath, sheetName);
	        return data;
	    }
	     
	    public static Object[][] testData(String xlFilePath, String sheetName) throws Exception{
	    	   
	            FileInputStream file= new FileInputStream(xlFilePath);
	            XSSFWorkbook wb = new XSSFWorkbook(file);
	            XSSFSheet sheet = wb.getSheet(sheetName);
	            int rowCount = sheet.getLastRowNum();
	            int column = sheet.getRow(0).getLastCellNum();
	            Object[][] data = new Object[rowCount][column];
	            for (int i = 1; i <= rowCount; i++) {
	                XSSFRow row = sheet.getRow(i);
	                for (int j = 0; j < column; j++) {
	                    XSSFCell cell = row.getCell(j);
	                    DataFormatter formatter = new DataFormatter();
	                    String val = formatter.formatCellValue(cell);
	                    data[i - 1][j] = val;
	                }
	            }
	 return data;
	    }
}
	



