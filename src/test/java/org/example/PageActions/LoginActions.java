package org.example.PageActions;

import org.example.PageElements.LoginElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class LoginActions {
    private WebDriver driver;
    LoginElements loginElements;


    public LoginActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.loginElements = new LoginElements(driver);
    }

    public  void userId(String userId){
      loginElements.userId.sendKeys(userId);
    }

    public  void enterPassword(String password){
      loginElements.password.sendKeys(password);
    }

    public  void clickOnLogin(){
      loginElements.LoginButton.click();
    }
    public  void clicknewCust (){
        loginElements.ClickNewCust.click();
    }

}
