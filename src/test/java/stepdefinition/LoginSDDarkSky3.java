package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HomePageDarkSky3DarkSkay3;
import framework.LoginPageDarkSky3;
import org.testng.Assert;

/**
 * Created by Irina on 11/20/2019.
 */
public class LoginSDDarkSky3 {

    private HomePageDarkSky3DarkSkay3 homePage = new HomePageDarkSky3DarkSkay3 ();
    @Given("^I am on Darksky home page$")
    public void siAmOnHomePage() { }



    @Then("^I verify timeline is displayed with two hours incremented$")
    public void verifyTimeLineisDisplayed() { HomePageDarkSky3DarkSkay3.TimeLineisDisplayed(); }

}


