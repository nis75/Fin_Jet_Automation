package com.fin.jet.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SubBranchScreen extends BaseScreen{
    public SubBranchScreen(AndroidDriver driver) {
        super(driver);
    }

    public  LocationScreen tabBackbtn(){
        waitForElement(By.xpath("//android.widget.Button"));
        getWebElement(By.xpath("//android.widget.Button")).click();
        return getInstance(LocationScreen.class)  ;}
}
