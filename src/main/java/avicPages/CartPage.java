package avicPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='btns-cart-holder']//a[contains(@class,'btn--orange')]")
    private WebElement orangeButtonProceed;

    public void clickOnProceedButton() {
        orangeButtonProceed.click();
    }

    public WebElement getOrangeButtonProceed() {
        return orangeButtonProceed;
    }
}
