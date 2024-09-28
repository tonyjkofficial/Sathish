package xyz.runner;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class KvsPage {

    public static WebDriver driver;

    public void browserLaunch() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://srikvstech.com/");
        driver.manage().window().maximize();

    }

    @After
    public void afterScenario() {
        try {
            driver.quit();
        } catch (Exception e) {
            System.out.println("driver Closed");
        }
    }

    public void verifyLogo() {
        WebElement logo = driver.findElement(By.xpath("//*[contains(@class,'logo')]/a/img"));

        logo.isDisplayed();
        System.out.println("Logo Visible");

    }

    public void validateTitle(String title) {
        switch (title) {
            case "SRI KVS TECH":
                String pageTitle = driver.getTitle();
                Assert.assertEquals(pageTitle, title);
                break;
            case "Main Page Fields":
                List<WebElement> elements = driver.findElements(By.xpath("//*[@class='navul']/li/a"));
                int size = elements.size();
                System.out.println("Size: "+ size);
                for (WebElement fields : elements) {
                    String fieldsText = fields.getText();
                    System.out.println(fieldsText);
                }

                break;

        }
    }
}