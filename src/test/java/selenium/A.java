package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class A extends TestBase {
    public static void main(String[] args) throws Exception {
        TestBase base = new TestBase();
        launchURL("https://adactinhotelapp.com");

        base.enterUserName();

        base.enterPassword();

        base.clickLogin();

        base.selectLocation();

        base.seclectHotel();

        base.selectRoom();

        base.noofAdults();

        base.noofChild();

        base.clickSearch();

        base.rdButton();

        base.nextContinue();

        base.fstName();

        base.lstName();

        base.fillAddress();

        base.cardNO();

        base.cardType();

        base.expcard();

        base.expYr();

        base.cardCvv();

        base.bookHere();

        base.orderNow();


    }
}
