package com.fin.jet.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class EmiCalculatorScreen extends BaseScreen {
    public EmiCalculatorScreen(AndroidDriver driver) {
        super(driver);
    }

    public EmiCalculatorScreen fillLoanAmount(int loanAmount) {
        By lnAmount = By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[1]");
        waitForElement(lnAmount);
        getWebElement(lnAmount).sendKeys(String.valueOf(loanAmount));
        return this;
    }

    public EmiCalculatorScreen fillIntRate(double rate) {
        getWebElement(By.xpath("//android.widget.SeekBar[@text=\"0.0\"]")).sendKeys(String.valueOf(rate));
        return this;
    }

    public EmiCalculatorScreen fillDuration(int duration) {
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[2]")).sendKeys(String.valueOf(duration));
        return this;
    }

    public EmiCalculatorScreen tapSubmitBtn() {
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.view.View[1]/android.widget.Button")).click();
        return this;
    }

    public EmiCalculatorScreen tapFixedDepositBtn() {
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[1]/android.view.View[2]/android.view.View")).click();
        return this;
    }

    public EmiCalculatorScreen fillPrincipleAmount(int principleAmount) {
        By pAmount = By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[1]");
        waitForElement(pAmount);
        getWebElement(pAmount).sendKeys(String.valueOf(principleAmount));
        return this;
    }

    public EmiCalculatorScreen fillFDIntRate(double fdIntRate) {
        getWebElement(By.xpath("//android.widget.SeekBar[@text=\"0.0\"]")).sendKeys(String.valueOf(fdIntRate));
        return this;
    }

    public EmiCalculatorScreen fillFDDuration(int duration) {
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[2]")).sendKeys(String.valueOf(duration));
        return this;
    }

//    public EmiCalculatorScreen selectFrequency(int index) {
//        By frequency = By.xpath("//android.widget.Spinner[@text=\"Select Investment Duration\"]");
//        waitForElement(frequency);
//        getWebElement(frequency).click();
//        new Select(getWebElement(frequency)).selectByIndex(index);
//         return this;
//
//
//    }
    public EmiCalculatorScreen selectFrequency(String frequency){
        //new Select(getWebElement(By.xpath("")).selectByIndex(index);
        new Select(getWebElement(By.xpath("//android.widget.Spinner[@text=\\\"Select Investment Duration\\\"]"))).selectByValue(frequency);
        return this;

    }

    public EmiCalculatorScreen tapSubmitFDBtn() {
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.view.View[2]/android.widget.Button")).click();
        return this;
    }


}
