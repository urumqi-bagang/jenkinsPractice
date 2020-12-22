package com.dec14.cucumberRunner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderPractice {


    @Test(dataProvider = "usersTestData")
    public void testDataProvider(String key, String value) {
        System.out.println(key);
        System.out.println(value);

    }
    @DataProvider
    public Object[][] usersTestData() {
        return new Object[][]{
                {"hi","hi"},
                {"hello","hello"}
        };
    }
}
