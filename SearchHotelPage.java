package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass{
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="location")
private WebElement dDnLocation;
@FindBy(id="username_show")
private static WebElement textWelcomeMsg;
@FindBy(id="hotels")
private WebElement dDnHotels;
@FindBy(id="room_type")
private WebElement dDNRoomType;//dDn- represents dropdown

@FindBy(id="room_nos")
private WebElement dDNRoomNo;

@FindBy(id="datepick_in")
private WebElement txtCheckInDate;

@FindBy(id="datepick_out")
private WebElement txtCheckOutDate;

@FindBy(id="adult_room")
private WebElement dDNAdultRoom;

@FindBy(id="child_room")
private WebElement dDNChildRoom;

@FindBy(id="Submit")
private WebElement btnSubmit;


public WebElement getdDnLocation() {
	return dDnLocation;
}

public WebElement getTextWelcomeMsg() {
	return textWelcomeMsg;
}

public WebElement getdDnHotels() {
	return dDnHotels;
}

public WebElement getdDNRoomType() {
	return dDNRoomType;
}

public WebElement getdDNRoomNo() {
	return dDNRoomNo;
}

public WebElement getTxtCheckInDate() {
	return txtCheckInDate;
}

public WebElement getTxtCheckOutDate() {
	return txtCheckOutDate;
}

public WebElement getdDNAdultRoom() {
	return dDNAdultRoom;
}

public WebElement getdDNChildRoom() {
	return dDNChildRoom;
}
public WebElement getBtnSubmit() {
	return btnSubmit;
}
public void searchHotels(String location, String hotels, String roomType, String noOfRooms, String checkInDate,String checkOutDate,String adultPerRoom, String childrenPerRoom) {
	selectOptionByText(getdDnLocation(), location);
	selectOptionByText(getdDnHotels(), hotels);
	selectOptionByText(getdDNRoomType(), roomType);
	elementSendKeys(getTxtCheckInDate(), checkInDate);
	elementSendKeys(getTxtCheckOutDate(), checkOutDate);
	selectOptionByText(getdDNAdultRoom(), adultPerRoom);
	selectOptionByText(getdDNChildRoom(), childrenPerRoom);
	elementClick(getBtnSubmit());

}
}
