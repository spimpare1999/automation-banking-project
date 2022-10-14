package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.EditCustmActions;
import org.openqa.selenium.WebDriver;

public class EditCustmSteps {
    private WebDriver driver;
    EditCustmActions editCustmActions;

    public EditCustmSteps(CommonSteps commonSteps, EditCustmActions editCustmActions) {
        this.driver = commonSteps.getDriver();
        this.editCustmActions = editCustmActions;
    }

    @When("Enter CustomerId {string} And click on submit button")
    public void enter_customer_id_and_click_on_submit_button(String custmorId) {
        editCustmActions.Edclik();
        editCustmActions.Cid(custmorId);
        editCustmActions.submit();
    }

    @Then("Customer should be edit successfully")
    public void customer_should_be_edit_successfully() {
        System.out.println("it should submit");
    }
}
