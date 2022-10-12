package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PageActions.LoginActions;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver driver;
    LoginActions loginActions;

    public LoginSteps(CommonSteps commonSteps, LoginActions loginActions ) {
        this.driver = commonSteps.getDriver();
        this.loginActions= loginActions ;
    }

    @Given("Open url in application in browser")
    public void open_url_in_application_in_browser() {
     driver.get("https://demo.guru99.com/V1/");
    }
    @Then("Login should be successful")
    public void login_should_be_successful() {
        System.out.println("successfully login");
    }

    @When("Enter {string} and {string} and click on login")
    public void enter_And_And_Click_On_Login(String userId,String password) throws InterruptedException {
        loginActions.userId(userId);
        loginActions.enterPassword(password);
        loginActions.clickOnLogin();
        Thread.sleep(2000);
    }
}
