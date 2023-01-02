package com.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingConfirmationPage extends BaseClass{
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath =("//td[text()='Booking Confirmation ']"))
	private WebElement txtBookingConfirmationMSg;
	@FindBy(id="order_no")
	private WebElement txtgetorderId;
	@FindBy(xpath =("//a[@href='BookedItinerary.php']"))
	private WebElement bookedItinerary;
	
	
	
	public WebElement getTxtBookingConfirmationMSg() {
		return txtBookingConfirmationMSg;
	}



	public WebElement getTxtgetorderId() {
		return txtgetorderId;
	}



	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}



	public void Confirmation(String text) throws IOException {
		elementClick(bookedItinerary);
		String text = elementGetattribute(getTxtgetorderId());
				writeCellData("Datas", 1, 18, text);
	}
}
