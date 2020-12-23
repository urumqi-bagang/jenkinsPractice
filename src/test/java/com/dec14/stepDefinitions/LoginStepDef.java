package com.dec14.stepDefinitions;

import com.dec14.pages.HomePage;
import com.dec14.pages.LoginPage;
import com.dec14.utils.BrowserUtils;
import com.dec14.utils.ConfigurationReader;
import com.dec14.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;

import java.util.concurrent.BrokenBarrierException;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();



    @Given("User is on login page")
    public void userIsOnLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        System.out.println("getting url");
    }



    @When("user provide valid {string} and {string}")
    public void user_provide_valid_and(String string, String string2) {
        loginPage.userNameInputBox.sendKeys(string);
        loginPage.passworInputBox.sendKeys(string2, Keys.ENTER);
        System.out.println("In @When");
    }


    @Then("user should see the correct {string} appeared in homepage")
    public void user_should_see_the_correct_appeared_in_homepage(String string) {

        String actualResult = homePage.getUserFullName();
        String expectedResult = string;
        Assert.assertEquals("User full name not same as expected!!!",expectedResult,actualResult);
        System.out.println("In @Then tag");
    }

/*
    @Test
    public void test() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.userNameInputBox.sendKeys("user1");
        loginPage.passworInputBox.sendKeys("UserUser123", Keys.ENTER);

        System.out.println(homePage.getUserFullName());
    }*/



}
