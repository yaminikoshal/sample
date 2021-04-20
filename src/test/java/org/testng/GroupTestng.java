package org.testng;

import org.baseclass.BaseClass;
import org.pojoclass.FaceBookPojo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupTestng extends BaseClass{
	
	@BeforeMethod
	public void launchBrowser() {
		fireFoxBrowser();
		urlLaunch("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test(groups="@sanity")
	public void tologin1() {
		FaceBookPojo lg =new FaceBookPojo();
		fillText(lg.getToUser(),"yamini");
		fillText(lg.getToPsd(), "koshal");
		btnClick(lg.getToLoginfb());
	}
	
	@Test(groups="@sanity")
	public void tologin2() {
		FaceBookPojo lg =new FaceBookPojo();
		fillText(lg.getToUser(),"yamini");
		fillText(lg.getToPsd(), "koshal");
		btnClick(lg.getToLoginfb());
	}
	@Test
	public void tologin3() {
		FaceBookPojo lg =new FaceBookPojo();
		fillText(lg.getToUser(),"yamini");
		fillText(lg.getToPsd(), "koshal");
		btnClick(lg.getToLoginfb());
	}
	@Test
	public void tologin4() {
		FaceBookPojo lg =new FaceBookPojo();
		fillText(lg.getToUser(),"yamini");
		fillText(lg.getToPsd(), "koshal");
		btnClick(lg.getToLoginfb());
	}
	
	@AfterMethod
	public void endBrowser() {
		driver.quit();
	}
}
