package com.dsalgo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver) 
	{
		
		this.driver=driver;
		//PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="navbarCollapse") WebElement dropdown;
	@FindBy(xpath="//a[@href='/register']") WebElement register;
	@FindBy(xpath="//a[@href='/login']") WebElement login;
	
	@FindBy(xpath="//a[@href='data-structures-introduction']") WebElement ds;
	@FindBy(how=How.CLASS_NAME,using="align-self-end btn btn-lg btn-block btn-primary") List<WebElement> getstarted;
	public void newuser() {
		
		dropdown.click();
		Reporter.log("Dropdown is clicked");
		
		register.click();
		Reporter.log("Trying to register a new user");
		
		
		
	}
	
	

}
