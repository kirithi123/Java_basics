package com.dsalgo.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver,String browsername,String appurl)
	{
		
		System.out.println("url" +appurl);
		

	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	else if (browsername.equals("ff")) {
		System.setProperty("webdriver.gecko.driver",".\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	
	} 
	
	else if (browsername.equals("edge")) {
		System.setProperty("webdriver.edge.driver",".\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
	else {
		
		System.out.print("Driver not found");
	}
	driver.get(appurl);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	
    return driver;
	}
	
	public static void quitbrowser(WebDriver driver)
	{
		driver.close();
		driver.quit();
	}

}
