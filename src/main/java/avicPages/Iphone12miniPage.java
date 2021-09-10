package avicPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Iphone12miniPage extends BasePage {
    public Iphone12miniPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//a[@class='main-btn main-btn--green main-btn--large']")
    private WebElement greenBuyButton;

    public void clickOnGreenBuyButton() {
        greenBuyButton.click();
    }

    public WebElement getGreenBuyButton() {
        return greenBuyButton;
    }
}
