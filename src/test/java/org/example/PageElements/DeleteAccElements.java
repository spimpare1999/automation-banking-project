package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccElements {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[7]/a")
    public WebElement clink;

    @FindBy(xpath = "//input[@name='accountno']")
    public WebElement ID;

    @FindBy(xpath = "//input[@name='AccSubmit']")
    public WebElement Sub;

    public DeleteAccElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
