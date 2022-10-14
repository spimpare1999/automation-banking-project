package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonSteps {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
       driver.quit();
    }
//    @Given("Open url in application in browser")
//    public void open_url_in_application_in_browser() {
//       driver.get("https://demo.guru99.com/V1/");
//
//    }

    @Given("Open url in browser")
    public void open_Url_In_Browser() {
        driver.get("https://demo.guru99.com/V2/");
    }
}
