package com.Synergy.Genericlib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements IAutoConsts {
public static WebDriver driver;
public void openBrowser() throws Throwable
{
	System.setProperty(CHROME_KEY, CHROME_VALUE);
//	driver.manage().window().maximize();
	FileLib flib = new FileLib();
	String appurl = flib.readPropertyData(PROP_PATH, "url");
	driver = new ChromeDriver();
	driver.get(appurl);
	driver.manage().window().maximize();
	
	WebDriverCommonLib wlib = new WebDriverCommonLib();
	String expectedLoginTitle = flib.readPropertyData(PROP_PATH, "loginTitle");
	wlib.verify(wlib.getPageTitle(), expectedLoginTitle, "Login Page");
}
public void closeBrowser() {
	driver.quit();
}
}



	

	