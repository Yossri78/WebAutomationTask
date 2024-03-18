package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.ActionsFactory;
import utilities.JsonReader;

public class CartDetailsPage {

    static String productItem ="//a[normalize-space()='%s']";

    static By proceedToCheckoutBtn = By.xpath("//a[normalize-space()='Proceed to Checkout']");

    public static void validateProductDetails(WebDriver driver){
        Assert.assertTrue(ActionsFactory.VerifyWebElementExists(driver, By.xpath(String.format(productItem, JsonReader.getValueFromJson("JsonDataFile.json","bookName")))));
        Assert.assertTrue(ActionsFactory.VerifyWebElementExists(driver, By.xpath(String.format(HomePage.bookPrice, JsonReader.getValueFromJson("JsonDataFile.json","bookPrice")))));
    }

    public static void ClickProceedToCheckoutBtn(WebDriver driver){
        ActionsFactory.clickElement(driver,proceedToCheckoutBtn);
    }
}
