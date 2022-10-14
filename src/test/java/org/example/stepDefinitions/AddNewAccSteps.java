package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.AddNewAccActions;
import org.openqa.selenium.WebDriver;

public class AddNewAccSteps {

    private WebDriver driver;
    AddNewAccActions addNewAccActions;

    public AddNewAccSteps(CommonSteps commonSteps, AddNewAccActions addNewAccActions) {
        this.driver = commonSteps.getDriver();
        this.addNewAccActions = addNewAccActions;
    }

    @When("Enter CustomrId {string} And select Account type")
    public void enter_Customr_Id_And_Select_Account_Type(String Id) {
       addNewAccActions.link();
       addNewAccActions.addId(Id);
       addNewAccActions.select();
    }
    @And("Add Initial deposit {string} And click on submit button")
    public void add_InitialDeposit_And_Click_On_Submit_Button(String AddId) {
        addNewAccActions.value(AddId);
        addNewAccActions.Subm();
        driver.switchTo().alert().accept();
    }

    @Then("Add new Account successfully")
    public void addNewAccountSuccessfully() {
        System.out.println("added successfully");
    }

}
