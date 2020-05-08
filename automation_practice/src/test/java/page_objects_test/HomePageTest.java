package page_objects_test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.HomePage;

public class HomePageTest extends src.main.java.base.BrowserDriver {

    /**
     *
     * Test cases associated with HomePage shall be available here
     * No web elements (locators) in this class
     *
     * */

    HomePage homePage = null;

    @BeforeMethod
    public void initialiseElements(){
             homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void searchTest() throws InterruptedException {
        String actualValue = homePage.search();
        String expectedValue = "Showing 1 - 1 of 1 item";
        Assert.assertEquals(actualValue, expectedValue);
    }


}
