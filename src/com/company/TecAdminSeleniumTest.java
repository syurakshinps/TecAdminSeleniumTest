package com.company;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TecAdminSeleniumTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("log-level=2");
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
String catalogueButton = "/html/body/div[1]/div[3]/noindex/div/div/div[2]/div[1]/div/div/button";
String catFood = "/html/body/div[1]/div[3]/div[1]/noindex/div/div/div[2]/div[2]/div/div/form";
String elementToClickToFind = "/html/body/div[1]/div[3]/div[1]/noindex/" +
        "div/div/div[2]/div[2]/div/div/form/div/button/span";



        driver.get(baseURL);

//        driver.get(catalogueButton);
        WebElement catalogue = driver.findElement(By.xpath(catalogueButton));
        catalogue.click();


        driver.quit();
    }
}
