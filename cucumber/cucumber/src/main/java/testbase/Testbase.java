package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {

	public static WebDriver driver;
	public static Properties prop;
	public static ChromeOptions co = new ChromeOptions();
	
	
	public Testbase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\cofigurations\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	
	public void driverinitialization(){
		
		try {
			
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
				
			driver = new ChromeDriver(co.addArguments("--remote-allow-origins=*")); 
		}
		else if(browserName.equals("FF")){
			driver = new FirefoxDriver(); 
		}
		}
		catch(Exception e) {
			
			driver = new ChromeDriver(co.addArguments("--remote-allow-origins=*"));
		}
		finally {
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
	
}
	
}
