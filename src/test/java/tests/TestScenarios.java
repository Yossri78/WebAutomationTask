package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.CartDetailsPage;
import pages.HomePage;
import pages.ItemCheckoutPage;
import pages.ProductPage;
import utilities.BrowserInitialtization;

public class TestScenarios {

    WebDriver driver;
    BrowserInitialtization init = new BrowserInitialtization();

    @Parameters({ "browser" })
    @BeforeTest
    public void scriptInitializations(String browser){
        driver= init.chromeInitialtization(browser);
    }

    @Test (priority = 1)
    public void validateExistingBook() {
        HomePage.validateExistingBook(driver);
        HomePage.validateBookAmount(driver);
    }

    @Test (priority = 2)
    public void clickBookProduct() {
        HomePage.clickBookProduct(driver);
    }

    @Test (priority = 3)
    public void clickShoppingCart() {
        ProductPage.clickAddToBasketBtn(driver);
        ProductPage.clickViewBasketBtn(driver);
    }

    @Test (priority = 4)
    public void validateAddedItemDetails() {
        CartDetailsPage.validateProductDetails(driver);
    }

    @Test (priority = 5)
    public void clickProceedToCheckout() {
        CartDetailsPage.ClickProceedToCheckoutBtn(driver);
    }

    @Test (priority = 6)
    public void validateBillingDetailsFormDisplayed() {
        ItemCheckoutPage.validateBillingFirstNameField(driver);
        ItemCheckoutPage.validateBillingLastNameField(driver);
        ItemCheckoutPage.validateCompanyNameField(driver);
        ItemCheckoutPage.validateEmailAddressField(driver);
        ItemCheckoutPage.validatePhoneField(driver);
        ItemCheckoutPage.validateCountryField(driver);
        ItemCheckoutPage.validateStateField(driver);
        ItemCheckoutPage.validateCityField(driver);
    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }
}
