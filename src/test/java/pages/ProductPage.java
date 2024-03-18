package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ActionsFactory;

public class ProductPage {

    static By addToBasketBtn = By.xpath("//button[normalize-space()='Add to basket']");
    static By viewBasketBtn = By.xpath("//a[normalize-space()='View Basket']");



    static public void clickAddToBasketBtn(WebDriver driver) {
        ActionsFactory.clickElement(driver,addToBasketBtn);
    }

    static public void clickViewBasketBtn(WebDriver driver) {
        ActionsFactory.clickElement(driver,viewBasketBtn);
    }
}
