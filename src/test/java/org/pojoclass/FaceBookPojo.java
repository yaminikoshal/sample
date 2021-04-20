package org.pojoclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPojo extends BaseClass{
	public FaceBookPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement toUser;
	
	@FindBy(id="pass")
	private WebElement toPsd;
	
	@FindBy(name="login")
	private WebElement toLoginfb;
	
	public WebElement getToUser() {
		return toUser;
		}
	
	public WebElement getToPsd() {
		return toPsd;
	}
	
	public WebElement getToLoginfb() {
		return toLoginfb;
	}
	
}