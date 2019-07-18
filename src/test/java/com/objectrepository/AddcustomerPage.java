package com.objectrepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Base;

public class AddcustomerPage extends Base {
	public AddcustomerPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[text()='Done']")
	private WebElement clk_Done;

	@FindBy(id = "fname")
	private WebElement txt_fstName;

	@FindBy(id = ("lname"))
	private WebElement txt_lstname;

	@FindBy(id = "email")
	private WebElement txt_eMail;

	@FindBy(name = "addr")
	private WebElement txt_addr;

	@FindBy(id = "telephoneno")
	private WebElement txt_telePno;

	@FindBy(name = "submit")
	private WebElement clk_Submit;

	public WebElement getClk_Done() {
		return clk_Done;
	}

	public WebElement getTxt_fstName() {
		return txt_fstName;
	}

	public WebElement getTxt_lstname() {
		return txt_lstname;
	}

	public WebElement getTxt_eMail() {
		return txt_eMail;
	}

	public WebElement getTxt_addr() {
		return txt_addr;
	}

	public WebElement getTxt_telePno() {
		return txt_telePno;
	}

	public WebElement getClk_Submit() {
		return clk_Submit;
	}
}


