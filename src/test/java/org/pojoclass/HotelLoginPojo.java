package org.pojoclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelLoginPojo extends BaseClass{
	
	public HotelLoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement toUser;
	
	@FindBy(id="password")
	private WebElement toPsd;
	
	@FindBy(id="login")
	private WebElement toLogin;
	
	@FindBy(id="location")
	private WebElement toLocation;
	
	@FindBy(id="hotels")
	private WebElement toHotels;
	
	@FindBy(id="room_type")
	private WebElement toRoomType;
	
	@FindBy(id="room_nos")
	private WebElement toRoomNo;
	
	@FindBy(id="datepick_in")
	private WebElement toDateIn;
	
	@FindBy(id="datepick_out")
	private WebElement toDateOut;
	
	@FindBy(id="adult_room")
	private WebElement toAdultRoom;
	
	@FindBy(id="child_room")
	private WebElement toChild;
	
	@FindBy(id="Submit")
	private WebElement toSearch;
	
	@FindBy(id="radiobutton_0")
	private WebElement toSelect;
	
	@FindBy(id="continue")
	private WebElement toContinue;

	@FindBy(id="first_name")
	private WebElement toFirstName;
	
	@FindBy(id="last_name")
	private WebElement toLastName;
	
	@FindBy(id="address")
	private WebElement toAddress;
	
	@FindBy(id="cc_num")
	private WebElement toCcNo;
	
	@FindBy(id="cc_type")
	private WebElement toCcType;
	
	@FindBy(id="cc_exp_month")
	private WebElement toExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement toExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement toCvv;
	
	@FindBy(id="book_now")
	private WebElement toBookNow;
	
	public WebElement getToLastName() {
		return toLastName;
	}

	public WebElement getToFirstName() {
		return toFirstName;
	}

	public WebElement getToAddress() {
		return toAddress;
	}

	public WebElement getToCcNo() {
		return toCcNo;
	}

	public WebElement getToCcType() {
		return toCcType;
	}

	public WebElement getToExpMonth() {
		return toExpMonth;
	}

	public WebElement getToExpYear() {
		return toExpYear;
	}

	public WebElement getToCvv() {
		return toCvv;
	}

	public WebElement getToBookNow() {
		return toBookNow;
	}

	public WebElement getToUser() {
		return toUser;
	}

	public WebElement getToPsd() {
		return toPsd;
	}

	public WebElement getToLogin() {
		return toLogin;
	}

	public WebElement getToLocation() {
		return toLocation;
	}

	public WebElement getToHotels() {
		return toHotels;
	}

	public WebElement getToRoomType() {
		return toRoomType;
	}

	public WebElement getToRoomNo() {
		return toRoomNo;
	}

	public WebElement getToDateIn() {
		return toDateIn;
	}

	public WebElement getToDateOut() {
		return toDateOut;
	}

	public WebElement getToAdultRoom() {
		return toAdultRoom;
	}

	public WebElement getToChild() {
		return toChild;
	}

	public WebElement getToSearch() {
		return toSearch;
	}

	public WebElement getToSelect() {
		return toSelect;
	}

	public WebElement getToContinue() {
		return toContinue;
	}

	
	

}
