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
    public void Acc(String ac){
        custmStateElements.accn.sendKeys(ac);
    }
    public void date(String dte){
        custmStateElements.fdate.sendKeys(dte);
    }
    public void ldte(String le){
        custmStateElements.ldate.sendKeys(le);
    }
    public void trans(String mt) {
        custmStateElements.mtras.sendKeys(mt);
    }
    public void max(String no){
        custmStateElements.mx.sendKeys(no);
    }
    public void submit(){
        custmStateElements.clik.click();
    }
}
