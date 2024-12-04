package com.fin.jet.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MasterScreen extends BaseScreen {
    public MasterScreen(AndroidDriver driver) {
        super(driver);
    }
    public boolean hasTransferBtn(){
        return getWebElements(By.xpath("//android.view.View[@content-desc=\"Transfer\"]")).size()>0;
    }
    public FundTransferScreen tapTransferBtn(){
        By transferBtn = By.xpath("//android.view.View[@content-desc=\"Transfer\"]");
        waitForElement(transferBtn);
        getWebElement(transferBtn).click();
        return getInstance(FundTransferScreen.class);
    }
    public MoreInfoScreen tapMoreInfoBtn(){
        By moreInfoBtn = By.xpath("//android.view.View[@content-desc=\"More\"]");
        waitForElement(moreInfoBtn);
        getWebElement(moreInfoBtn).click();
        return getInstance(MoreInfoScreen.class);
    }

}
