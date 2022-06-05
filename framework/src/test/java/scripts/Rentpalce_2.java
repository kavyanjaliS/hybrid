package scripts;

import org.testng.annotations.Test;

import fwork.startbrowser;
import reuseaction.Test4;

public class Rentpalce_2 extends startbrowser{
  @Test
  public void search_place2() throws Exception {
	  Test4 st = new Test4();
	  st.locality4();
  }
}
