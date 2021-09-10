package avicPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class IphoneSearchResultPage extends BasePage {
    public IphoneSearchResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//div[@class='container-main']")
    private List<WebElement>  IphoneSearchResult;

    private WebElement getFirstResult(){
        List<WebElement> elements = new ArrayList<>(IphoneSearchResult);
        return elements.get(0);
    }

    public void clickOnFirstResult() {
        getFirstResult().click();
    }

}
