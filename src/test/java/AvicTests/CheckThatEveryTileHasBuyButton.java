package AvicTests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CheckThatEveryTileHasBuyButton extends BaseTest {

    @Test
    public void checkThatEveryTileHasBuyButton() {
        getHomePage().clickOnSmartphoneButton();
        getSmartphonesAndPhonesPage().clickOnSmartphoneTile();
        getSmartphonesPage().waitPageToComplete();
        getSmartphonesPage().getListOfTiles().forEach(n -> assertNotNull(n));
    }
}
