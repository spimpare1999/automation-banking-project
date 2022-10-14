package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.DeleteCustmActions;
import org.openqa.selenium.WebDriver;

public class DeleteCustmSteps {

    private WebDriver driver;
    DeleteCustmActions deleteCustmActions;

    public DeleteCustmSteps(CommonSteps commonSteps, DeleteCustmActions deleteCustmActions) {
        this.driver = commonSteps.getDriver();
        this.deleteCustmActions = deleteCustmActions;
    }

    @When("Enter CustomerId {string} And click on submit")
    public void enter_CustomerId_And_Click_On_Submit(String customerid) {
        deleteCustmActions.linkc();
        deleteCustmActions.deletid(customerid);
        deleteCustmActions.submit();
     //   driver.switchTo().alert().accept();
    }
    @Then("Delete Customer successfully")
    public void deleteCustomerSuccessfully() {
        System.out.println("delete successfully ");
    }
}
