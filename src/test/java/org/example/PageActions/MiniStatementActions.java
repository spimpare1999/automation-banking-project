package org.example.PageActions;

import org.example.PageElements.MiniStatementElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class MiniStatementActions {

    private WebDriver driver;
    MiniStatementElements miniStatementElements;

    public MiniStatementActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.miniStatementElements = new MiniStatementElements(driver);
    }
    public void clikn(){
        miniStatementElements.link.click();
    }
    public void entr(String ad){
        miniStatementElements.add.sendKeys(ad);
    }
    public void submit(){
        miniStatementElements.sub.click();
    }
}
