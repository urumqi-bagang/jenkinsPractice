package com.dec14.stepDefinitions;


import com.dec14.utils.Driver;
import org.junit.After;

import org.junit.Before;


import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void beforeEachTest() {
        Driver.getDriver().quit();
    }
}
