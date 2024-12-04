package com.fin.jet.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MoreInfoScreen extends BaseScreen{
    public MoreInfoScreen(AndroidDriver driver) {
        super(driver);
    }
    public EmiCalculatorScreen tapEmiCalculatorBtn(){
        By emiCalculatorBtn = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[10]");
        waitForElement(emiCalculatorBtn);
        getWebElement(emiCalculatorBtn).click();
        return getInstance(EmiCalculatorScreen.class);
    }

}
