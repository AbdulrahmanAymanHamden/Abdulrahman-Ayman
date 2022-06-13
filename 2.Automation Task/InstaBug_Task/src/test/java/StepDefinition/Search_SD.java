package StepDefinition;

import Pages.Hooks;
import Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

public class Search_SD {
    SearchPage searchPage = new SearchPage();
    SoftAssert soft = new SoftAssert();

    //**************************************************** Scenario 1 ******************************************/

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
        String page_URL = "https://www.google.com/search?q=linkedin&hl=ar&sxsrf=ALiCzsb8Wbrvux4IQa55ak3JkdAV6JMawg%3A1655070167668&ei=112mYs61KJrP7_UPgpakwAw&oq=lin&gs_lcp=Cgdnd3Mtd2l6EAMYATIECCMQJzIECCMQJzIRCC4QgAQQsQMQgwEQxwEQ0QMyEQguEIAEELEDEIMBEMcBENEDMgQILhBDMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMggIABCABBCxAzILCAAQgAQQsQMQgwE6BwgAEEcQsAM6BwgAELADEEM6EgguEMcBENEDEMgDELADEEMYAToMCC4QyAMQsAMQQxgBOgYIIxAnEBM6CAguEIAEELEDOgQILhADOg4ILhCABBCxAxCDARDUAjoLCC4QsQMQgwEQ1AI6CAguELEDEIMBOgoILhDHARDRAxBDSgQIQRgASgQIRhgAULcFWLAIYLERaANwAXgAgAGvAYgB-gOSAQMwLjOYAQCgAQHIAQvAAQHaAQQIARgI&sclient=gws-wiz";
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains(page_URL));
        soft.assertAll();
    }

    //**************************************************** Scenario 2 ******************************************/

    @When("user Enters a subtext into search box")
    public void User_Enter_SubText() throws InterruptedException {
        searchPage.Search_Box().sendKeys("Lin");
        Thread.sleep(3000);
    }

    @Then("A drop down menu should appears with suggestions related to the subtext")
    public void Drop_Menu_Appears() throws InterruptedException {
        soft.assertTrue(searchPage.Search_Menu().isDisplayed());
        soft.assertTrue(searchPage.Search_Suggestions().getText().contains("Lin"));
        soft.assertAll();
        Thread.sleep(3000);
    }

    //**************************************************** Scenario 3 ******************************************/


    @And("User selects one of the suggestions")
    public void Select_suggestion()
    {
        searchPage.Search_Suggestions().click();
    }

    @And("User should directed to the coressponding page")
    public void User_Go_to_sugPage()
    {
        User_Directed_To_SearchResults();
    }

    ////******************************************** Scenario 4 ************************************************/

    @Given("user clicked on Google Keyboard")
    public void User_Click_Google_Keyboard() throws InterruptedException {
        searchPage.Keyboard_Icon().click();
        Thread.sleep(2000);
    }

    @Then("Google Keyboard should appear and user can use it in writing")
    public void Google_Keyboard_Appear() throws InterruptedException {
        soft.assertTrue(searchPage.Keyboard().isDisplayed());
        soft.assertAll();
        Thread.sleep(2000);
    }

    //****************************************** Scenario 5 *********************************************/
    @Given("user clicked on Microphone icon")
    public void Click_on_MicroPhone()
    {
        searchPage.MicrophoneIcon().click();
    }

    @Then("User should directed to Microphone page")
    public void Navigate_to_Microphone_Page() throws InterruptedException {
        soft.assertTrue(searchPage.MicrophonePage().isDisplayed());
        soft.assertAll();
        Thread.sleep(2000);
    }

    //*************************************** Scenario 6 *********************************/
    @Given("User Clicked on English link to search in English")
    public void User_Click_on_English_Link() throws InterruptedException {
        searchPage.English_Link().click();
        Thread.sleep(2000);
    }
    @Then("User should navigate to English Engine of google")
    public void User_Navigate_To_English_Engine()
    {
        soft.assertTrue(searchPage.Country_Name().getText().contains("Egypt"));
        soft.assertAll();
    }

    @Given("User Clicked on Arabic link to search in Arabic")
    public void User_Click_on_Arabic_Link() throws InterruptedException {
        searchPage.Arabic_Link().click();
        Thread.sleep(2000);
    }
    @Then("User should navigate to Arabic Engine of google")
    public void User_Navigate_To_Arabic_Engine()
    {
        soft.assertEquals(searchPage.Country_Name().getText(),"مصر");
        soft.assertAll();
    }


}
