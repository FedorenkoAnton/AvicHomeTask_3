package avicPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SmartphonesPage extends BasePage{
    public SmartphonesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath ="//a[@class='prod-cart__buy']")
    private List<WebElement> buyButtonOnProductTile ;

    @FindBy (xpath = "//a[@class='main-btn main-btn--green main-btn--large']")
    private WebElement productPageBuyButton ;

    public List<WebElement> getListOfTiles() {
        return new ArrayList<>(buyButtonOnProductTile);
    }

}
