package com.Synergy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Synergy.Genericlib.BaseTest;

public class SaveCampaignDetails {
	@FindBy(xpath="//input[@name='property(Campaign Name)']")private WebElement CampaignName;
	@FindBy(xpath="(//input[@value='Save'])[1]")private WebElement savebtn;
	public SaveCampaignDetails() {
		PageFactory.initElements(BaseTest.driver, this);
		}
	public void FillCampaignDetails(String Cname) {
		CampaignName.sendKeys(Cname);
		savebtn.click();
	}
	

}
