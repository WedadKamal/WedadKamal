package org.example.stepDefs;

import com.fawry.TicketsMall.angularAutomation.constants.GeneralConstants;
import com.fawry.TicketsMall.angularAutomation.tests.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D07_followUsStepDef extends BaseTest {


    public String actualResults;
    P03_homePage homePageObj = new P03_homePage(driver);

    @When("user opens facebook link")
    public void clickingOnFacebookIcon()
    {
        homePageObj.clickOnFacebook();

    }
    @When("user opens twitter link")
    public void clickingOnTwitterIcon()
    {
        homePageObj.clickOnTwitter();

    }
    @When("user opens rss link")
    public void clickingOnRssIcon()
    {
        homePageObj.clickOnRss();

    }
    @When("user opens youtube link")
    public void clickingOnYoutubeIcon()
    {
        homePageObj.clickOnYoutube();

    }

    @Then("^\"(.*)\" is opened in new tab$")
    public void getSecondTap(String url)
    {
        actualResults=  homePageObj.navigateToSecondTap();

        SoftAssert assertObj = new SoftAssert();

        Assert.assertEquals(actualResults,url,
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert page url for navigated second tap.");
        assertObj.assertEquals(actualResults,url,
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert page url for navigated second tap.");

        assertObj.assertAll();

    }


    @Then("^\"(.*)\" is opened in new tab for RSS$")
    public void getFirstTap(String url)
    {
        actualResults=  homePageObj.getCurrentUrl();

        SoftAssert assertObj = new SoftAssert();

        Assert.assertEquals(actualResults,url,
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert page url for navigated second tap.");

        assertObj.assertAll();

    }

}
