package com.Synergy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Synergy.Genericlib.BaseTest;

public class HomePage {
@FindBy(xpath="//a[text()='Campaigns']")private WebElement Campaigntab;
public HomePage() {
	PageFactory.initElements(BaseTest.driver, this);
}
public void Campaignstab() {
	Campaigntab.click();
}
}
