package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAccElements {

    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[5]/a")
    public WebElement lick;

    @FindBy(xpath = "//input[@name='cusid']")
    public WebElement cust;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")
    public WebElement chose;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
    public WebElement enter;

    @FindBy(xpath = "//input[@name='button2']")
    public WebElement fini;

    public AddNewAccElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
