package com.stepdefinition;



import org.junit.Assert;

import cucumber.api.java.en.Then;
import com.objectrepository.AccessPage;

public class AccessSteps {

	@Then("the user should see the customer id generate.")
	public void the_user_should_see_the_customer_id_generate() {
		
		AccessPage access = new AccessPage();
		
		Assert.assertTrue(access.getLbl_custId().isDisplayed());
		
	}

}
