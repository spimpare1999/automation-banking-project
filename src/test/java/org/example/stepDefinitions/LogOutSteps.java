package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.LogOutActions;
import org.openqa.selenium.WebDriver;

public class LogOutSteps {

    private WebDriver driver;
    LogOutActions logOutActions;

    public LogOutSteps(CommonSteps commonSteps, LogOutActions logOutActions) {
        this.driver = commonSteps.getDriver();
        this.logOutActions = logOutActions;
    }
    @When("Click on log out button")
    public void clickOnLogOutButton() {
        logOutActions.lgt();
    }

    @Then("Log out successfully")
    public void logOutSuccessfully() {
        System.out.println("logout succes");
    }
}
