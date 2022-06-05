package reuseaction;

import org.openqa.selenium.WebDriver;

import fwork.startbrowser;
import objrep.searchpage;
import wbdcmds.ActionDriver;

public class Test2 {

	public ActionDriver aDriver;
	public WebDriver driver;
	
	public Test2() {
		aDriver=new ActionDriver();
		driver=startbrowser.driver;
}
	
	public  void locality2() throws Exception {
		
		startbrowser.childTest=startbrowser.parentTest.createNode("login to appliction");
		 aDriver.NavigateToApplication("https://www.nobroker.in/");
		 aDriver.click(searchpage.selectbuy,"click buy option");
		 aDriver.type(searchpage.selectcity,"hyderabad","select city");
		 aDriver.type(searchpage.searchitem,"Nampally","enter locality");
		 aDriver.click(searchpage.searchicon,"click search icon");
		 
}
}