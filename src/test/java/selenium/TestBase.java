package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestBase {
   public static WebDriver driver;

    public static void launchURL(String url){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
    public String getProperty(String propertyName) {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
            return properties.getProperty(propertyName);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void enterUserName(){
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("PeterSK012");
        System.out.println("User Name Entered");
    }

    public void enterPassword(){
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("harry potter");
        System.out.println("Entered Paasword");
    }

    public void clickLogin(){
        WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
        login.click();
        System.out.println("Login Successfully");
    }

    public void selectLocation(){
        WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
        Select loc = new Select(location);
        loc.selectByIndex(2);
    }

    public void seclectHotel(){
        WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
        new Select(hotel).selectByVisibleText("Hotel Hervey");
    }

    public void selectRoom(){
        WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
        new Select(room).selectByValue("Deluxe");
    }

    public void noofAdults(){
        WebElement adults = driver.findElement(By.xpath("//select[@id='adult_room']"));
        new Select(adults).selectByIndex(2);
    }

    public void noofChild(){
        WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
        new Select(child).selectByIndex(2);
    }

    public void clickSearch(){
        WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
        search.click();
    }

    public void rdButton(){
        WebElement button = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
        button.click();
    }

    public void nextContinue(){
        WebElement next = driver.findElement(By.xpath("//input[@id='continue']"));
        next.click();
    }

    public void fstName(){
        WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
        firstname.sendKeys("Sathish");
    }

    public void lstName(){
        WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
        lastname.sendKeys("Kumar");
    }

    public void fillAddress(){
        WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
        address.sendKeys("theriyathu");
    }

    public void cardNO(){
        WebElement cdnum = driver.findElement(By.xpath("//input[@id='cc_num']"));
        cdnum.sendKeys("9876543219876543");
    }

    public void cardType(){
        WebElement cdtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
        new Select(cdtype).selectByIndex(2);
    }

    public void expcard(){
        WebElement edmonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
        new Select(edmonth).selectByVisibleText("July");
    }

    public void expYr(){
        WebElement edyr = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
        new Select(edyr).selectByVisibleText("2026");
    }

    public void cardCvv(){
        WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
        cvv.sendKeys("127");
    }

    public void bookHere(){
        WebElement bookit = driver.findElement(By.xpath("//input[@id='book_now']"));
        bookit.click();
    }

    public void orderNow() throws Exception {
        Thread.sleep(5000);
        WebElement Order = driver.findElement(By.xpath("//input[@id='order_no']"));
        String orderNo = Order.getAttribute("value");
        System.out.println("Order No is : " + orderNo);


        System.out.println("successful");
    }



}
