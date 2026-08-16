/**
 * 
 */
package com.orangehrm.pages;

import java.util.Hashtable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import com.framework.ui.pageobjects.BasePage;
import com.internal.regression.pages.MyTimePage;
import com.internal.regression.pages.PageConstants;

/**
 * @author Dharmendra
 *
 */
public class OrangeHRMHomePage extends BasePage{
	
	public OrangeHRMHomePage getHomePage() {

		return (OrangeHRMHomePage) openPage(OrangeHRMHomePage.class);
	}

	@Override
	public ExpectedCondition getPageLoadCondition() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;
	
	
	public void loginToOrangeHRM()
	{
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		submitButton.click();
	}

	public void loginToOrangeHRM(Hashtable<String, String> data)
	{
		
		userName.sendKeys(data.get("username"));
		password.sendKeys(data.get("password"));
		submitButton.click();
	}
}
