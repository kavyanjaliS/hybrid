package reuseaction;

import org.openqa.selenium.WebDriver;

import fwork.startbrowser;
import objrep.homepage;
import objrep.loginpage;
import wbdcmds.ActionDriver;

public class comfunction {
	public ActionDriver aDriver;
	public WebDriver driver;
	
	public comfunction() {
		aDriver=new ActionDriver();
		driver=startbrowser.driver;
	}
 public void Login()throws Exception
 {
	 startbrowser.childTest=startbrowser.parentTest.createNode("login to appliction");
	 aDriver.NavigateToApplication("https://www.nobroker.in/");
	 aDriver.click(loginpage.login,"log in button");
	 aDriver.type(loginpage.phnumber,"9493155067","phone number box");
	 aDriver.click(loginpage.havepword,"have password button");
	 aDriver.type(loginpage.password, "kavy4333","password box");
	 aDriver.click(loginpage.btncontinue,"click continue button");
 }
 public void logout() throws Exception {
	 startbrowser.childTest=startbrowser.parentTest.createNode("login to appliction");
	  aDriver.mouseHover(homepage.createmyacc,"My Account Link");
	 aDriver.mouseHover(homepage.btnlogout,"log out button");
	 
	 
 }
}
