package com.Synergy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Synergy.Genericlib.BaseTest;

public class Createcampaignpage {
@FindBy(xpath="//input[@value='New Campaign']")private WebElement Campaigntb;
public Createcampaignpage() {
	PageFactory.initElements(BaseTest.driver, this);
	}
public void clickCampaignsTab() {
	Campaigntb.click();
}

}
        