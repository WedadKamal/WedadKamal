package org.example.stepDefs;

import com.fawry.TicketsMall.angularAutomation.constants.GeneralConstants;
import com.fawry.TicketsMall.angularAutomation.tests.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class D04_searchStepDef extends BaseTest {


    public String actualResults;
    P03_homePage homePageObj = new P03_homePage(driver);
    @Given("user navigates to SearchPage")
    public void navigateToSearchPage()
    {
        homePageObj.navigateToSearchPage();
    }

    @When("^user could search using product \"(.*)\"$")
    public void searchWithProductName(String name)
    {
        homePageObj.searchWithProductName(name);

    }

    @Then("^user navigated to another search link with product \"(.*)\"$")
    public void checkNavigatedToAnotherSearchLink(String name)
    {

        SoftAssert assertObj = new SoftAssert();

        actualResults= homePageObj.getCurrentUrl();
        assertObj.assertTrue(actualResults.contains("https://demo.nopcommerce.com/search?q="),
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert the current url.");
        List<String> productNames =homePageObj.getProductListResult();
        SoftAssert softassertobj = new SoftAssert();
        for (int i =0; i< productNames.size(); i++)
        {

            if(productNames.get(i).contains(name)) {
                softassertobj.assertTrue(productNames.get(i).contains(name),
                        GeneralConstants.POM_EXCEPTION_ERR_MSG + "while assert Product name in the product list");
                System.out.println("productnamesassame" +productNames.get(i));
            }
            if(productNames.get(i).contains(name.toLowerCase())) {

            softassertobj.assertTrue(productNames.get(i).contains(name.toLowerCase()),
                    GeneralConstants.POM_EXCEPTION_ERR_MSG + "while assert Product name in the product list");
                System.out.println("productnamewithsmall" +productNames.get(i));
            }
            softassertobj.assertAll();

        }
    }

    @Then("^selected product \"(.*)\" is shown$")
    public void checkSelectedProductContainsSKU(String SKU)
    {

        SoftAssert assertObj = new SoftAssert();

        actualResults= homePageObj.getProductSku();
        Assert.assertEquals(actualResults,SKU,
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert product SKU.");

        assertObj.assertEquals(actualResults,SKU,
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert product SKU.");
        assertObj.assertAll();


    }
    @And("user could click on product")
    public void clickOnProduct()
    {
        homePageObj.clickOnProduct();}
}
