package com.stepdefinition;



import org.junit.Assert;

import baseclass.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.objectrepository.PayBillingPage;

public class PayBillingSteps extends Base {


	@When("the user fill in the valid customer ID. {string}")
	public void the_user_fill_in_the_valid_customer_ID(String customerId) {
		
	    PayBillingPage pay = new PayBillingPage();
	    
	    type(pay.getCustomerId(),customerId);
	    
	}

	@When("the user clicks the submit button.")
	public void the_user_clicks_the_submit_button() {
	   
		 PayBillingPage pay = new PayBillingPage();
		 
		 btn_click(pay.getPay_submit());
	}

	@Then("the user should see the payment detail page is generate.")
	public void the_user_should_see_the_payment_detail_page_is_generate() {
		
		 PayBillingPage pay = new PayBillingPage();
		 Assert.assertTrue(pay.getPaysucess().isDisplayed());
	}

}

