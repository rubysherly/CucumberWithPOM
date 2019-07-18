package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class AddTariffPlanPage extends Base {
	
	public AddTariffPlanPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="rental")
	private WebElement month_Rental;
	
	@FindBy(name="local_minutes")
	private WebElement freeLocalMin;
	
	@FindBy(name="inter_minutes")
	private WebElement freeInterMin;
	
	@FindBy(name="sms_pack")
	private WebElement freeSMSPack;
	
	@FindBy(name="minutes_charges")
	private WebElement localMinCharges;
	
	@FindBy(name="inter_charges")
	private WebElement interMinCharges;
	
	@FindBy(name="sms_charges")
	private WebElement smsCharges;
	
	@FindBy(name="submit")
	private WebElement Clksubmit;
	
	@FindBy(xpath="//section[@id=\"main\"]//h2")
	private WebElement sucessmsg;

	public WebElement getSucessmsg() {
		return sucessmsg;
	}

	public WebElement getClksubmit() {
		return Clksubmit;
	}

	public WebElement getMonth_Rental() {
		return month_Rental;
	}

	public WebElement getFreeLocalMin() {
		return freeLocalMin;
	}

	public WebElement getFreeInterMin() {
		return freeInterMin;
	}

	public WebElement getFreeSMSPack() {
		return freeSMSPack;
	}

	public WebElement getLocalMinCharges() {
		return localMinCharges;
	}

	public WebElement getInterMinCharges() {
		return interMinCharges;
	}

	public WebElement getSmsCharges() {
		return smsCharges;
	}
	
	
	
	
	
	
	
}

