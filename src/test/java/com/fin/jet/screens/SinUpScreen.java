package com.fin.jet.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SinUpScreen extends BaseScreen {
    public SinUpScreen(AndroidDriver driver) {
        super(driver);
    }

    public SinUpScreen fillUserId(String userId) {
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[1]")).sendKeys(userId);
        return this;
    }

    public SinUpScreen fillAccountNo(String accountNo) {
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[2]")).sendKeys(accountNo);
        return this;
    }

    public SinUpScreen fillAccountName(String accountName) {
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[3]")).sendKeys(accountName);
        return this;
    }

    public SinUpScreen fillMobileNo(String mobileNo) {
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[4]")).sendKeys(mobileNo);
        return this;
    }

    public SinUpScreen fillDateOfBirth() {

        String day = "12";
        String month = "08";
        String year = "1989";
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.view.View[1]")).click();//open the date picker

        while (true) {
            String monthYear = getWebElement(By.xpath("//android.view.View[@resource-id=\"android:id/month_view\"]")).getText();
            String arr[] = monthYear.split(" ");
            String dy = arr[0];
            String mon = arr[1];
            String yer = arr[2];
            if (dy.equals(day) && mon.equalsIgnoreCase(month) && yer.equals(year))
                break;
            else
                getWebElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Previous month\"]")).click();


        }
        List<WebElement> allDats = getWebElements(By.xpath(""));
        for (WebElement ele : allDats) {
            String dt = ele.getText();
            if (dt.equals(day)) {
                ele.click();
                break;
            }

        }

        // Define the date format (adjust the pattern as needed)
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        // Convert the Date to a String
//        String formattedDate = sdf.format(dateOfBirth);
//        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.view.View[1]")).sendKeys(formattedDate);
        return this;
    }

    public SinUpScreen fillNidNo(String nidNo) {
        getWebElement(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.widget.EditText[5]")).sendKeys(nidNo);
        return this;
    }

    public SinUpScreen clickAgreeBtn() {
        return getInstance(SinUpScreen.class);
    }


}
