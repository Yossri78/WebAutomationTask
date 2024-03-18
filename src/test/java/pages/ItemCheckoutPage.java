package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.ActionsFactory;
import utilities.JsonReader;

public class ItemCheckoutPage {

    static By billingFirstNameField = By.xpath("//label[@for='billing_first_name']");
    static By billingLastNameField = By.xpath("//label[@for='billing_last_name']");
    static By companyNameField = By.xpath("//label[normalize-space()='Company Name']");
    static By emailAddressField = By.xpath("//label[@for='billing_email']");
    static By phoneField = By.xpath("//label[@for='billing_phone']");
    static By countryField = By.xpath("//label[@for='billing_country']");
    static By cityField = By.xpath("//label[@for='billing_city']");
    static By stateField = By.xpath("//label[@for='billing_state']");

    static public void validateBillingFirstNameField(WebDriver driver) {
        Assert.assertTrue(ActionsFactory.VerifyWebElementExists(driver,billingFirstNameField));
    }
    static public void validateBillingLastNameField(WebDriver driver) {
        Assert.assertTrue(ActionsFactory.VerifyWebElementExists(driver,billingLastNameField));
    }
    static public void validateCompanyNameField(WebDriver driver) {
        Assert.assertTrue(ActionsFactory.VerifyWebElementExists(driver,companyNameField));
    }
    static public void validateEmailAddressField(WebDriver driver) {
        Assert.assertTrue(ActionsFactory.VerifyWebElementExists(driver,emailAddressField));
    }
    static public void validatePhoneField(WebDriver driver) {
        Assert.assertTrue(ActionsFactory.VerifyWebElementExists(driver,phoneField));
    }
    static public void validateCountryField(WebDriver driver) {
        Assert.assertTrue(ActionsFactory.VerifyWebElementExists(driver,countryField));
    }

    static public void validateCityField(WebDriver driver) {
        Assert.assertTrue(ActionsFactory.VerifyWebElementExists(driver,cityField));
    }
    static public void validateStateField(WebDriver driver) {
        Assert.assertTrue(ActionsFactory.VerifyWebElementExists(driver,stateField));
    }

}
