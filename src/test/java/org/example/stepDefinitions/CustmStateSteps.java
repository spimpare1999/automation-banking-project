package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.CustmStateActions;
import org.openqa.selenium.WebDriver;

public class CustmStateSteps {

    private WebDriver driver;
    CustmStateActions custmStateActions;

    public CustmStateSteps(CommonSteps commonSteps, CustmStateActions custmStateActions) {
        this.driver = commonSteps.getDriver();
        this.custmStateActions = custmStateActions;
    }

    @When("Enter account no {string} And fill date From {string} To {string}")
    public void enterAccountNoAndFillDateFromTo(String accn, String fdate, String date) {
        custmStateActions.link();
        custmStateActions.Acc(accn);
        custmStateActions.date(fdate);
        custmStateActions.ldte(date);
    }
    @And("Enter mini transaction value {string} And no of transaction {string} And click on submit")
    public void enterMiniTransactionValueAndNoOfTransactionAndClickOnSubmit(String minimun, String noof) {
        custmStateActions.trans(minimun);
        custmStateActions.max(noof);
        custmStateActions.submit();
        driver.switchTo().alert().accept();
    }

    @Then("Customize statement successfully")
    public void customizeStatementSuccessfully() {
        System.out.println("customize statement successfully");
    }
}
