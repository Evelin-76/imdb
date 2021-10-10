package POM;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class BasePage {
    public BasePage(){PageFactory.initElements(Driver.get(), this);}
}
