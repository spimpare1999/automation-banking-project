package org.example.PageActions;

import org.example.PageElements.LogOutElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class LogOutActions {

    private WebDriver driver;
    LogOutElements logOutElements;

    public LogOutActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.logOutElements =new LogOutElements(driver);
    }
   public void lgt(){
        logOutElements.logout.click();
   }

}
