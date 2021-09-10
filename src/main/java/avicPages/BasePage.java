package avicPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Clock;

public class BasePage {
     WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void visibilityOfElement(WebElement element, long timeout) {
        new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public void waitPageToComplete() {
        new WebDriverWait(driver, 10).until(
                driver1 -> ((JavascriptExecutor) driver1).executeScript("return document.readyState").equals("complete"));
    }
}
