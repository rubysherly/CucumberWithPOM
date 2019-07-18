package com.stepdefinition;



import java.util.Map;

import baseclass.Base;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import com.objectrepository.AddcustomerPage;

public class AddCustomerSteps extends Base {

	@When("the user fill in the valid customer details.")
	public void the_user_fill_in_the_valid_customer_details(DataTable customerDetails) {

		AddcustomerPage addcust = new AddcustomerPage();

		Map<String, String> customerDetailsMap = customerDetails.asMap(String.class, String.class);
		btn_click(addcust.getClk_Done());
		type(addcust.getTxt_fstName(), customerDetailsMap.get("firstName"));
		type(addcust.getTxt_lstname(),customerDetailsMap.get("lastName"));		
		type(addcust.getTxt_eMail(),customerDetailsMap.get("emailAdress"));
		type(addcust.getTxt_addr(),customerDetailsMap.get("address"));
		type(addcust.getTxt_telePno(),customerDetailsMap.get("phoneNum"));
	}

	@When("the user clicks the SUBMIT button.")
	public void the_user_clicks_the_SUBMIT_button() {

		AddcustomerPage addcust = new AddcustomerPage();

		btn_click(addcust.getClk_Submit());
	}

}
