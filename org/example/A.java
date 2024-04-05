package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class A {
    WebDriver driver;
    @Parameters("browser_name")
    @BeforeMethod
    public void test(@Optional String browserName)throws Exception {
        if(browserName==null){
            browserName="Firefox";

        System.setProperty("webdriver,gecko.driver","C:\\Users\\ADMIN\\OneDrive\\Desktop\\geckodriver-v0.34.0-win-aarch64.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize(); WebDriver driver;
        }
        driver.get("https://portal.thecoremarkets.com/user/login");{

        }
         driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();

    }
    @AfterMethod
    public   void tearDown()throws Exception{
        driver.close();
    }}

