package com.stepdefinition;



import baseclass.Base;
import cucumber.api.java.en.Given;
import com.objectrepository.HomePage;

public class HomePageSteps extends Base {

	@Given("the user is in add customer page.")
	public void the_user_is_in_add_customer_page() {
		HomePage home = new HomePage();
		btn_click(home.getInk_addCustomer());
	}

	@Given("The user is in add tariff plan page")
	public void the_user_is_in_add_tariff_plan_page() {
		HomePage home = new HomePage();
		btn_click(home.getInk_addTariffPlan());

	}
	
	@Given("the user is in add Tariff plan to customer page.")
	public void the_user_is_in_add_Tariff_plan_to_customer_page() {
		HomePage home = new HomePage();
		btn_click(home.getInk_addTariffPlanToCustomer());
	}
	
	@Given("the user is in add Pay Billing page.")
	public void the_user_is_in_add_Pay_Billing_page() {
		HomePage home = new HomePage();
		btn_click(home.getInk_payBilling());
	}
}
