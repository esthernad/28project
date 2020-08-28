package com.ch.stepdef;




import com.ch.common.baseclass;
import com.ch.pages.amazonPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef extends baseclass {
	amazonPage ap;
	
	
	@Given("^I'm on the home page$")
	public void i_m_on_the_home_page() throws Throwable {
		getdriver();
		ap = new amazonPage(driver);
   
	}

	@When("^I click on signin page$")
	public void i_click_on_signin_page() throws Throwable {
		
		ap.getsignin().click();
		
		
	}

	@When("^enter email address$")
	public void enter_email_address() throws Throwable {
	   ap.email().sendKeys("esthernad@yahoo.com");
	}

	@When("^click submit$")
	public void click_submit() throws Throwable {
	    ap.presscontinue().click();
	}

	@When("^enter password and click singin$")
	public void enter_password_and_click_singin() throws Throwable {
	    ap.getpassword().sendKeys("tech");
	    ap.signinsubmit().click();
	}

	@Then("^page loads successfully$")
	public void page_loads_successfully() throws Throwable {
	    
	}



}
