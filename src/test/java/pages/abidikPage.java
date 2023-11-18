package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class abidikPage {
    public abidikPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
