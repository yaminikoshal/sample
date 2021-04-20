package org.testng;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.pojoclass.HotelLoginPojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hotel extends BaseClass{
	
	@BeforeClass
	private void launchBrowser() {
		fireFoxBrowser();
		urlLaunch("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();

	}
	
	@Test(priority=-1)
	private void login() {
		HotelLoginPojo hp=new HotelLoginPojo();
		fillText(hp.getToUser(),"yaminiRaveendran");
		fillText(hp.getToPsd(), "Aa!@#123");
		btnClick(hp.getToLogin());
	}
	
	@Test(priority=0)
	private void search() throws IOException {
		HotelLoginPojo hp=new HotelLoginPojo();
		toSelectByVisibleText(hp.getToLocation(), "Melbourne");
		toSelectByVisibleText(hp.getToHotels(), "Hotel Hervey");
		toSelectByVisibleText(hp.getToRoomType(), "Deluxe");
		toSelectByVisibleText(hp.getToRoomNo(), "3 - Three");
		
		toClear(hp.getToDateIn());
		String datein = toIteration("H1", 1, 0);
		fillText(hp.getToDateIn(), datein);
		
		toClear(hp.getToDateOut());
		String dateout = toIteration("H1", 1, 1);
		fillText(hp.getToDateOut(), dateout);
		
		toSelectByVisibleText(hp.getToAdultRoom(),"2 - Two");
		toSelectByVisibleText(hp.getToChild(),"1 - One");
		
		btnClick(hp.getToSearch());
		
	}
	
	@Test(priority=1)
	private void select() {
		HotelLoginPojo hp=new HotelLoginPojo();
		btnClick(hp.getToSelect());
		btnClick(hp.getToContinue());
	}
	
	@Test(priority=2)
	private void search1() {
		HotelLoginPojo hp=new HotelLoginPojo();
//		toTable();
		fillText(hp.getToFirstName(), "yamini");
		fillText(hp.getToLastName(), "R Karthikeyan");
		fillText(hp.getToAddress(), "TamilNadu");
		fillText(hp.getToCcNo(), "1234567891234567");
		toSelectByVisibleText(hp.getToCcType(), "VISA");
		toSelectByVisibleText(hp.getToExpMonth(), "December");
		toSelectByVisibleText(hp.getToExpYear(), "2022");
		fillText(hp.getToCvv(), "123");
		btnClick(hp.getToBookNow());
	}
	
	
	
	
	
	
	
}
