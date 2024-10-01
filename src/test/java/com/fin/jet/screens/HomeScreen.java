package com.fin.jet.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomeScreen extends BaseScreen{
    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }
//    public String getAppName(){
//        return getWebElement(By.xpath("android.widget.ImageView[@content-desc=\"login image\"]")).getText().trim();
//    }
    public void tapForgotUserIdBtn(){
        getWebElement(By.xpath("android.widget.TextView[@text=\"Forgot User ID\"]")).click();
    }
    public void tapForgotPasswordBtn(){
        getWebElement(By.xpath("android.widget.TextView[@text=\"Forgot Password\"]")).click();
    }
    public WelcomeScreen tapSinUpLink(){
        getWebElement(By.xpath("//android.widget.TextView[@text=\"Sign Up\"]")).click();
        return getInstance(WelcomeScreen.class);
    }
//
//    public WelcomeScreen tapSinUpBtn(){
//        getWebElement(By.xpath("//android.widget.TextView[@text=\"Sign Up\"]")).click();
//        return getInstance(WelcomeScreen.class);
//    }


//    public TransferFundPage clickTransferFundLink(){
//
//        waitForElement(By.cssSelector("a[href='transfer.html']"));
//        getWebElement(By.cssSelector("a[href='transfer.html']")).click();
//        return getInstance(TransferFundPage.class);
//    }
    //public WelcomeScreen tapSinupLink


}
