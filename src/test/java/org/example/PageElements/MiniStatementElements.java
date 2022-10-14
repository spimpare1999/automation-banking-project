package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniStatementElements {

    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[9]/a")
    public WebElement link;

    @FindBy(xpath = "//input[@name='accountno']")
    public WebElement add;

    @FindBy(xpath = "//input[@name='AccSubmit']")
    public WebElement sub;


    public MiniStatementElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
