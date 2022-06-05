package reuseaction;

import org.openqa.selenium.WebDriver;

import fwork.startbrowser;
import objrep.Rentsearch;
import wbdcmds.ActionDriver;

public class Test4 {

	public ActionDriver aDriver;
	public WebDriver driver;
	
	public Test4() {
		aDriver=new ActionDriver();
		driver=startbrowser.driver;
		

	}
public  void locality4() throws Exception {
		
		startbrowser.childTest=startbrowser.parentTest.createNode("login to appliction");
		 aDriver.NavigateToApplication("https://www.nobroker.in/");
		 aDriver.click(Rentsearch.selectrent,"click buy option");
		 aDriver.type(Rentsearch.selectplace,"hyderabad","select city");
		 aDriver.type(Rentsearch.enterlocality,"Nampally","enter locality");
		 aDriver.click(Rentsearch.search,"click search icon");
		 
		 
	}
}
