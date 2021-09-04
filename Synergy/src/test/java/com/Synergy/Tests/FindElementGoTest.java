package com.Synergy.Tests;
import org.testng.annotations.Test;

import com.Synergy.Genericlib.BaseTest;
import com.Synergy.Genericlib.FileLib;
import com.Synergy.Genericlib.WebDriverCommonLib;
//import com.Synergy.campaign.FindCampaign;
import com.Synergy.pages.FindCampaignthroughGo;
import com.Synergy.pages.HomePage;
import com.Synergy.pages.LoginPage;
import com.Synergy.pages.FindCampaign;

public class FindElementGoTest extends BaseTest {
@Test
	public void FindElement() throws Throwable {
		// TODO Auto-generated method stub
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		FileLib flib = new FileLib();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		com.Synergy.pages.LoginPage lp = new com.Synergy.pages.LoginPage();
		 wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "loginTitle"), "login page");
			lp.logintoApp(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
			 wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "homeTitle"), "home page");
			 com.Synergy.pages.HomePage hp = new com.Synergy.pages.HomePage();
			 hp.Campaignstab();
			 wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "customViewTitle"), "custom view page");
			 FindCampaign fctg= new FindCampaign();
			 fctg.TextFindCampaign(flib.readExcelData(EXCEL_PATH, "searchpage", 0, 2));
			 
	}

}
