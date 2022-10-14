package org.example.PageActions;

import org.example.PageElements.CustmStateElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustmStateActions {

    private WebDriver driver;
    CustmStateElements custmStateElements;

    public CustmStateActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.custmStateElements = new CustmStateElements(driver);
    }
    public void link(){
        custmStateElements.likn.click();
    }
    public void add(String dt){
        custmStateElements.numb.findElement(By.id(dt));
    }

}
