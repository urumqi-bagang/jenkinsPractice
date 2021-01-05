package com.dec14.stepDefinitions;

import com.dec14.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class homePageModuleTitleStepDefinition {


    HomePage homePage = new HomePage();

    @When("user clicks on {string} and {string} name")
    public void user_clicks_on_and_name(String moduleName, String submoduleName) {
        homePage.clickOnModuleName(moduleName);
        homePage.clickOnSubmoduleName(submoduleName);
    }

    @Then("user should see correct {string} on left top of the page")
    public void user_should_see_correct_on_left_top_of_the_page(String expectedTitle) {

        String actualTitle = homePage.getSubmodulePageTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }



}
