package com.objectrepository;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class PayBillingPage extends Base {

	public PayBillingPage() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(name="customer_id")
private WebElement customerId;

@FindBy(name="submit")
private WebElement pay_submit;

@FindBy(xpath="//section[@id=\"main\"]")
private WebElement paysucess;

public WebElement getCustomerId() {
	return customerId;
}

public WebElement getPay_submit() {
	return pay_submit;
}

public WebElement getPaysucess() {
	return paysucess;
}
}
