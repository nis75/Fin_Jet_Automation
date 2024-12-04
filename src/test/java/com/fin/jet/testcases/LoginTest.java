package com.fin.jet.testcases;

import com.fin.jet.screens.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    MasterScreen masterScreen;
    FundTransferScreen fundTransferScreen;
    MoreInfoScreen moreInfoScreen;
    EmiCalculatorScreen emiCalculatorScreen;
    @Test(priority = 0)
    public void loginShouldSuccess() {
        masterScreen=screen.getInstance(LoginScreen.class)
                .fillUserID("test")
                .fillPassword("test")
                .tapLoginBtn();
        Assert.assertTrue(masterScreen.hasTransferBtn());

    }
    @Test(priority = 1)
    public void loginForFundTransferOwnBank() {
        fundTransferScreen=screen.getInstance(LoginScreen.class)
                .fillUserID("test")
                .fillPassword("test")
                .tapLoginBtn()
                .tapTransferBtn()
                .tapAddBeneficiaryBtn()
                .tapBeneficiaryOwnBtn()
                .tapBeneficiaryOtherBtn()
                .tapBeneficiaryMfsBtn()
                .tapBeneficiaryBackBtn()
                .tapOwnBankBtn()
                .tapSourceAccountBtn()
                .selectSourceAccount()
                //.selectDestinationAccount()
                .enterTransAmount(100000)
                .enterMobileNo("01723339875")
                .enterNarration("test")
                .tapFundTransferOwnNextBtn();

    }
@Test(priority = 1)
    public void loginForEmiCalculationLoan() {
        emiCalculatorScreen=screen.getInstance(LoginScreen.class)
                .fillUserID("test")
                .fillPassword("test")
                .tapLoginBtn()
                .tapMoreInfoBtn()
                .tapEmiCalculatorBtn()
                .fillLoanAmount(100000)
                .fillIntRate(5.5)
                .fillDuration(5)
                .tapSubmitBtn();


    }
    @Test(priority = 2)
    public void loginForEmiCalculationFixedDeposit() {
        emiCalculatorScreen=screen.getInstance(LoginScreen.class)
                .fillUserID("test")
                .fillPassword("test")
                .tapLoginBtn()
                .tapMoreInfoBtn()
                .tapEmiCalculatorBtn()
                .tapFixedDepositBtn()
                .fillPrincipleAmount(100000)
                .fillFDIntRate(10)
                .fillFDDuration(7)
                .selectFrequency("Account 1")
                .tapSubmitFDBtn();


    }




}
