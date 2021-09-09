package com.Synergy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Synergy.Genericlib.BaseTest;

public class CampaignEditBtn {
	@FindBy(xpath=("(//a[text()='Del'])[1]/preceding-sibling::a[text()='Edit']"))private WebElement campaignEditBtn;
	public CampaignEditBtn() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void campaignedit() {
		campaignEditBtn.click();
	}
	

}
