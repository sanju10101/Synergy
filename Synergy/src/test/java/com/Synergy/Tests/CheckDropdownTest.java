package com.Synergy.Tests;

import org.testng.annotations.Test;

import com.Synergy.Genericlib.BaseTest;
import com.Synergy.Genericlib.FileLib;
import com.Synergy.Genericlib.WebDriverCommonLib;
import com.Synergy.pages.DropdownCampaign;
import com.Synergy.pages.HomePage;
import com.Synergy.pages.LoginPage;

public class CheckDropdownTest extends BaseTest {
	@Test

	public  void CheckDropdown() throws Throwable {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		FileLib flib = new FileLib();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		LoginPage lp = new LoginPage();
		 wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "loginTitle"), "login page");
			lp.logintoApp(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
			 wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "homeTitle"), "home page");
			 HomePage hp = new HomePage();
			 hp.Campaignstab();
			 DropdownCampaign ddc = new DropdownCampaign();
		wlib.selectOption("MyView", ddc.getDropdownCampaign());	

	}

}
