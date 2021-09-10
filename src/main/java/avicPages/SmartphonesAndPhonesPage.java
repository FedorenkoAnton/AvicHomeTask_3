package avicPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SmartphonesAndPhonesPage extends BasePage{
    public SmartphonesAndPhonesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath =
            "//div[@class='brand-box__title']//a[@href='https://avic.ua/smartfonyi']")
    private WebElement SmartphoneTile;

    public void clickOnSmartphoneTile() {
        SmartphoneTile.click();
    }

}
