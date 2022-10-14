package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerElements {
    private WebDriver driver;

    @FindBy(xpath = "//input[@name='uid']")
    public WebElement UserId;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement Password;

    @FindBy(name = "btnLogin")
    public WebElement LgnBton;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
    public WebElement clik;

   @FindBy(xpath = "//input[@name='name']")
    public WebElement entername;


   @FindBy (xpath = "//td/input[@name='rad1']")
    public WebElement gender;


    @FindBy(xpath = "//*[@id=\"dob\"]")
    public WebElement Dob;
      @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
      public WebElement Adress;

      @FindBy(xpath = "//input[@name='city']")
      public WebElement city;

      @FindBy(xpath = "//input[@name='state']")
      public WebElement state;

      @FindBy(xpath = "//input[@name='pinno']")
      public WebElement pin;

      @FindBy(xpath = "//input[@name='telephoneno']")
      public WebElement telpn;

      @FindBy(xpath = "//input[@name='emailid']")
      public WebElement mail;

      @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[1]")
      public WebElement subm;

    public NewCustomerElements(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
