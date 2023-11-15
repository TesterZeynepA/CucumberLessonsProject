package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="twotabsearchtextbox")
    WebElement search;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    WebElement resultText;

    public void searchKeyword(String word) {
        search.sendKeys(word + Keys.ENTER);
    }

    public void  validateResultText(String word){
        Assert.assertTrue(resultText.getText().toLowerCase().contains(word));
    }
}
