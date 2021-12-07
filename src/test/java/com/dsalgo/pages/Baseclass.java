package com.dsalgo.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.dsalgo.utility.BrowserFactory;

public class Baseclass {
	
public WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		
		driver=BrowserFactory.startApplication(driver,"chrome", "https://dsportalapp.herokuapp.com/");
		Reporter.log("Welcome to home page");
	}
	
	@AfterClass
	public void afterClass() {
		
		BrowserFactory.quitbrowser(driver);
	}

}
