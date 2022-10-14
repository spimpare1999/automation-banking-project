package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.EditAccActions;
import org.openqa.selenium.WebDriver;

public class EditAccSteps {

    private WebDriver driver;
    EditAccActions editAccActions;

    public EditAccSteps(CommonSteps commonSteps, EditAccActions editAccActions) {
        this.driver = commonSteps.getDriver();
        this.editAccActions = editAccActions;
    }

    @When("Enter AccountNo {string} And click on submit")
    public void enter_AccountNo_And_Click_On_Submit(String AccNo) {
        editAccActions.link();
        editAccActions.acc(AccNo);
        editAccActions.submit();
        driver.switchTo().alert().accept();
    }

    @Then("Edit account successfully")
    public void editAccountSuccessfully() {
        System.out.println("edit successfully");
    }
}
