package com.orangehrm.tests;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.framework.setup.TestSetUp;
import com.framework.testutils.Constants;
import com.framework.testutils.TestUtils;
import com.internal.regression.pages.MyTimePage;
import com.internal.regression.pages.TimeSheetLoginPage;
import com.orangehrm.pages.OrangeHRMHomePage;

	/**
	 * @author dharmendra.h
	 *
	 */
	public class LoginTest extends TestSetUp {

		@Test(dataProviderClass = TestUtils.class, dataProvider = "dpone")
		public void loginToHrm(Hashtable<String, String> data) throws InterruptedException {
			testCaseLogger.get().assignAuthor("Dharmendra");
			testCaseLogger.get().assignCategory(Constants.SMOKE_CATEGORY);
			if (!data.get("Runmode").equalsIgnoreCase("Y")) {
				appLogs.debug("RunMode is set to NO for testdata");
				throw new SkipException("RunMode is set to No for test data");
			}
			navigateToBaseURL(data);
			testCaseLogger.get().info("Navigate to url");
			OrangeHRMHomePage page = new OrangeHRMHomePage().getHomePage();
			page.loginToOrangeHRM();
			
		}

	
}
