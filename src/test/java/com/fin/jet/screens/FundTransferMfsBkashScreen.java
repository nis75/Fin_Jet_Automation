package com.fin.jet.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class FundTransferMfsBkashScreen extends BaseScreen {
    public FundTransferMfsBkashScreen(AndroidDriver driver) {
        super(driver);
    }

    public FundTransferMfsBkashScreen tapSourceAccountMfsBkashBtn(){
        By sourceAccountBtn = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]");
        waitForElement(sourceAccountBtn);
        getWebElement(sourceAccountBtn).click();
        return this;
    }
    public FundTransferMfsBkashScreen selectSourceAccountMfsBkashDdl(){
        By sourceAccountBtn = By.xpath("//android.widget.EditText");
        waitForElement(sourceAccountBtn);
        getWebElement(sourceAccountBtn).sendKeys("Michael Johnson");
        getWebElement(By.xpath("//android.widget.TextView[@text=\"A/C 5678****1234\"]")).click();
        //getWebElement(sourceAccountBtn).click();
        return this;
    }
    public FundTransferMfsBkashScreen tapDestinationAccountMfsBkashBtn(){
        By DestinationAccountBtn = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]");
        waitForElement(DestinationAccountBtn);
        getWebElement(DestinationAccountBtn).click();
        return this;
    }
    public FundTransferMfsBkashScreen selectDestinationAccountMfsBkashDdl(){
        By destinationAccountBtn = By.xpath("//android.widget.EditText");
        waitForElement(destinationAccountBtn);
        getWebElement(destinationAccountBtn).sendKeys("Jane Smith");
        getWebElement(By.xpath("//android.widget.TextView[@text=\"C/D 9876****5432\"]")).click();
        return this;
    }
    public FundTransferMfsBkashScreen enterTransAmountMfsBkash(String amount){
        By transAmount = By.xpath("//android.widget.TextView[@text=\"Transaction Amount\"]");
        waitForElement(transAmount);
        getWebElement(transAmount).sendKeys(String.valueOf(amount));
        return this;
    }
    public FundTransferMfsBkashScreen enterPhoneNoMfsBkash(String phoneNo){
        By phnNo = By.xpath("//android.widget.TextView[@text=\"Enter Your mobile Number\"]");
        waitForElement(phnNo);
        getWebElement(phnNo).sendKeys(phoneNo);
        return this;
    }
    public FundTransferMfsBkashScreen enterDescriptionMfsBkash(String description){
        By desc = By.xpath("//android.widget.TextView[@text=\"Describe scenario \"]");
        waitForElement(desc);
        getWebElement(desc).sendKeys(description);
        return this;
    }
    public FundTransferMfsBkashScreen tapFundTransferMfsBkashNextBtn(){
        getWebElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[8]/android.widget.Button")).click();
        return this;
    }
    public FundTransferMfsBkashScreen tapSMSMfsBkashBtn(){
        getWebElement(By.xpath("//android.widget.ScrollView/android.widget.Button[2]")).click();
        return this;
    }
    public FundTransferMfsBkashScreen enterOTPMfsBkash1(int otp1){
        By otp = By.xpath("//android.widget.ScrollView/android.widget.EditText[1]");
        waitForElement(otp);
        getWebElement(otp).sendKeys(String.valueOf(otp1));
        return this;
    }
    public FundTransferMfsBkashScreen enterOTPMfsBkash2(int otp2){
        By otp = By.xpath("//android.widget.ScrollView/android.widget.EditText[2]");
        waitForElement(otp);
        getWebElement(otp).sendKeys(String.valueOf(otp2));
        return this;
    }
    public FundTransferMfsBkashScreen enterOTPMfsBkash3(int otp3){
        By otp = By.xpath("//android.widget.ScrollView/android.widget.EditText[3]");
        waitForElement(otp);
        getWebElement(otp).sendKeys(String.valueOf(otp3));
        return this;
    }
    public FundTransferMfsBkashScreen enterOTPMfsBkash4(int otp4){
        By otp = By.xpath("//android.widget.ScrollView/android.widget.EditText[4]");
        waitForElement(otp);
        getWebElement(otp).sendKeys(String.valueOf(otp4));
        return this;
    }
    public FundTransferMfsBkashScreen enterOTPMfsBkash5(int otp5){
        By otp = By.xpath("//android.widget.ScrollView/android.widget.EditText[5]");
        waitForElement(otp);
        getWebElement(otp).sendKeys(String.valueOf(otp5));
        return this;
    }
    public FundTransferMfsBkashScreen enterOTPMfsBkash6(int otp6){
        By otp = By.xpath("//android.widget.ScrollView/android.widget.EditText[6]");
        waitForElement(otp);
        getWebElement(otp).sendKeys(String.valueOf(otp6));
        return this;
    }
    public FundTransferMfsBkashScreen tapSubmitMfsBkashBtn(){
        getWebElement(By.xpath("//android.widget.TextView[@text=\"Submit\"]")).click();
        return this;
    }
    public boolean hasFundTransferSuccessfullyDoneMsg(){
        return getWebElements(By.xpath("//android.widget.TextView[@text=\"Your Fund Transfer is Successfully Done.\"]")).size() > 0;
    }


}
