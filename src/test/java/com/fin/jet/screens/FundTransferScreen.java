package com.fin.jet.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FundTransferScreen extends BaseScreen{
    public FundTransferScreen(AndroidDriver driver) {
        super(driver);
    }

//    public FundTransferScreen tapTransferBtn(){
//        By transferBtn = By.xpath("//android.view.View[@content-desc=\"Transfer\"]");
//        waitForElement(transferBtn);
//        getWebElement(transferBtn).click();
//        return getInstance(FundTransferScreen.class);
//    }

   public FundTransferScreen tapOwnBankBtn()
   {
       By ownBankBtn =  By.xpath("(//android.view.View[@content-desc=\"Own\"])[1]");
       waitForElement(ownBankBtn);
       getWebElement(ownBankBtn).click();
       return this;
   }
   public FundTransferMfsBkashScreen tapMfsBtn()
    {
        By MfsBtn =  By.xpath("(//android.view.View[@content-desc=\"Own\"])[3]");
        waitForElement(MfsBtn);
        getWebElement(MfsBtn).click();
        return getInstance(FundTransferMfsBkashScreen.class);
    }
   public FundTransferScreen tapAddBeneficiaryBtn()
    {
        By addBeneficiaryBtn =  By.xpath("//android.widget.TextView[@text=\"Beneficiary\"]");
        waitForElement(addBeneficiaryBtn);
        getWebElement(addBeneficiaryBtn).click();
        return this;
    }
    public FundTransferScreen tapBeneficiaryOwnBtn()
    {
        getWebElement(By.xpath("//android.widget.TextView[@text=\"Own\"]")).click();
        return this;
    }

    public FundTransferScreen tapBeneficiaryOtherBtn()
    {
        getWebElement(By.xpath("//android.widget.TextView[@text=\"Other\"]")).click();
        return this;
    }

    public FundTransferScreen tapBeneficiaryMfsBtn()
    {
        getWebElement(By.xpath("//android.widget.TextView[@text=\"Mfs\"]")).click();
        return this;
    }
    public FundTransferScreen tapBeneficiaryBackBtn()
    {
        getWebElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.widget.Button")).click();
        return this;
    }

    public FundTransferScreen tapOwnAccountFundTransBtn(){
        By ownAccountFundTransBtn =  By.xpath("(//android.widget.TextView[@text=\"Own Account\"])[2]");
        waitForElement(ownAccountFundTransBtn);
        getWebElement(ownAccountFundTransBtn).click();
        return this;
    }
    public FundTransferScreen tapOtherAccountFundTransBtn(){
        By otherAccountFundTransBtn =  By.xpath("(//android.widget.TextView[@text=\"Own Account\"])[2]");
        waitForElement(otherAccountFundTransBtn);
        getWebElement(otherAccountFundTransBtn).click();
        return this;
    }
//    public OpenNewAccountPage selectAccountTNumber(int index){
//        new Select(getWebElement(By.id("fromAccountId"))).selectByIndex(index);
//        return this;
//
//    }
//    public FundTransferScreen selectSourceAccount(int index){
//        // Click on the account selection TextView to open the account list
//        getWebElement(By.xpath("//android.widget.TextView[@text='Select your Account']")).click();
//        // Find the list of account options (assuming they are in a ListView or similar)
//        List<WebElement> accountOptions = driver.findElements(By.xpath("//android.widget.ListView/android.widget.TextView"));
//
//
//        if (index >= 0 && index < accountOptions.size()) {
//            accountOptions.get(index).click();
//        } else {
//            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for account options.");
//        }
//        //new Select(getWebElement(By.xpath("//android.widget.TextView[@text=\"Select your Account\"]"))).selectByIndex(index);
//        return this;
//    }
    public FundTransferScreen tapSourceAccountBtn(){
        By sourceAccountBtn = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]");
        waitForElement(sourceAccountBtn);
        getWebElement(sourceAccountBtn).click();
        return this;
    }

    public FundTransferScreen selectSourceAccount(){
        By sourceAccountList =By.xpath("//android.widget.EditText");
        waitForElement(sourceAccountList);
        getWebElement(sourceAccountList).sendKeys("Michael Johnson");
        getWebElement(By.xpath("//android.widget.TextView[@text=\"A/C 5678****1234\"]")).click();
        return getInstance(FundTransferScreen.class);

    }
    public FundTransferScreen tapDestinationAccountBtn(){
        By destinationAccountBtn = By.xpath("");
        waitForElement(destinationAccountBtn);
        getWebElement(destinationAccountBtn).click();
        return this;
    }

    public FundTransferScreen selectDestinationAccount(){
        By destinationAccountList =By.xpath(" ");
        waitForElement(destinationAccountList);
        getWebElement(destinationAccountList).sendKeys(" ");
        getWebElement(By.xpath("")).click();
        return getInstance(FundTransferScreen.class);

    }
    public FundTransferScreen enterTransAmount(int amount){
        By transAmount = By.xpath("//android.widget.TextView[@text=\"Transaction Amount\"]");
        waitForElement(transAmount);
        getWebElement(transAmount).sendKeys(String.valueOf(amount));
        return this;
    }
    public FundTransferScreen enterMobileNo(String mobile){
        getWebElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[6]/android.widget.EditText")).sendKeys(String.valueOf(mobile));
        return this;
    }

    public FundTransferScreen enterNarration(String narration){
        getWebElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[7]/android.widget.EditText")).sendKeys(String.valueOf(narration));
        return this;
    }

    public FundTransferScreen tapFundTransferOwnNextBtn(){
        getWebElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[8]/android.widget.Button")).click();
        return this;
    }

}
