package com.Synergy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Synergy.Genericlib.BaseTest;

public class DropdownCampaign {
@FindBy(xpath="//select[@name='cvid']")private WebElement dropdownCampaign;
public DropdownCampaign() {
	PageFactory.initElements(BaseTest.driver, this);
}
public WebElement getDropdownCampaign() {
	return dropdownCampaign;
}
public void setDropdownCampaign(WebElement dropdownCampaign) {
	this.dropdownCampaign = dropdownCampaign;
}

}

