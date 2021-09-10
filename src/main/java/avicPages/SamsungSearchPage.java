package avicPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SamsungSearchPage extends BasePage {
    public SamsungSearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> DescriptionOfProduct;

    public List<WebElement> getListOfSamsungTiles() {
        List<WebElement> elements = new ArrayList<>(DescriptionOfProduct);
        return elements;
    }
}
