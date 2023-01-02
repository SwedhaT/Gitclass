package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(className="login_title")
	private WebElement txtSelectHotelMSg;
	
	@FindBy(id="radiobutton_0")
	private WebElement btnSelectHotel;
	@FindBy ( id = "continue")
	private WebElement btnContinue;
	public WebElement getTxtSelectHotelMSg() {
		return txtSelectHotelMSg;
	}
	public WebElement getBtnSelectHotel() {
		return btnSelectHotel;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public void selectHotels() {
		elementClick(btnSelectHotel);
		elementClick(btnContinue);

	}
	
}
