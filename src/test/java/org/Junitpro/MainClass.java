package org.Junitpro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static selenium.TestBase.driver;

public class MainClass extends PageClass {

    PageClass pg;

    @BeforeClass
    public static void beforeClass() {


    }

    @Before
    public void startTime() {
        long start = System.currentTimeMillis();
        System.out.println(start);


    }
    @After
    public void endTime() {
        long end = System.currentTimeMillis();
        System.out.println(end);

    }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();

    }

    @Test
    public void validateLogin() {
        pg = new PageClass();
        pg.browserLaunch();
        pg.enterUserName();
        pg.enterPassword();
        pg.clickLogin();
    }

    @Test
    public void validateOrderNumber() throws Exception{
        pg = new PageClass();
        pg.browserLaunch();
        pg.enterUserName();
        pg.enterPassword();
        pg.clickLogin();
        pg.selectLocation();
        pg.seclectHotel();
        pg.selectRoom();
        pg.noofAdults();
        pg.noofChild();
        pg.clickSearch();
        pg.rdButton();
        pg.nextContinue();
        pg.fstName();
        pg.lstName();
        pg.fillAddress();
        pg.cardNO();
        pg.cardType();
        pg.expcard();
        pg.expYr();
        pg.cardCvv();
        pg.bookHere();
        pg.orderNow();





    }




}
