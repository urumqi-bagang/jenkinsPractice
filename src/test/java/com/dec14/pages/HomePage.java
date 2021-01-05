package com.dec14.pages;

import com.dec14.utils.BrowserUtils;
import com.dec14.utils.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//li[@id='user-menu']//a[@class='dropdown-toggle']")
    private WebElement userFullName;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    private WebElement subModuleTitle;




    public String getUserFullName() {
        BrowserUtils.waitTillClickable(userFullName);
        return userFullName.getText();
    }

    public void clickOnModuleName(String moduleName) {
        String xpathOfModule  = "//span[@class='title title-level-1' and contains(text(),'"+moduleName+"')]";
        WebElement moduleWebElement = Driver.getDriver().findElement(By.xpath(xpathOfModule));
        BrowserUtils.waitTillClickable(moduleWebElement);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(moduleWebElement);

    }

    public void clickOnSubmoduleName(String subModuleName) {
        String xpathOfModule  = "//span[@class='title title-level-1' and contains(text(),'"+subModuleName+"')]";
        WebElement subModuleWebElement = Driver.getDriver().findElement(By.xpath(xpathOfModule));
        BrowserUtils.waitTillClickable(subModuleWebElement);
        subModuleWebElement.click();

    }


    public String getSubmodulePageTitle() {

        BrowserUtils.waitTillVisible(subModuleTitle);
        return subModuleTitle.getText();




    }



}
