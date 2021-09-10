package AvicTests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CheckProductsFoundByQuery extends BaseTest{
    private static final String QUERY = "Samsung";
    private static final String EXPECTED_RESULT = "Samsung";

    @Test (priority = 1)
    public void checkProductsFoundByQuery() {
        getHomePage().enableSearchField();
        getHomePage().inputTextToInputField(QUERY);
        getHomePage().clickOnSearchButton();
        getSamsungSearchPage().waitPageToComplete();
        getSamsungSearchPage().getListOfSamsungTiles()
                .forEach(n -> assertTrue(n.getText().contains(EXPECTED_RESULT)));
    }
}
