package scripts;

import org.testng.annotations.Test;

import fwork.startbrowser;
import reuseaction.Test3;

public class Rentplace extends startbrowser{
  @Test
  public void search_place3()throws Exception
  {
	  Test3 tt =  new Test3();
	  tt.locality3();
	  
  }


}
