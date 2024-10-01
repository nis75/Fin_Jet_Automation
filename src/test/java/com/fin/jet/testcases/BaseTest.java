package com.fin.jet.testcases;

import com.fin.jet.screens.BaseScreen;
import com.fin.jet.screens.Screen;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    AndroidDriver driver;
    Screen screen;
    @BeforeClass
    public void launchApp(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        try {
            capabilities.setCapability("appium:udid", "R58NA54D9TK");
            capabilities.setCapability("appium:platformVersion", "13");
            capabilities.setCapability("appium:appPackage", "com.fintech.fintech");
            capabilities.setCapability("appium:appActivity", "com.fintech.fintech.login.LoginActivity");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appium:automationName", "UiAutomator2");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            screen = new BaseScreen(driver);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    @AfterClass
    public void tearDown(){
        //driver.quit();

    }

}
