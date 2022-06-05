package scripts;

import org.testng.annotations.Test;

import fwork.startbrowser;
import reuseaction.comfunction;

public class login_logout extends startbrowser {
  @Test
  
  public void login_logoutTestCase() throws Exception {
	  comfunction cfs= new comfunction();
	  cfs.Login();
	  Thread.sleep(30000);
	  cfs.logout();
  }
 
}
