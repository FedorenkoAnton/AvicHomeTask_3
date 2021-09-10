package avicPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//input[@placeholder='Поиск ']")
    private WebElement searchField;

    @FindBy (xpath = "//button[@class='button-reset search-btn']")
    private WebElement searchButton;

    @FindBy (xpath =
            "//li[@class='parent js_sidebar-item']//a[@href='https://avic.ua/telefonyi-i-aksessuaryi']")
    private WebElement sidebarSmartPhones;

    @FindBy (xpath =
            "//div[contains(@class,'header-bottom')]//div[contains(@class, 'active-cart-item')]")
    private WebElement amountInCart;

    public void clickOnSmartphoneButton() {
        sidebarSmartPhones.click();
    }

    public void enableSearchField() {
        searchField.click();
    }

    public void inputTextToInputField(String text) {
        searchField.sendKeys(text);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public String getAmountInCart() {
        return amountInCart.getText();
    }
}
