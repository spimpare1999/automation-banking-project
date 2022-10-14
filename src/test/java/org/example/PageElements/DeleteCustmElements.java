package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustmElements {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[4]/a")
    public WebElement Clink;

    @FindBy(xpath = "//input[@name='cusid']")
    public WebElement delid;

    @FindBy(xpath = "//input[@name='AccSubmit']")
    public WebElement sub;


    public DeleteCustmElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
}
