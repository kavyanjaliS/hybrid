package reuseaction;

import org.openqa.selenium.WebDriver;

import fwork.startbrowser;
import objrep.searchpage;
import wbdcmds.ActionDriver;

public class Searchplace {
	public ActionDriver aDriver;
	public WebDriver driver;
	
	public Searchplace() {
		aDriver=new ActionDriver();
		driver=startbrowser.driver;
		

}
	
	public  void locality() throws Exception {
		
	startbrowser.childTest=startbrowser.parentTest.createNode("login to appliction");
	 aDriver.NavigateToApplication("https://www.nobroker.in/");
	 aDriver.click(searchpage.selectbuy,"click buy option");
	 aDriver.type(searchpage.selectcity,"hyderabad","select city");
	 aDriver.type(searchpage.searchitem,"kukatpally","enter locality");
	 aDriver.click(searchpage.searchicon,"click search icon");
	 
	 
}
	
}