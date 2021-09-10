package AvicTests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CheckAmountInCart extends BaseTest {
    private static final String SEARCH_IPHONE = "iPhone 12 mini";
    private static final String EXPECTED_AMOUNT = "1";

    @Test
    public void checkAmountInCart() {
        getHomePage().enableSearchField();
        getHomePage().inputTextToInputField(SEARCH_IPHONE);
        getHomePage().clickOnSearchButton();
        getIphone12miniPage().waitPageToComplete();
        getIphoneSearchResultPage().waitPageToComplete();
        getIphoneSearchResultPage().clickOnFirstResult();
        getIphone12miniPage().visibilityOfElement(getIphone12miniPage().getGreenBuyButton(), 30);
        getIphone12miniPage().clickOnGreenBuyButton();
        getCartPage().visibilityOfElement(getCartPage().getOrangeButtonProceed(), 30);
        getCartPage().clickOnProceedButton();
        assertEquals(EXPECTED_AMOUNT, getHomePage().getAmountInCart());
    }
}
