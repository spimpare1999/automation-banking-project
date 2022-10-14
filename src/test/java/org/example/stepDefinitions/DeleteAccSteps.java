package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.DeleteAccActions;
import org.openqa.selenium.WebDriver;

public class DeleteAccSteps {

    private WebDriver driver;
    DeleteAccActions deleteAccActions;

    public DeleteAccSteps(CommonSteps commonSteps, DeleteAccActions deleteAccActions) {
        this.driver = commonSteps.getDriver();
        this.deleteAccActions = deleteAccActions;
    }
    @When("Enter acc number{string} And click on submit")
    public void enter_AccNumber_And_Click_On_Submit(String number) {
        deleteAccActions.link();
        deleteAccActions.CId(number);
        deleteAccActions.submit();
        driver.switchTo().alert().accept();
    }

    @Then("Delete account successfully")
    public void delete_Account_Successfully() {
        System.out.println("delete successfulyy");
    }

}
