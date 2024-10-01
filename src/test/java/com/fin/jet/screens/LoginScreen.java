package com.fin.jet.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginScreen extends BaseScreen{
    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }
    public LoginScreen fillUserID(String userName) {
        getWebElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[1]")).sendKeys(userName);
        return this;
    }
    public LoginScreen fillPassword(String password) {
        getWebElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[2]")).sendKeys(password);
        return this;
    }
    public MasterScreen tapLoginBtn() {
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[3]/android.widget.Button")).click();
       return getInstance(MasterScreen.class);
    }



    public LocationScreen tapLocationBtn(){
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[7]")).click();
        return getInstance(LocationScreen.class);
    }


}
