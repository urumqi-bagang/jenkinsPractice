package com.dec14.stepDefinitions;



import com.dec14.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp() {
        System.out.println("Test started!!!");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void beforeEachTest() {
        System.out.println("Test end!!!");
        Driver.closeDriver();
    }
}
