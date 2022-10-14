package org.example.PageActions;

import org.example.PageElements.EditAccElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class EditAccActions {

    private WebDriver driver;
    EditAccElements editAccElements;

    public void link(){
        editAccElements.Klick.click();
    }
    public void acc(String Ac){
        editAccElements.acn.sendKeys(Ac);
    }

    public void submit(){
        editAccElements.sub.click();
    }


    public EditAccActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.editAccElements = new EditAccElements(driver);
    }
}
