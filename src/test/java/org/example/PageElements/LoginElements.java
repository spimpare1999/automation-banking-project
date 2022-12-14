package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements {

   private  WebDriver driver;

   @FindBy(xpath = "//input[@name='uid']")
    public WebElement userId;

   @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

   @FindBy(name = "btnLogin")
    public WebElement LoginButton;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
    public WebElement ClickNewCust;


    public LoginElements(WebDriver driver){
       this.driver=driver;
       PageFactory.initElements(driver,this);
   }
}
