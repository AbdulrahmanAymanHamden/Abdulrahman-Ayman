package StepDefinition;

import Pages.Hooks;
import Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;

public class Search_SD {

    SearchPage searchPage = new SearchPage();

    @Given("user clicked on the search box")
    public void User_Click_SearchBox()
    {
        searchPage.Search_Box().click();
    }

    @When("user enters a text to search for")
    public void User_Enter_Text() throws InterruptedException {
        searchPage.Search_Box().sendKeys("Linkedin");
        Thread.sleep(3000);
    }

    @And("user clicks Enter Key")
    public void User_Click_SearchButton() throws InterruptedException {
        searchPage.Search_Box().sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @Then("User should directed to page displays the result of the search")
    public void User_Directed_To_SearchResults()
    {
        softAssert
        String page_URL = "https://www.google.com/search?q=linkedin&hl=ar&sxsrf=ALiCzsb8Wbrvux4IQa55ak3JkdAV6JMawg%3A1655070167668&ei=112mYs61KJrP7_UPgpakwAw&oq=lin&gs_lcp=Cgdnd3Mtd2l6EAMYATIECCMQJzIECCMQJzIRCC4QgAQQsQMQgwEQxwEQ0QMyEQguEIAEELEDEIMBEMcBENEDMgQILhBDMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMggIABCABBCxAzILCAAQgAQQsQMQgwE6BwgAEEcQsAM6BwgAELADEEM6EgguEMcBENEDEMgDELADEEMYAToMCC4QyAMQsAMQQxgBOgYIIxAnEBM6CAguEIAEELEDOgQILhADOg4ILhCABBCxAxCDARDUAjoLCC4QsQMQgwEQ1AI6CAguELEDEIMBOgoILhDHARDRAxBDSgQIQRgASgQIRhgAULcFWLAIYLERaANwAXgAgAGvAYgB-gOSAQMwLjOYAQCgAQHIAQvAAQHaAQQIARgI&sclient=gws-wiz";
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains(page_URL));
    }

}
