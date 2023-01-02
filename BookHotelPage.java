package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotelPage extends BaseClass{
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath =("//td[text()='Book A Hotel ']"))
	private WebElement txtBookHotelMSg;
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	@FindBy(id="last_name")
	private WebElement txtLastName;
	@FindBy(id="address")
	private WebElement txtAddress;
	@FindBy(id="cc_num")
	private WebElement txtCreditCardNumber;
	@FindBy(id="cc_type")
	private WebElement dDNCreditCardType;
	@FindBy(id="cc_exp_month")
	private WebElement dDNExpiryMonth;
	@FindBy(id="cc_exp_year" )
	private WebElement dDNExpiryYear;
	@FindBy(id="cc_cvv")
	private WebElement txtCVVNumber;
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	public WebElement getTxtBookHotelMSg() {
		return txtBookHotelMSg;
	}
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCreditCardNumber() {
		return txtCreditCardNumber;
	}
	public WebElement getdDNCreditCardType() {
		return dDNCreditCardType;
	}
	public WebElement getdDNExpiryMonth() {
		return dDNExpiryMonth;
	}
	public WebElement getdDNExpiryYear() {
		return dDNExpiryYear;
	}
	public WebElement getTxtCVVNumber() {
		return txtCVVNumber;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	public void bookHotels(String firstName, String lastName, String address, String creditCardno, String creditCardType, String month, String year, String cvv ) {
		elementSendKeys(getTxtFirstName(), firstName);
		elementSendKeys(getTxtLastName(), lastName);
		elementSendKeys(getTxtAddress(), address);
		elementSendKeys(getTxtCreditCardNumber(), creditCardno);
		selectOptionByText(dDNCreditCardType, creditCardType);
		selectOptionByText(dDNExpiryMonth, month);
		selectOptionByText(dDNExpiryYear, year);
		elementSendKeys(txtCVVNumber, cvv);
		elementClick(btnBookNow);
		
		

	}
}
