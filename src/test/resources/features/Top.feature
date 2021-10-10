Feature: Top movies
Background:
    Given the user is on the "IMDb"

  Scenario Outline: Select a movie from the list
    When the user clicks on the movie <number> in the Top Rated Movies
    And the title is "<title>" and <number>
    Then the page returns the "<movie>" selected
    Examples:
      | number | title    | movie    |
      | 250    | Ratsasan | Ratsasan |
#      | 249    | Rififi   | Rififi   |

  Scenario Outline: Sort movies by the options
    When the user sorts movies by the "<options>"
    And the user clicks on the movie <number> in the Top Rated Movies
    And the title is "<title>" and <number>
    Then the page returns the "<movie>" selected
    Examples:
      | options           | number | title    | movie    |
      | IMDb Rating       | 250    | Ratsasan | Ratsasan |
      | Release Date      | 250    | El chico | El chico |
      | Number of Ratings | 250    | Z        | Z        |
      | Your Rating       | 250    | Ratsasan | Ratsasan |

    Scenario Outline: Sort movies by the Genre
    When the user sorts movies by the "<options>"
    And the user clicks on the movie <indexGenre> in the Top Rated Movies By Genre
    Then the user navigates to the page "<subtitle>"
    Examples:
      | options           | indexGenre | subtitle   |
      | IMDb Rating       | 21    | Feature Film, Rating Count at least 25,000, Western (Sorted by IMDb Rating Descending) - IMDb |
      | Release Date      | 21    | Feature Film, Rating Count at least 25,000, Western (Sorted by IMDb Rating Descending) - IMDb |
      | Number of Ratings | 21    | Feature Film, Rating Count at least 25,000, Western (Sorted by IMDb Rating Descending) - IMDb        |
      | Your Rating       | 21    | Feature Film, Rating Count at least 25,000, Western (Sorted by IMDb Rating Descending) - IMDb |

