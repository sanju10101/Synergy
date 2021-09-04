package com.Synergy.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Synergy.Genericlib.BaseTest;

public class FindCampaign {
@FindBy(xpath="//input[@name='searchString']")private WebElement SearchCampaign;
//@FindBy(xpath="(//input[@value='Go'])[2]")private WebElement Gobtn;
public FindCampaign() {
	PageFactory.initElements(BaseTest.driver, this);
}
public void TextFindCampaign(String search) {
	SearchCampaign.sendKeys(search);
	SearchCampaign.sendKeys(Keys.ENTER);
}
}
