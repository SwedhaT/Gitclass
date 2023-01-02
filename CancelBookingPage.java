package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CancelBookingPage extends BaseClass{
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_id_text")
	private WebElement txtOrderId;
	@FindBy(id="search_hotel_id")
	private WebElement btnGo;
	@FindBy(name="check_all")
	private WebElement chkBtn;
	@FindBy(name="cancelall")
	private WebElement BtnCancel;
	public WebElement getTxtOrderId() {
		return txtOrderId;
	}
	public WebElement getBtnGo() {
		return btnGo;
	}
	public WebElement getChkBtn() {
		return chkBtn;
	}
	public WebElement getBtnCancel() {
		return BtnCancel;
	}
	public void cancelbookingpage(String orderId) {
		elementSendKeys(getTxtOrderId(), orderId);
		elementClick(getBtnGo());
		elementClick(getChkBtn());
		elementClick(getBtnCancel());
		alertAccept();
	}
}
