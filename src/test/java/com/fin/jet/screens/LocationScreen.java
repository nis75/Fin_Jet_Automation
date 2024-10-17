package com.fin.jet.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LocationScreen extends BaseScreen {
    public LocationScreen(AndroidDriver driver) {
        super(driver);
    }


    public BranchScreen tapBranchBtn(){
        waitForElement(By.xpath(
                "//androidx.compose.ui.platform.ComposeView/android.view.View[1]"));
        getWebElement(By.xpath(
                "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]")).click();
        return getInstance(BranchScreen.class);
    }

    public SubBranchScreen  tapSubBranchBtn(){
        waitForElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
        getWebElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]")).click();
        return getInstance(SubBranchScreen.class);
    }






}
