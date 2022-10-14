package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustmElements {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[3]/a")
    public WebElement clickedit;

    @FindBy(xpath = "//input[@name='cusid']")
    public WebElement cstmid;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")
    public WebElement sub;

    public EditCustmElements(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
