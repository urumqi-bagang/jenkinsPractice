package com.dec14.stepDefinitions;

import com.dec14.pages.LoginPage;
import com.dec14.utils.ConfigurationReader;
import com.dec14.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();


    @Given("User is on login page")
    public void userIsOnLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        System.out.println("getting url");
    }

    @When("user provide different valid credential")
    public void userProvideDifferentValidCredential() {
       loginPage.userNameInputBox.sendKeys("dawud");
        System.out.println("In @When");


    }

    @Then("user should see be able to login to homepage")
    public void userShouldSeeBeAbleToLoginToHomepage() {

        loginPage.passworInputBox.sendKeys("password");
        System.out.println("In @Then tag");
    }

    @Test
    public void waitPractice() {
        System.out.println("in @Test from test ng");
    }





}
