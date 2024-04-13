package org.Testngpro;

import org.Junitpro.PageClass;
import org.testng.annotations.*;

public class MainClass extends PageClass {

    PageClass pg;

    @BeforeSuite
    public void beforeSuite() {

    }

    @BeforeClass
    public void beforeClass() {
        long start = System.currentTimeMillis();
        System.out.println(start);

    }

    @BeforeTest
    public void beforeTest() {

    }

    @BeforeGroups
    public void beforeGroups() {

    }

    @BeforeMethod
    public void beforeMethod() {
        long start = System.currentTimeMillis();
        System.out.println(start);


    }

    @Test
    public void validateOrderNumber() throws Exception {
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

    @AfterMethod
    public void afterMethod() {
        long end = System.currentTimeMillis();
        System.out.println(end);

    }

    @AfterGroups
    public void afterGroups() {

    }

    @AfterTest
    public void afterTest() {

    }

    @AfterClass
    public void afterClass() {

    }

    @AfterSuite
    public void afterSuite() {

    }

}
