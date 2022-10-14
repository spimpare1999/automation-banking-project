package org.example.PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustmStateElements {
    private WebDriver driver;


    @FindBy(xpath = "/html/body/div[3]/div/ul/li[10]/a")
    public WebElement likn;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
    public WebElement accn;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")
    public WebElement fdate;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
    public WebElement ldate;

    @FindBy(xpath = "//input[@name='amountlowerlimit']")
    public WebElement mtras;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
    public WebElement mx;

    @FindBy(xpath = "//input[@name='AccSubmit']")
    public WebElement clik;


    public CustmStateElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
