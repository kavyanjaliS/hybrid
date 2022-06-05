package wbdcmds;

//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.observer.entity.MediaEntity;

import fwork.startbrowser;

public class ActionDriver {
	public WebDriver driver;
    
	public ActionDriver(){
		driver=startbrowser.driver;
		
	}
	public void NavigateToApplication(String url) {
		try {
			driver.get(url);
			startbrowser.childTest.pass("sucessfully navigated to:"+url);
		}catch(Exception e) {
			startbrowser.childTest.fail("unable to navigate to:"+url);		
	}
}
	public void click(By locator,String eleName) throws Exception {
		try {
		driver.findElement(locator).click();
		startbrowser.childTest.pass("Performed click action on:"+eleName);
		}catch(Exception e) {
			startbrowser.childTest.fail(" Unable to perform click action on:"+eleName,MediaEntityBuilder.createScreenCaptureFromBase64String(Screenshot()).build());
			startbrowser.childTest.info(e);
			throw e;
		}
		}
	
	public void type(By locator,String testData,String eleName) throws Exception{
		try {
		driver.findElement(locator).sendKeys(testData);	
		startbrowser.childTest.pass("Performed click action in:"+eleName+"with test data"+testData);
		}catch(Exception e) {
			startbrowser.childTest.fail(" Unabale to perform click action in:"+eleName,MediaEntityBuilder.createScreenCaptureFromBase64String(Screenshot()).build());
			startbrowser.childTest.info(e);
			throw e;
		}
	}
	public void mouseHover(By locator,String eleName) throws Exception {
		try {
			WebElement mo=driver.findElement(locator);
			Actions a = new Actions(driver);
			a.moveToElement(mo).build().perform();
			startbrowser.childTest.pass("Performed mousehover action on:"+eleName);
		} catch (Exception e) {
			startbrowser.childTest.fail(" Unabale to perform mousehover action in:"+eleName,MediaEntityBuilder.createScreenCaptureFromBase64String(Screenshot()).build());
			startbrowser.childTest.info(e);
			throw e;
		}
	}
	
	public String Screenshot() {
		return((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	}

	
		
	}
	
