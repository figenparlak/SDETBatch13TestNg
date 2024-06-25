package class1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestAnatotionExample {
    //goto facebook.com

    //    make sure the text facebook helps u----- is there
    public static WebDriver driver;

    @Test
    public void testingForfbText(){
//seting up the Webdriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        getting the particular url
        driver.get("https://fb.com");
        String text = driver.findElement(By.xpath("//h2")).getText();
        if(text.equals("Facebook helps you connect and share with the people in your life.")){
            System.out.println("succesfull");
        }
        else
        {
            System.out.println("failed");
        }
        driver.quit();


    }


//    goto fb.com
//    make sure create account text is there

    @Test
    public void createAccountText() {
        //seting up the Webdriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        getting the particular url
        driver.get("https://fb.com");
        String text = driver.findElement(By.xpath("//a[text()='Create New Account']")).getText();

        if (text.equals("Create New Account")) {
            System.out.println("success");
        } else {
            System.out.println("failure");

        }
        driver.quit();


    }


    @BeforeMethod
    public void settingupBrowser(){
        //seting up the Webdriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        getting the particular url
        driver.get("https://fb.com");

    }


    @AfterMethod
    public void quitingThebrowser(){

        driver.quit();
    }
}
