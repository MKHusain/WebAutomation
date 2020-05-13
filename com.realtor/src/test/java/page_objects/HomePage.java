package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.CLASS_NAME, using = "rdc-input")
    WebElement searchBox;

    @FindBy(how = How.CLASS_NAME, using = "search-btn")
    WebElement searchButton;

    @FindBy(how = How.CLASS_NAME, using = "result-count")
    WebElement productCount;


    public String search(){
        searchBox.sendKeys("Hollis, NY");
        searchButton.click();
        String actualValue = productCount.getText();
        return actualValue;
    }



}
