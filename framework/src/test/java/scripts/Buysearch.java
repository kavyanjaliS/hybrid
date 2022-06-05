package scripts;

import org.testng.annotations.Test;


import fwork.startbrowser;
import reuseaction.Searchplace;

public class Buysearch extends startbrowser{
  @Test
  public void places_search() throws Exception {
	  Searchplace sp = new Searchplace();
	  sp.locality();
  }
}
