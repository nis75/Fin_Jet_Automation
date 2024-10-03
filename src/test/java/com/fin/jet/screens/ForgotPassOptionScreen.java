package com.fin.jet.screens;

import io.appium.java_client.PullsFiles;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ForgotPassOptionScreen extends BaseScreen {
    public ForgotPassOptionScreen(AndroidDriver driver) {
        super(driver);
    }
    public boolean hasUserID(){
        return getWebElements(By.xpath("//android.widget.TextView[@text=\"User ID\"]")).size()>0;
    }

    public ForgotPassOptionScreen fillUserID(String username){
        getWebElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")).sendKeys(String.valueOf(username));
        return this;
    }
    public ForgotPassOptionScreen fillAccountNumber(String accountNumber){
        getWebElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")).sendKeys(String.valueOf(accountNumber));
        return this;
    }
    public ForgotPassOptionScreen fillMobileNumber(String mobileNumber){
        getWebElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]")).sendKeys(String.valueOf(mobileNumber));
        return this;

    }
    public LoginScreen tapNextBtn(){

        getWebElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")).click();
        return getInstance(LoginScreen.class);
    }

}
