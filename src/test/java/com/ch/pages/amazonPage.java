package com.ch.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPage {
	WebDriver driver;
	
	public amazonPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(), 'Hello, Sign in')]")
	
	WebElement signin;
	
	public WebElement getsignin() {
		return signin;
	}
	@FindBy(xpath="//input[@name='email']")
	WebElement getemail;
	public WebElement email() {
		return getemail;
	}
	@FindBy(xpath="//input[@id='continue']")
	WebElement submit;
	public WebElement presscontinue() {
		return submit;
	}
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	public WebElement getpassword() {
		return password;
	}
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signinsubmit;
	public WebElement signinsubmit() {
		return signinsubmit;
	}
}
