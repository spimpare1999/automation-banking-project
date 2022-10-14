package org.example.PageActions;

import org.example.PageElements.NewCustomerElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class NewCustomerActions {
    private WebDriver driver;
    NewCustomerElements newCustomerElements;

    public NewCustomerActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.newCustomerElements = new NewCustomerElements(driver);
    }

    public void clik(){
        newCustomerElements.clik.click();
    }

    public void enname(String ename){
      newCustomerElements.entername.sendKeys(ename);
    }

     public void fgender(){
     newCustomerElements.gender.click();
     }
   public void Dob( String DOB){
        newCustomerElements.Dob.sendKeys(DOB);
   }

    public void adress(String Adress){
        newCustomerElements.Adress.sendKeys(Adress);
    }
    public void City(String city){
        newCustomerElements.city.sendKeys(city);
    }
    public void stet(String stat){
        newCustomerElements.state.sendKeys(stat);
    }
    public void Pin(String pin){
        newCustomerElements.pin.sendKeys(pin);
    }
    public void tepn(String telphone){
        newCustomerElements.telpn.sendKeys(telphone);
    }
   public void email(String mail){
        newCustomerElements.mail.sendKeys(mail);
   }
    public void submit(){
        newCustomerElements.subm.click();
    }

}


