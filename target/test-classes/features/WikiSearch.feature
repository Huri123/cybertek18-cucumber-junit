@wiki  # bu tag i Features in basina yani en basa koyarsan butun scenario lari run eder.
Feature: Wiki title and search verifications

  Background: User is on the Wiki home page
    Given User is on the Wiki home page


  Scenario: Search functionality title verification
    When User searches "Steve Jobs" in the wiki search page
    Then User should see "Steve Jobs" in the wiki title

  Scenario: Search functionality header verification
    When User searches "Steve Jobs" in the wiki search page
    Then User should see "asdfgh" in the main header

  #Scenario: Search functionality header verification
  #  When User searches "Steve Jobs" in the wiki 1 search page buna Alt+enter yapinca, WikiStepDefinition da String ve int kabul eden bos bir metod olusturdu.cunku 1 ekledik. o da int verdi
  #  Then User should see "Steve Jobs" in the main header

  @wikiScenarioOutline
  Scenario Outline: Search functionality header verification
    When User searches "<searchValue>" in the wiki search page
    Then User should see "<expectedTitle>" in the wiki title
    Then User should see "<expectedMainHeader>" in the main header
    Then User should see "<expectedImageHeader>" in the image header

    Examples: example test data for wikipedia search
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | John Travolta   | John Travolta   | John Travolta      | John Travolta       |
      | Albert Einstein | asdfghjjkklll   | Albert Einstein    | Albert Einstein     |
      | Keanu Reeves    | Keanu Reeves    | Keanu Reeves       | Keanu Reeves        |
      | Bruce Lee       | Bruce Lee       | Bruce Lee          | Bruce Lee           |
      | Dua Lipa        | Dua Lipa        | Dua Lipa           | Dua Lipa            |
      | Thomas Edison   | Thomas Edison   | Thomas Edison      | Thomas Edison       |
      | Sam Heughan     | Sam Heughan     | Sam Heughan        | Sam Heughan         |