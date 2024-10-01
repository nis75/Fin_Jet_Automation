package com.fin.jet.testcases;

import com.fin.jet.screens.BranchScreen;
import com.fin.jet.screens.LocationScreen;
import com.fin.jet.screens.LoginScreen;
import com.fin.jet.screens.SubBranchScreen;
import org.testng.annotations.Test;

public class LocationTest extends BaseTest{
       LocationScreen locationScreen;
    @Test(priority = 0)
    public void BranchlocationSuccessful(){
        locationScreen=screen.getInstance(LoginScreen.class)
                .tapLocationBtn()
                .tapBranchBtn()
                .tabBackBtn();

    }

    @Test(priority = 1)
    public void SubBranchlocationSuccessful(){
      locationScreen=  locationScreen.tapSubBranchBtn()
                .tabBackbtn();

    }


}
