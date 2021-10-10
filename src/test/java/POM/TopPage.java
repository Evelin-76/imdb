package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.List;

public class TopPage extends BasePage{



    @FindBy (xpath = "//td[@class='titleColumn']")
    private List<WebElement> topList;

    public List<WebElement> getTopList() {
        return topList;
    }

//    //Dynamic method getTopListElement
//    public WebElement getTopListElement(int num){
//        String topStrElement = topList + "["+num+"]";
//        WebElement topElement = Driver.get().findElement(By.xpath("(//td[@class='titleColumn'])["+num+"]"));
//        return topElement;
//    }

    //Dynamic method getSelectedMovie
    public WebElement getSelectedMovie (int num){
        String topStrSelection = topList + "["+num+"]";
        WebElement topSelection = Driver.get().findElement(By.xpath("(//td[@class='titleColumn'])["+num+"]/a"));
        return topSelection;
    }



    @FindBy (css = ".TitleHeader__TitleText-sc-1wu6n3d-0.dxSWFG")
    private WebElement movieTitle;

    public String getMovieTitleText() {
        String movieTitleText = movieTitle.getText();
        return movieTitleText;
    }

}
