package com.fin.jet.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import static io.appium.java_client.android.nativekey.AndroidKey.F;

public class ForgotPasswordScreen extends BaseScreen {
    public ForgotPasswordScreen(AndroidDriver driver) {
        super(driver);
    }

private By userId=By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]");
    public boolean hasByMobileNumber(){
        waitForElement(By.xpath(
                "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]"));
        return getWebElements(By.xpath(
"//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]")).size()>0;
    }
    public  boolean hasByUserID(){
        //By userId=By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]");
        waitForElement(userId);
        return getWebElements(userId).size()>0;
    }

    public ForgotPassOptionScreen tapByUserId(){
        waitForElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
        getWebElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]")).click();
        return getInstance(ForgotPassOptionScreen.class);
    }

    public ForgotPassOptionScreen tapMobileNumber(){
        waitForElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]"));
        getWebElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]")).click();
        return getInstance(ForgotPassOptionScreen.class);
    }

}
