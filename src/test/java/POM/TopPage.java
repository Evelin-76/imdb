package POM;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class TopPage extends BasePage{

    @FindBy (xpath = "//td[@class='titleColumn']")
    private List<WebElement> topList;

    public List<WebElement> getTopList() {
        return topList;
    }

    //Dynamic method getSelectedMovie from the top list
    public WebElement getSelectedMovie (int num){
//        String topStrSelection = topList + "["+num+"]";
        WebElement topSelection = Driver.get().findElement(By.xpath("(//td[@class='titleColumn'])["+num+"]/a"));
        return topSelection;
    }

    @FindBy (css = ".TitleHeader__TitleText-sc-1wu6n3d-0.dxSWFG")
    private WebElement movieTitle;

    public String getMovieTitleText() {
        String movieTitleText = movieTitle.getText();
        return movieTitleText;
    }

    @FindBy(id = "lister-sort-by-options" )
    private static WebElement sortByOptions;

    public static List<WebElement> sortBy(String option){

        Select select = new Select(sortByOptions);
        select.selectByVisibleText(option);
  //      BrowserUtils.waitFor(1);
        select.getAllSelectedOptions();

        List<WebElement> optionList= new ArrayList<>();
        for (WebElement element : optionList) {
            element.click();
        }
        return optionList;
    }

    @FindBy (xpath = "//li[@class='subnav_item_main']")
    private List<WebElement> listMoviesByGender;

    public List<WebElement> getListMoviesByGender() {
        return listMoviesByGender;
    }
    //Dynamic method getGender from the gender list
    public WebElement getGender(int indexGender){
        WebElement selectedGender = Driver.get().findElement(By.xpath("//li[@class='subnav_item_main'][" + indexGender + "]/a"));
       // selectedGender.click();
        return selectedGender;
    }
}
