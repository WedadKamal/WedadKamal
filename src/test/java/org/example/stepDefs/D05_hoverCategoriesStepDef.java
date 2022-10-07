package org.example.stepDefs;

import com.fawry.TicketsMall.angularAutomation.constants.GeneralConstants;
import com.fawry.TicketsMall.angularAutomation.tests.BaseTest;
import com.fawry.TicketsMall.angularAutomation.utils.Log;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Locale;

public class D05_hoverCategoriesStepDef extends BaseTest {


    public String actualResults;
    P03_homePage homePageObj = new P03_homePage(driver);
    @When("user select and hover random sub category from selected main category")
    public void hoverAndSelectRandomMainCategory()
    {
        actualResults= homePageObj.getTheHoveredAndSelectedSubCategory();


    }

    @Then("user navigated to sub category page successfully")
    public void getSubCategoryTitle()
    {

        String pageTitle= homePageObj.getPageTitle();
        //  String actualPageTitle= pageTitle.toLowerCase().trim();

        SoftAssert assertObj = new SoftAssert();

        assertObj.assertEquals(actualResults,pageTitle,
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert page Title for SubCategory.");

        assertObj.assertAll();
    }
}
