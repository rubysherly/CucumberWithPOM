package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class HomePage extends Base {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='Add Customer'])[1]")
	private WebElement Ink_addCustomer;

	@FindBy(xpath = "(//a[text()='Add Tariff Plan to Customer'])[1]")
	private WebElement Ink_addTariffPlanToCustomer;

	@FindBy(xpath = "//a[text()='Add Tariff Plan']")
	private WebElement Ink_addTariffPlan;

	@FindBy(xpath = "(//a[text()='Pay Billing'])[1]")
	private WebElement Ink_payBilling;

	public WebElement getInk_addCustomer() {
		return Ink_addCustomer;
	}

	public WebElement getInk_addTariffPlanToCustomer() {
		return Ink_addTariffPlanToCustomer;
	}

	public WebElement getInk_addTariffPlan() {
		return Ink_addTariffPlan;
	}

	public WebElement getInk_payBilling() {
		return Ink_payBilling;
	}
}
