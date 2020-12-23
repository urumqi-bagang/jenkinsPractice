package com.dec14.pages;

import com.dec14.utils.BrowserUtils;
import com.dec14.utils.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//li[@id='user-menu']//a[@class='dropdown-toggle']")
    private WebElement userFullName;




    public String getUserFullName() {
        BrowserUtils.waitTillClickable(userFullName);
        return userFullName.getText();
    }



}
