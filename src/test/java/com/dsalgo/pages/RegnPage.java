package com.dsalgo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegnPage {
	
WebDriver driver;
	
	public RegnPage(WebDriver driver) 
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="id_username") WebElement uname;
	@FindBy(id="id_password1") WebElement pass1;
	@FindBy(id="id_password2") WebElement pass2;
	@FindBy(xpath="//input[@value='Register']") WebElement register;
	
	public void regisn(String username,String password,String cpass) {
		
		uname.sendKeys(username);
		pass1.sendKeys(password);
		pass2.sendKeys(cpass);
		
		register.click();
	}

}
