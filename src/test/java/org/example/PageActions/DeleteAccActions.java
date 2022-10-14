package org.example.PageActions;

import org.example.PageElements.DeleteAccElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class DeleteAccActions {

    private WebDriver driver;
    DeleteAccElements deleteAccElements;

    public DeleteAccActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.deleteAccElements = new DeleteAccElements(driver);
    }
    public void link(){
        deleteAccElements.clink.click();
    }
    public void CId(String Acc){
        deleteAccElements.ID.sendKeys(Acc);
    }
    public void submit(){
        deleteAccElements.Sub.click();
    }
}
