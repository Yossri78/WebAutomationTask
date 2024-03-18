package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.ActionsFactory;
import utilities.JsonReader;

import java.io.IOException;

public class HomePage {

    static String bookName="//h3[normalize-space()='%s']";
    static String bookPrice="//span[@class='woocommerce-Price-amount amount' and contains(text(),'%s')]";

   static public void validateExistingBook(WebDriver driver) {
       ActionsFactory.scrollDownPage(driver);
       Assert.assertTrue(ActionsFactory.VerifyWebElementExists(driver, By.xpath(String.format(bookName, JsonReader.getValueFromJson("JsonDataFile.json","bookName")))));
    }

    static public void validateBookAmount(WebDriver driver) {
        Assert.assertTrue(ActionsFactory.VerifyWebElementExists(driver, By.xpath(String.format(bookPrice, JsonReader.getValueFromJson("JsonDataFile.json","bookPrice")))));
    }

    static public void clickBookProduct(WebDriver driver) {
        ActionsFactory.scrollDownPage(driver);
        ActionsFactory.clickElement(driver, By.xpath(String.format(bookName, JsonReader.getValueFromJson("JsonDataFile.json","bookName"))));
    }

}
