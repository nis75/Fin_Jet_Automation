package com.fin.jet.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WelcomeScreen extends BaseScreen{
    public WelcomeScreen(AndroidDriver driver) {
        super(driver);
    }

    public SinUpScreen tapGetStartBtn(){
        getWebElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]")).click();
        getWebElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]")).click();
        getWebElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]")).click();
        return getInstance(SinUpScreen.class);
    }

//    public SinUpScreen tapGetStartBtn() {
//        By xpath = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]");
//        for (int i = 0; i < 3; i++) {
//            getWebElement(xpath).click();
//        }
//        return getInstance(SinUpScreen.class);
//    }


}
