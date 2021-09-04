package com.Synergy.Tests;

import org.testng.annotations.Test;

import com.Synergy.Genericlib.BaseTest;
import com.Synergy.Genericlib.FileLib;
import com.Synergy.Genericlib.WebDriverCommonLib;
import com.Synergy.pages.Createcampaignpage;
import com.Synergy.pages.HomePage;
import com.Synergy.pages.LoginPage;
import com.Synergy.pages.SaveCampaignDetails;

public class CreateCampaignTest extends BaseTest {
	@Test
public void CreateCampaign() throws Throwable {
	BaseTest bt = new BaseTest();
	bt.openBrowser();
	LoginPage lp = new LoginPage();
	FileLib flib = new FileLib();
	WebDriverCommonLib wlib = new WebDriverCommonLib();
	
	 wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "loginTitle"), "login page");
	lp.logintoApp(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
	 wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "homeTitle"), "home page");
	 HomePage hp = new HomePage();
	 hp.Campaignstab();
	 wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "customViewTitle"), "custom view page");
	 Createcampaignpage cmp = new Createcampaignpage();
	 cmp.clickCampaignsTab();
	 wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "createCampaignTitle"), "campaign view page");
	 SaveCampaignDetails scd = new SaveCampaignDetails();
	 scd.FillCampaignDetails(flib.readExcelData(EXCEL_PATH, "Campaigns", 0, 1));
   	wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "campaignsDetailsTitle"),"save details");
   	
	 
    }
	
	
}

