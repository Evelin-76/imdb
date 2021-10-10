Feature: Western Genre
  Background:
    Given the user is on the "IMDb"
    And the user clicks on the movie index 21  in the Top Rated Movies By Genre

    Scenario Outline: Navigate between Sort by options
      And the user clicks on the "<option>" in Sort by options
      Then the "<subtitle>" is diplayed in the page
      Examples:
        | option              | subtitle                                                                                      |
        | Popularity          | Feature Film, Rating Count at least 25,000, Western (Sorted by Popularity Ascending)          |
        | A-Z                 | Feature Film, Rating Count at least 25,000, Western (Sorted by Title Ascending)               |
        | User Rating         | Feature Film, Rating Count at least 25,000, Western (Sorted by IMDb Rating Ascending)         |
        | Number of Votes     | Feature Film, Rating Count at least 25,000, Western (Sorted by Number of Votes Ascending)     |
        | US Box Office       | Feature Film, Rating Count at least 25,000, Western (Sorted by US Box Office Ascending)       |
        | Runtime             | Feature Film, Rating Count at least 25,000, Western (Sorted by Runtime Ascending)             |
        | Year                | Feature Film, Rating Count at least 25,000, Western (Sorted by Year Ascending)                |
        | Release Date        | Feature Film, Rating Count at least 25,000, Western (Sorted by Release Date Ascending)        |
        | Date of Your Rating | Feature Film, Rating Count at least 25,000, Western (Sorted by Date of Your Rating Ascending) |
        | Your Rating         | Feature Film, Rating Count at least 25,000, Western (Sorted by Date of Your Rating Ascending) |



