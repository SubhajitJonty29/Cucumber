package pageactions;


import org.openqa.selenium.support.PageFactory;

import pageloactor.PageNameLocator;
import testbase.Testbase;


public class PageNameActions extends Testbase {

	PageNameLocator pagenamelocator = new PageNameLocator();
	
public PageNameActions () {
		
		PageFactory.initElements(Testbase.driver,this);
		
		}
	
	
	
	
	public void clickonelement() {
		
		pagenamelocator.SpiceClub.click();
	}
}
