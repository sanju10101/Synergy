package com.Synergy.Tests;

import org.testng.annotations.Test;

import com.Synergy.Genericlib.BaseTest;
import com.Synergy.Genericlib.FileLib;
import com.Synergy.Genericlib.WebDriverCommonLib;
import com.Synergy.pages.DropdownCampaign;
import com.Synergy.pages.HomePage;
import com.Synergy.pages.LoginPage;
import com.Synergy.pages.CampaignEditBtn;
import com.Synergy.pages.TypeBtn;

public class typeBtnTest extends BaseTest {
	@Test
   public void TypeBtn() throws Throwable {
	//public static void main(String[] args) throws Throwable  {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		FileLib flib = new FileLib();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		LoginPage lp = new LoginPage();
		lp.logintoApp(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
		 wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "homeTitle"), "home page");
		 HomePage hp = new HomePage();
		 hp.Campaignstab();
		 DropdownCampaign ddc = new DropdownCampaign();
	wlib.selectOption("All Campaigns", ddc.getDropdownCampaign());
	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "customViewTitle"), "customviewtitle");
	CampaignEditBtn ceb= new CampaignEditBtn();
	ceb.campaignedit();
	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "editpage"), "editpages");
	TypeBtn tpb = new TypeBtn();
	wlib.selectOption("Webinar", tpb.getTypeBtn());
	}

}
