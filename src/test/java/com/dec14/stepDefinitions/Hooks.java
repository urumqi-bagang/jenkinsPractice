package com.dec14.stepDefinitions;


import com.dec14.utils.Driver;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @BeforeClass
    public void setUp() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void beforeEachTest() {
        Driver.getDriver().quit();
    }
}
