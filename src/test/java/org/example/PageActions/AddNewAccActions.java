package org.example.PageActions;

import org.example.PageElements.AddNewAccElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class AddNewAccActions {
    private WebDriver driver;
    AddNewAccElements addNewAccElements;

    public void link(){
        addNewAccElements.lick.click();
    }
    public void addId(String fir){
        addNewAccElements.cust.sendKeys(fir);
    }

    public void select(){
        addNewAccElements.chose.click();
    }

    public void value(String No){
        addNewAccElements.enter.sendKeys(No);
    }
    public void Subm(){
        addNewAccElements.fini.click();
    }

    public AddNewAccActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.addNewAccElements = new AddNewAccElements(driver);
    }
}
