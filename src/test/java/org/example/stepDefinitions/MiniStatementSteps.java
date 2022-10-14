package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.MiniStatementActions;
import org.openqa.selenium.WebDriver;

public class MiniStatementSteps {

    private WebDriver driver;
    MiniStatementActions miniStatementActions;

    public MiniStatementSteps(CommonSteps commonSteps, MiniStatementActions miniStatementActions) {
        this.driver = commonSteps.getDriver();
        this.miniStatementActions = miniStatementActions;
    }

    @When("Enter account number {string} And click on submit")
    public void enterAccountNumberAndClickOnSubmit(String hk) {
        miniStatementActions.clikn();
        miniStatementActions.entr(hk);
        miniStatementActions.submit();
        driver.switchTo().alert().accept();
    }

    @Then("Mini statement submit successfully")
    public void miniStatementSubmitSuccessfully() {
    }
}
