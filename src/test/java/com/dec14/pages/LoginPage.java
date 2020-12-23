package com.dec14.pages;

import com.dec14.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="prependedInput")
    public  WebElement userNameInputBox;

    @FindBy(id="prependedInput2")
    public  WebElement passworInputBox;










}
