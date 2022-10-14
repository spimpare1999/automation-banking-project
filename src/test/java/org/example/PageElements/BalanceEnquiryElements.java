package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BalanceEnquiryElements {

    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[8]/a")
    public WebElement linkc;

    @FindBy(xpath = "//input[@name='accountno']")
    public WebElement add;

    @FindBy(xpath = "//input[@name='AccSubmit']")
    public WebElement submit;

    public BalanceEnquiryElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
