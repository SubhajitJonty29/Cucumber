package stepdefinations;

import java.io.IOException;

import cucumber.api.java.en.Given;
import pageactions.PageNameActions;
import testbase.Testbase;
import testutility.Testutils;



public class Steps {
	
	
	
	Testbase testbase = new Testbase();
	PageNameActions pagenameactions = new PageNameActions();
	Testutils testutils = new Testutils();
			
	@Given("^I open browser$")
	public void i_open_browser() throws IOException   {
		testbase.driverinitialization();
		testutils.Openurl("URL");
		testutils.takeScreenshotAtEndOfTest("URLOPEN");
	}		

}
