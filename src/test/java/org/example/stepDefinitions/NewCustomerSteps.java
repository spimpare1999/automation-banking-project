package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.NewCustomerActions;
import org.openqa.selenium.WebDriver;

public class NewCustomerSteps {
    private WebDriver driver;
    NewCustomerActions newCustomerActions;

    public NewCustomerSteps(CommonSteps commonSteps,NewCustomerActions newCustomerActions) {
        this.driver = commonSteps.getDriver();
        this.newCustomerActions = newCustomerActions;
    }

    @When("Enter {string} and click On Gender")
    public void enterShrutiAndClickOnGender(String name) {
        newCustomerActions.clik();
        newCustomerActions.enname(name);
        newCustomerActions.fgender();
    }

    @And("Enter {string} and also the Address {string}")
    public void enter_And_Also_The_Address(String birthdaydate , String adress) {
        newCustomerActions.Dob(birthdaydate);
     newCustomerActions.adress(adress);
    }

    @And("Enter City {string} and state {string}")
    public void enterCityAndState(String city, String state) {
        newCustomerActions.City(city);
        newCustomerActions.stet(state);

    }

    @And("Enter PIN {string} and Telephone number {string}")
    public void enterPINAndTelephoneNumber(String pin, String telpn) {
        newCustomerActions.Pin(pin);
        newCustomerActions.tepn(telpn);
    }

    @And("Enter email {string} and click on submit")
    public void enterEmailAndClickOnSubmit(String mail) {
        newCustomerActions.email(mail);
        newCustomerActions.submit();
        driver.switchTo().alert().accept();
    }

    @Then("Submit should be successful")
    public void submitShouldBeSuccessful() {
        System.out.println("submit successful");
    }

}
