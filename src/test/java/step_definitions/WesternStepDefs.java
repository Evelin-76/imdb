package step_definitions;

import POM.TopPage;
import POM.WesternPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class WesternStepDefs {
    WesternPage westernPage = new WesternPage();

    @And("the user clicks on the movie index {int}  in the Top Rated Movies By Genre")
    public void theUserClicksOnTheMovieIndexGenreInTheTopRatedMoviesByGenre(int indexGenre) {
        new TopPage().getGender(indexGenre).click();
    }

    @And("the user clicks on the {string} in Sort by options")
    public void theUserClicksOnTheInSortByOptions(String selectedOption) {
        westernPage.getSortByWestern(selectedOption).click();
    }

    @Then("the {string} is diplayed in the page")
    public void theIsDiplayedInThePage(String expectedSubtitle) {

        String actualSubtitle = westernPage.getSubtitle().getText();

        Assert.assertEquals(expectedSubtitle,actualSubtitle);
    }
}
