package org.example.PageActions;

import org.example.PageElements.EditCustmElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class EditCustmActions {
    private WebDriver driver;
    EditCustmElements editCustmElements;

    public EditCustmActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.editCustmElements = new EditCustmElements(driver);
    }
    public void Edclik(){
        editCustmElements.clickedit.click();
    }
    public void Cid(String ci){
        editCustmElements.cstmid.sendKeys(ci);
    }
    public void submit(){
        editCustmElements.sub.click();
    }
}
