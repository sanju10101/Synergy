package com.Synergy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Synergy.Genericlib.BaseTest;

public class Createtask {
@FindBy(xpath="//input[@value='Create Task']")private WebElement createBtn;
public Createtask() {
	PageFactory.initElements(BaseTest.driver, this);
}
public void createbutton() {
	createBtn.click();
}
}
