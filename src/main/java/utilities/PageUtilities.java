package utilities;

import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageUtilities {
public static WebDriver driver;
public	static JavascriptExecutor js=(JavascriptExecutor)driver;
	
	public static WebElement isElementLoaded(WebDriver driver,WebElement elementToBeLoaded, int time) {
	    WebDriverWait wait = new WebDriverWait(driver, time);
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
	    return element;
	}

	public static  WebElement waitforelementtobeclickable(WebDriver driver,WebElement elementToBeLoaded, int time) {
	    WebDriverWait wait = new WebDriverWait(driver, time);
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
	    return element;
	}
	public static  void alertisPresent(WebDriver driver, int time) {
	    WebDriverWait wait = new WebDriverWait(driver, time);
	    wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static  void waitForFrame(WebDriver driver,WebElement frametoswitch, int time) {
	    WebDriverWait wait = new WebDriverWait(driver, time);
	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frametoswitch));
	}
	
	public static  WebElement isElementVisible(WebDriver driver,WebElement elementtobeloaded, int time) {
	    WebDriverWait wait = new WebDriverWait(driver, time);
	    WebElement element=wait.until(ExpectedConditions.visibilityOf(elementtobeloaded));
	    return element;
	}
	
	public static  Boolean ElementValuePresent(WebDriver driver,WebElement elementtobeloaded, String txt,int time) {
	    WebDriverWait wait = new WebDriverWait(driver, time);
	    Boolean element=wait.until(ExpectedConditions.textToBePresentInElementValue(elementtobeloaded, txt));
	    return element;
	}
	
	
	public static void fileUpload(WebDriver driver, WebElement element,  String path) 
	{
		
		File fileuploaded = new File(path);
		element.sendKeys(fileuploaded.getAbsolutePath());
	}
	
	public static String selectValue(WebDriver driver,WebElement element, String txt) {
		PageUtilities.waitforelementtobeclickable(driver, element, 2);
		element.click();
		Select dropdownselected=new Select(element);
		PageUtilities.isElementLoaded(driver, element, 1);
		List<WebElement> txtvalue=dropdownselected.getOptions();
		for(WebElement we:txtvalue) {
			dropdownselected.selectByVisibleText(txt);
		}
		return txt;
		
	}
	
	public static void selectValue(WebDriver driver,WebElement element,int index) {
		
		PageUtilities.isElementLoaded(driver, element, 2);
		Select dropdown=new Select(element);
		List<WebElement> num=dropdown.getOptions();
		
				for(int i=index;i<num.size();i++)
		{
		
		dropdown.selectByIndex(i);
		}
				
	}
	
	public static void enterValue(WebElement element, String value) {
		element.sendKeys("value");
	}

	public  static void performaction(WebElement element, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver; 
	js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public static void scrollintoview(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("window.scrollBy(0,-350)", "");
	}

}
