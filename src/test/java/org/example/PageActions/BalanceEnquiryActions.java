package org.example.PageActions;

import org.example.PageElements.BalanceEnquiryElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class BalanceEnquiryActions {

    private WebDriver driver;
    BalanceEnquiryElements balanceEnquiryElements;

    public void link(){
        balanceEnquiryElements.linkc.click();
    }

    public void enter(String ad){
        balanceEnquiryElements.add.sendKeys(ad);
    }
    public void sub(){
        balanceEnquiryElements.submit.click();
    }

    public BalanceEnquiryActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.balanceEnquiryElements = new BalanceEnquiryElements(driver);
    }


}
