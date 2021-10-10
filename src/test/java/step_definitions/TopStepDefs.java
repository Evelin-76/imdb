package step_definitions;

import POM.TopPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.ConfigurationReader;

public class TopStepDefs {
    TopPage topPage = new TopPage();

    @Given("the user is on the {string}")
    public void theUserIsOnThe(String expectedSubtitle) {
        Driver.get().get(ConfigurationReader.get("url"));

        String actualitle = Driver.get().getTitle();
        System.out.println(actualitle);

        Assert.assertEquals(expectedSubtitle,actualitle);

    }

    @When("the user clicks on the movie {int} in the Top Rated Movies")
    public void theUserClicksOnTheMovieNumberInTheTopRatedMovies(int selectMovieNumber) {
        topPage.getSelectedMovie(selectMovieNumber);
    }

    @And("the title is {string} and {int}")
    public void theTitleIs(String expetedTitle, int num) {
        String actualMovieTitleText = topPage.getSelectedMovie(num).getText();
        System.out.println(actualMovieTitleText);
        System.out.println(expetedTitle);
        topPage.getSelectedMovie(num).click();


        Assert.assertEquals(expetedTitle,actualMovieTitleText);

    }

    @Then("the page returns the {string} selected")
    public void thePageReturnsTheSelected(String expectedTitleTextSeleted) {
        String actualMovieTitleTextSelected = topPage.getMovieTitleText();
        System.out.println(actualMovieTitleTextSelected);
        System.out.println(expectedTitleTextSeleted);
        Assert.assertEquals(expectedTitleTextSeleted,actualMovieTitleTextSelected);

    }
}