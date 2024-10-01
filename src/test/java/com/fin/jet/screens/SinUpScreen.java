package com.fin.jet.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SinUpScreen extends BaseScreen{
    public SinUpScreen(AndroidDriver driver) {
        super(driver);
    }
    public SinUpScreen fillUserId(String userId){
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[1]")).sendKeys(userId);
        return this;
    }
    public SinUpScreen fillAccountNo(String accountNo){
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[2]")).sendKeys(accountNo);
        return this;
    }
    public SinUpScreen fillAccountName(String accountName){
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[3]")).sendKeys(accountName);
        return this;
    }
    public SinUpScreen fillMobileNo(String mobileNo){
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[4]")).sendKeys(mobileNo);
        return this;
    }
    public SinUpScreen fillDateOfBirth(Date dateOfBirth){
        // Define the date format (adjust the pattern as needed)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // Convert the Date to a String
        String formattedDate = sdf.format(dateOfBirth);
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.view.View[1]")).sendKeys(formattedDate);
        return this;
    }
    public SinUpScreen fillNidNo(String nidNo){
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[5]")).sendKeys(nidNo);
        return this;
    }
    public SinUpScreen clickAgreeBtn() {
        getWebElement(By.xpath("//android.widget.CheckBox")).click();
        return getInstance(SinUpScreen.class);
    }






}
