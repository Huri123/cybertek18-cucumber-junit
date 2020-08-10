package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiStepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();
    /*
    TC#25: Wikipedia Search Functionality Title Verification
    1. User is on Wikipedia home page
    2. User types Steve Jobs in the wiki search box
    3. User clicks wiki search button
    4. User sees Steve Jobs is in the wiki title
    Note: Follow POM
     */
    @Given("User is on the Wiki home page")
    public void user_is_on_the_wiki_home_page() {

        Driver.getDriver().get("https://www.wikipedia.org");
    }


    @When("User searches {string} in the wiki search page")
    public void user_searches_in_the_wiki_search_page(String string) {

        wikiSearchPage.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("User should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String expectedInTitle) {

        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    @Then("User should see {string} in the main header")
    public void user_should_see_in_the_main_header(String expected) {

        String actualHeaderText=wikiSearchPage.mainHeaderAfterSearch.getText();

        Assert.assertEquals(actualHeaderText, expected);
    }

    /*bununla attaki @Then ayni
    @Then("User should see {string} in the image header")
    public void userShouldSeeInTheImageHeader(String expectedHeader) {

        String actualHeader = wikiSearchPage.imageHeaderAfterSearch.getText();
        Assert.assertEquals(actualHeader,expectedHeader);
    }
     */

    @Then("User should see {string} in the image header")
    public void userShouldSeeInTheImageHeader(String arg) throws InterruptedException{ //arg yenine istedigini yazabilirsin

        String actualHeader = wikiSearchPage.imageHeaderAfterSearch.getText();
        String expectedHeader = arg; //parantez icindeki arg.
        Thread.sleep(2000);
        Assert.assertEquals(actualHeader, expectedHeader);
    }

     //   @When("User searches {string} in the wiki {int} search page")
    //    public void userSearchesInTheWikiSearchPage(String arg0, int arg1) {
    //    }
}
/*
Gurhan'in Kodlari:

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiStepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on the Wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {

        Driver.getDriver().get("https://www.wikipedia.org");

    }


    @When("User searches {string} in the wiki search page")
    public void user_searches_in_the_wiki_search_page(String string) {

        wikiSearchPage.searchBox.sendKeys(string + Keys.ENTER);

    }

    @Then("User should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String expectedInTitle) {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

    @Then("User should see {string} in the main header")
    public void userShouldSeeInTheMainHeader(String expected) {

        String actualHeaderText = wikiSearchPage.mainHeaderAfterSearch.getText();

        Assert.assertEquals(actualHeaderText, expected);

    }

    @Then("User should see {string} in the image header")
    public void userShouldSeeInTheImageHeader(String arg) throws InterruptedException {

        String actualHeader = wikiSearchPage.imageHeaderAfterSearch.getText();
        String expectedHeader = arg;
        Thread.sleep(2000);
        Assert.assertEquals(actualHeader, expectedHeader);

    }




//    @When("User searches {string} in the wiki {int} search page")
//    public void userSearchesInTheWikiSearchPage(String arg0, int arg1) {
//    }
}
*/
