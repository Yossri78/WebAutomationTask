package utilities;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

public class ActionsFactory {
    static Duration duration = Duration.ofSeconds(30);
    static WebElement element;



    //This method clicks the given element using the given driver
    public static void clickElement(WebDriver driver, By locator) {

        WebDriverWait temporaryWait = new WebDriverWait(driver, duration);
            try {
                temporaryWait.until(ExpectedConditions.presenceOfElementLocated(locator));
                temporaryWait.until(ExpectedConditions.elementToBeClickable(locator));
                driver.findElement(locator).click();
            }catch (Exception e){
                System.err.println(e.getMessage());
                throw e;
            }
        }

    //This method verify element existence using the given driver
    public static boolean VerifyWebElementExists(WebDriver driver, By locator) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, duration);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

            element = driver.findElement(locator);

        } catch (Exception e) {
            return false;
        }

        if (element != null) {
            return true;
        }
        return false;
    }

    //This method scroll-down to the end of the page
    public static void scrollDownPage(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
    }
}

