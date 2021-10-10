Feature: Top movies
Background:
    Given the user is on the "IMDb"

  Scenario Outline: The user selects a movie from the list
    When the user clicks on the movie <number> in the Top Rated Movies
    And the title is "<title>" and <number>
    Then the page returns the "<movie>" selected

    Examples:
      | number | title    | movie    |
      | 250    | Ratsasan | Ratsasan |
#      | 249    | Rififi   | Rififi   |
