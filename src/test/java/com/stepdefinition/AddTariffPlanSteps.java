package com.stepdefinition;



import org.junit.Assert;

import baseclass.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.objectrepository.AddTariffPlanPage;

public class AddTariffPlanSteps extends Base {

	@When("the user fill in valid tariff plan details {string}, {string},{string},{string},{string},{string},{string}")
	public void the_user_fill_in_valid_tariff_plan_details(String monthrent, String freelocalmin, String freeintermin,
			String freesmspack, String localmincharge, String intermincharge, String smscharges) {

		AddTariffPlanPage addtariff = new AddTariffPlanPage();

		type(addtariff.getMonth_Rental(), monthrent);
		type(addtariff.getFreeLocalMin(), freelocalmin);
		type(addtariff.getFreeInterMin(), freeintermin);
		type(addtariff.getFreeSMSPack(), freesmspack);
		type(addtariff.getLocalMinCharges(), localmincharge);
		type(addtariff.getInterMinCharges(), intermincharge);
		type(addtariff.getSmsCharges(), smscharges);
	}

	@When("the user clicks submit button in add tariff plan page")
	public void the_user_clicks_submit_button_in_add_tariff_plan_page() {

		AddTariffPlanPage addtariff = new AddTariffPlanPage();

		btn_click(addtariff.getClksubmit());

	}

	@Then("the user should see the success message")
	public void the_user_should_see_the_success_message() {

		AddTariffPlanPage addtariff = new AddTariffPlanPage();

		Assert.assertTrue(addtariff.getSucessmsg().isDisplayed());
	}

}
