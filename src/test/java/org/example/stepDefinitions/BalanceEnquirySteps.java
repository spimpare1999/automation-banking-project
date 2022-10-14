package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.BalanceEnquiryActions;
import org.openqa.selenium.WebDriver;

public class BalanceEnquirySteps {

    private WebDriver driver;
    BalanceEnquiryActions balanceEnquiryActions;

    public BalanceEnquirySteps(CommonSteps commonSteps, BalanceEnquiryActions balanceEnquiryActions) {
        this.driver = commonSteps.getDriver();
        this.balanceEnquiryActions = balanceEnquiryActions;
    }
    @When("Enter account no {string} And click on submit")
    public void enterAccountNoAndClickOnSubmit(String fill) {
        balanceEnquiryActions.link();
        balanceEnquiryActions.enter(fill);
        balanceEnquiryActions.sub();
        driver.switchTo().alert().accept();
    }

    @Then("Balance enquiry succesfully")
    public void balanceEnquirySuccesfully() {
        System.out.println("balnce enquiry succesfully");
    }
}
