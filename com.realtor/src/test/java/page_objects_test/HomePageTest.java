package page_objects_test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.HomePage;
import src.main.java.base.BrowserDriver;

public class HomePageTest extends BrowserDriver {

    HomePage homePage = null;

    @BeforeMethod
    public void initialiseElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void searchBarTest() {

        String actualValue = homePage.search();
        String expectedValue = "124 Homes";
        Assert.assertEquals(actualValue, expectedValue);

    }
}

