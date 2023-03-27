package testutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testbase.Testbase;

public class Testutils extends Testbase {
	
	
	Actions actions = new Actions(driver);
	
	//screenshots
	public void takeScreenshotAtEndOfTest( String name) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "\\src\\main\\java\\Screenshots\\screenshot" + name + System.currentTimeMillis() +".png"));
	}
	
public void Openurl(String URL){
		
		driver.get("https://google.com");
	}
	
//mouseclicksmethods
	
public void clickOnElement(WebElement element) {
		
		actions.click(element).build().perform();
		
	}
	
public void rightClickOnElement(WebElement element) {
		
		actions.contextClick(element).build().perform();
		
	}

public void doubleClickOnElement(WebElement element) {
	
	actions.doubleClick(element).build().perform();
	
	}


public void mouseHoverOnaElement(WebElement element) {
	
	actions.moveToElement(element).build().perform();
	
	}


}
