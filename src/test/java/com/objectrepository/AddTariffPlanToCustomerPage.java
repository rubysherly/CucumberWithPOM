package com.objectrepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class AddTariffPlanToCustomerPage  extends Base{

	public AddTariffPlanToCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="customer_id")
	private WebElement cust_id;
	@FindBy(name="submit")
	private WebElement sub;
	@FindBy(xpath="//section[@id=\"main\"]")
	private WebElement sucesmessage;
	public WebElement getCust_id() {
		return cust_id;
	}
	public WebElement getSub() {
		return sub;
	}
	public WebElement getSucesmessage() {
		return sucesmessage;
	}

}
