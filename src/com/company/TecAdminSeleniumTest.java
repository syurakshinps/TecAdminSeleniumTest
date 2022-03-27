package com.company;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
String priceFromField = "/html/body/div[1]/div[3]/div[3]/div[5]/aside/div[2]/div/div/div/div/div[2]/div[1]/div/div/fieldset/div/ul/li[1]/p/input";
String priceToFiled = "/html/body/div[1]/div[3]/div[3]/div[5]/aside/div[2]/div/div/div/div/div[2]/div[1]/div/div/fieldset/div/ul/li[2]/p/input";
String priceMin = "50";
String priceMax = "150";
String goodsKind = "//*[@id=\"catalogPopup\"]/div/div/div/div/div/div/div[1]/div/ul/li[13]/a/span";
String treatsForCatsKind = "/html/body/div[21]/div[3]/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/ul/li[3]/div/a";
String treatsURL = "https://market.yandex.ru/catalog--lakomstva-dlia-koshek/62819/list?hid=15963668";
String deliveryServiceRadioBtn ="/html/body/div[1]/div[3]/div[3]/div[5]/aside/div[2]/div/div/div/div/div[2]/div[20]/div/div/fieldset/ul/li[1]/div/label/div";
String makerName = "/html/body/div[1]/div[3]/div[3]/div[5]/aside/div[2]/div/div/div/div/div[2]/div[4]/div/div/fieldset/ul/li[11]/div/a/label/div";
        driver.get(baseURL);
        if (driver.getPageSource().contains("робот"))
        {
            System.out.println("младший брат гугля ниасилил отладку через селениум\r\nстыд и позор, так-то");
   //          https://www.browserstack.com/guide/how-to-handle-captcha-in-selenium
        }

        Thread.sleep(30000);

        WebElement catalogue = driver.findElement(By.xpath(catalogueButton));
        catalogue.click();
        System.out.println("Кликнули на каталог");
        Thread.sleep(10000);
/*
        driver.findElement(By.xpath(searchInputField)).sendKeys(searchText);
        System.out.println("вбили текст " + searchText);
        Thread.sleep(10000);

        WebElement clickable = driver.findElement(By.xpath(clickToFind));
        System.out.println("нажали искать " + clickToFind);
        clickable.click();
        Thread.sleep(10000);

        driver.findElement(By.xpath(priceFromField)).sendKeys(priceMin);
        System.out.println("min price " + priceMin);
        Thread.sleep(10000);


        driver.findElement(By.xpath(priceToFiled)).sendKeys(priceMax);
        System.out.println("max price " + priceMax);
        Thread.sleep(10000);
*/
        Actions action = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath(goodsKind));
        action.moveToElement(ele).perform();
        System.out.println("hover Зоотовары");
        Thread.sleep(10000);

        driver.get(treatsURL);
        System.out.println("Перешли в лакомства");
        Thread.sleep(10000);

        driver.findElement(By.xpath(priceFromField)).sendKeys(priceMin);
        System.out.println("min price " + priceMin);
        Thread.sleep(10000);


        driver.findElement(By.xpath(priceToFiled)).sendKeys(priceMax);
        System.out.println("max price " + priceMax);
        Thread.sleep(10000);

        WebElement radio1 = driver.findElement(By.xpath(deliveryServiceRadioBtn));
        radio1.click();
        System.out.println("Доставка курьером бутон клац");
        Thread.sleep(10000);

        WebElement radio2 = driver.findElement(By.xpath(makerName));
        radio2.click();
        System.out.println("Деревенские лакомства - маректолога потом уволили, надеюсь");
        Thread.sleep(10000);








        /*
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(scrFile, new File("src\\test\\resources\\screenshot.png"));
*/
        driver.quit();
    }
}
