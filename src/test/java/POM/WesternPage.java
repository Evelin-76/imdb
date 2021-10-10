package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.List;

public class WesternPage extends BasePage{

    @FindBy (xpath = "//div[@class='sorting']/a")
    private List<WebElement> listSortByWestern;

    public List<WebElement> getListSortByWestern() {
        return listSortByWestern;
    }

    //Dynamic method getSortByWestern genre
    public WebElement getSortByWestern(String sortByOption){
        WebElement sortedOption = Driver.get().findElement(By.xpath("//div[@class='sorting']//*[contains(text(),'" + sortByOption + "')]"));
        return sortedOption;
    }


    @FindBy (xpath = "//h1[@class='header']")
    private WebElement subtitle;

    public WebElement getSubtitle() {
        return subtitle;
    }
}
