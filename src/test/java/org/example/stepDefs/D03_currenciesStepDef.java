package org.example.stepDefs;

import com.fawry.TicketsMall.angularAutomation.constants.GeneralConstants;
import com.fawry.TicketsMall.angularAutomation.tests.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D03_currenciesStepDef extends BaseTest {

    public String actualResults;
    P03_homePage homePageObj = new P03_homePage(driver);


    @When("Select Euro currency from the dropdown list on the top left of home page")
    public void selectEuroCurrency()
    {

        homePageObj.selectEuroCurrency();

    }


    @Then("Euro Symbol is shown on the 4 products displayed in Home page")
    public void checkEuroSymbolShown()
    {

        SoftAssert softassertobj = new SoftAssert();


        List<String> productsPrice =homePageObj.getEuroSignList();
        for (int i =0; i< productsPrice.size(); i++)
        {

            Assert.assertTrue(productsPrice.get(i).contains("€"),GeneralConstants.POM_EXCEPTION_ERR_MSG + "while assert Product Price contains €");
            softassertobj.assertTrue(productsPrice.get(i).contains("€"),GeneralConstants.POM_EXCEPTION_ERR_MSG + "while assert Product Price contains €");

        }

        softassertobj.assertAll();
    }
}
