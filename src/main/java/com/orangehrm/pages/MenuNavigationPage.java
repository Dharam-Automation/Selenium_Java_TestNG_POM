/**
 * 
 */
package com.orangehrm.pages;

import java.util.Hashtable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import com.framework.ui.pageobjects.BasePage;


public class MenuNavigationPage extends BasePage{
	
	public MenuNavigationPage getMenuNavigationPage() {

		return (MenuNavigationPage) openPage(MenuNavigationPage.class);
	}

	@Override
	public ExpectedCondition getPageLoadCondition() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li/a[contains(@href,'/pim/viewPimModule')]")
	private WebElement performanceModule;
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li/a[contains(@href,'/time/viewTimeModule')]")
	private WebElement timeModule;


	public void navigateToModule(Hashtable<String, String> data)
	{
		if(data.get("Module").equalsIgnoreCase("Performance"))
		{
			performanceModule.click();
		}
		
		if(data.get("Module").equalsIgnoreCase("Time"))
		{
			timeModule.click();
		}

	}
}