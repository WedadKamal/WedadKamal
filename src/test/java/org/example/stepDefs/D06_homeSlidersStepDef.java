package org.example.stepDefs;

import com.fawry.TicketsMall.angularAutomation.constants.GeneralConstants;
import com.fawry.TicketsMall.angularAutomation.tests.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D06_homeSlidersStepDef extends BaseTest {

    public String actualResults;
    P03_homePage homePageObj = new P03_homePage(driver);
    @When("user could select Nokia slider")
    public void clickingOnNokiaSlider()
    {
        homePageObj.clickOnNokiaSlider();

    }

    @When("user could select iphone slider")
    public void clickingOnIphoneSlider()
    {
        homePageObj.clickOnIphoneSlider();

    }

    @Then("user navigated to Nokia page successfully")
    public void getNokiaPageUrl()
    {
      actualResults=  homePageObj.getCurrentUrl();

        SoftAssert assertObj = new SoftAssert();

        assertObj.assertEquals(actualResults,"https://demo.nopcommerce.com/nokia-lumia-1020",
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert page url for nokia page.");

        assertObj.assertAll();

    }

    @Then("user navigated to iphone page successfully")
    public void getIphonePageUrl()
    {
      actualResults=  homePageObj.getCurrentUrl();

        SoftAssert assertObj = new SoftAssert();

        assertObj.assertEquals(actualResults,"https://demo.nopcommerce.com/iphone-6",
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert page url for Iphone page.");

        assertObj.assertAll();

    }
}
