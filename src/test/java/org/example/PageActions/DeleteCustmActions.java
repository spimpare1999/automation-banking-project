package org.example.PageActions;

import org.example.PageElements.DeleteCustmElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class DeleteCustmActions {

    private WebDriver driver;
    DeleteCustmElements deleteCustmElements;

    public DeleteCustmActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.deleteCustmElements = new DeleteCustmElements(driver);
    }
    public void linkc(){
        deleteCustmElements.Clink.click();
    }
    public void deletid(String ID){
        deleteCustmElements.delid.sendKeys(ID);
    }
    public void submit(){
        deleteCustmElements.sub.click();
    }
}
