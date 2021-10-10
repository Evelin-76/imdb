package step_definitions;

import POM.TopPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class TopStepDefs {
    TopPage topPage = new TopPage();

    @Given("the user is on the {string}")
    public void theUserIsOnThe(String expectedSubtitle) {

        Driver.get().get(ConfigurationReader.get("url"));

        String actualitle = Driver.get().getTitle();

        Assert.assertEquals(expectedSubtitle,actualitle);
    }

    @When("the user clicks on the movie {int} in the Top Rated Movies")
    public void theUserClicksOnTheMovieNumberInTheTopRatedMovies(int selectMovieNumber) {

        topPage.getSelectedMovie(selectMovieNumber);
    }

    @And("the title is {string} and {int}")
    public void theTitleIs(String expetedTitle, int num) {

        String actualMovieTitleText = topPage.getSelectedMovie(num).getText();

        topPage.getSelectedMovie(num).click();

        Assert.assertEquals(expetedTitle,actualMovieTitleText);
    }

    @Then("the page returns the {string} selected")
    public void thePageReturnsTheSelected(String expectedTitleTextSeleted) {

        String actualMovieTitleTextSelected = topPage.getMovieTitleText();

        Assert.assertEquals(expectedTitleTextSeleted,actualMovieTitleTextSelected);
    }

    @When("the user sorts movies by the {string}")
    public void theUserSortsMoviesByThe(String expectedOptionSortedBy) {

        topPage.sortBy(expectedOptionSortedBy);
    }

    @And("the user clicks on the movie {int} in the Top Rated Movies By Genre")
    public void theUserClicksOnTheMovieIndexGenreInTheTopRatedMoviesByGenre(int selectedGenre) {

        topPage.getGender(selectedGenre).click();
    }

    @Then("the user navigates to the page {string}")
    public void theUserNavigatesToThePage(String expectedTitle) {

        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
