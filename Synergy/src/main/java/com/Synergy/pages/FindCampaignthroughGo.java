package com.Synergy.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Synergy.Genericlib.BaseTest;

public class FindCampaignthroughGo {
	
	@FindBy(xpath="//input[@name='Go']")private WebElement Gobtn;
	public FindCampaignthroughGo() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void TextFindCampaign(String search) {
		Gobtn.click();
		}
}
