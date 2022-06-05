package scripts;

import org.testng.annotations.Test;

import fwork.startbrowser;
import reuseaction.Test2;

public class Buysearch_2 extends startbrowser{
  @Test
  public void search_place() throws Exception {
	  Test2 ts = new Test2();
	  ts.locality2();
  }
}
