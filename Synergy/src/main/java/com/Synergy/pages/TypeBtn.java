package com.Synergy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Synergy.Genericlib.BaseTest;

public class TypeBtn {
@FindBy(xpath="//select[@name='property(Type)']") private WebElement typeBtn;
public TypeBtn() {
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getTypeBtn() {
	return typeBtn;
}
public void setTypeBtn(WebElement typeBtn) {
	this.typeBtn = typeBtn;
}
public void typebtn() {
	typeBtn.click();
	
}
}
