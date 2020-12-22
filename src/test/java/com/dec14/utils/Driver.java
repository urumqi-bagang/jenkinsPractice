package com.dec14.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class Driver {

    private Driver() {
    }

    private static WebDriver driver;


    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "remote-firefox":
                    try {
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("firefox");
                        desiredCapabilities.setPlatform(Platform.MAC);
                        URL url = new URL("http://192.168.29.198:4444/wd/hub");
                        driver = new RemoteWebDriver(url, desiredCapabilities);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "remote-chrome":
                    try {
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("chrome");
                        desiredCapabilities.setPlatform(Platform.MAC);
                        URL url = new URL("http://192.168.29.198:4444/wd/hub");
                        driver = new RemoteWebDriver(url, desiredCapabilities);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "remote-safari":
                    try {
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("safari");
                        desiredCapabilities.setPlatform(Platform.MAC);
                        URL url = new URL("http://192.168.29.198:4444/wd/hub");
                        driver = new RemoteWebDriver(url, desiredCapabilities);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                default:
                    System.out.println("Driver not found!!!");
            }
        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}
