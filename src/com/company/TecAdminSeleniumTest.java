package com.company;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
*/
public class TecAdminSeleniumTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
      //  chromeOptions.addArguments("--headless");
     //   chromeOptions.addArguments("--no-sandbox");
        //   chromeOptions.addArguments("log-level=2");
        WebDriver driver = new ChromeDriver(chromeOptions);
/*
        driver.get("https://google.com");

        Thread.sleep(1000);

        if (driver.getPageSource().contains("Google")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        */
String baseURL = "http://market.yandex.ru";
String catalogueButton = "/html/body/div[1]/div[3]/noindex/div/div/div[2]/div[1]/div/div/button/span/div/div/div[2]";
String searchInputField = "//html/body/div[1]/div[3]/noindex/div/div/div[2]/div[2]/div/div/form/div[1]/div/div/div/input";
String searchText ="кошачий корм";
String clickToFind = "/html/body/div[1]/div[3]/noindex/div/div/div[2]/div[2]/div/div/form/div[1]/button/span";



        driver.get(baseURL);
        if (driver.getPageSource().contains("робот"))
        {
            System.out.println("яндекс хилые и трусливые говнюки");
   //          https://www.browserstack.com/guide/how-to-handle-captcha-in-selenium
        }

        Thread.sleep(30000);

        WebElement catalogue = driver.findElement(By.xpath(catalogueButton));
        catalogue.click();
        Thread.sleep(10000);

        driver.findElement(By.xpath(searchInputField)).sendKeys(searchText);
        Thread.sleep(10000);

        WebElement clickable = driver.findElement(By.xpath(clickToFind));
        clickable.click();
        Thread.sleep(10000);



        /*
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(scrFile, new File("src\\test\\resources\\screenshot.png"));
*/
        driver.quit();
    }
}
