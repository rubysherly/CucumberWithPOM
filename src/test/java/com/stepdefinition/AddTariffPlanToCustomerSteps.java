package com.stepdefinition;


import org.junit.Assert;

import baseclass.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.objectrepository.AddTariffPlanToCustomerPage;

public class AddTariffPlanToCustomerSteps extends Base{
	

	@When("the user fill in the valid customer ID details.{string}")
	public void the_user_fill_in_the_valid_customer_ID_details(String custId) {
		
		AddTariffPlanToCustomerPage addPlanToCust = new AddTariffPlanToCustomerPage();
		
	    type(addPlanToCust.getCust_id(),custId);
	}

	@When("the user clicks the Submit button.")
	public void the_user_clicks_the_Submit_button() {
		
		AddTariffPlanToCustomerPage addPlanToCust = new AddTariffPlanToCustomerPage();
		
		btn_click(addPlanToCust.getSub());
	   
	}

	@Then("the user should see the customer tariff plan generate to customer.")
	public void the_user_should_see_the_customer_tariff_plan_generate_to_customer() {
		AddTariffPlanToCustomerPage addPlanToCust = new AddTariffPlanToCustomerPage();
		
		Assert.assertTrue(addPlanToCust.getSucesmessage().isDisplayed());
	}


}
