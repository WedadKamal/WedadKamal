package org.example.stepDefs;

import com.fawry.TicketsMall.angularAutomation.constants.GeneralConstants;
import com.fawry.TicketsMall.angularAutomation.tests.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef extends BaseTest {

    public String actualResults;
    P03_homePage homePageObj = new P03_homePage(driver);

    @When("user select wishlist button ❤ on this product \"HTC One M8 Android L 5.0 Lollipop\"")
    public void clickingOnHTCWishList()
    {
        homePageObj.clickOnHTCWishList();

    }

    @Then("success message \"The product has been added to your wishlist\" with green background color appears")
    public void getSuccessMsg()
    {
        actualResults=  homePageObj.getWishListSuccessMsg();

        SoftAssert assertObj = new SoftAssert();

        assertObj.assertEquals(actualResults,"The product has been added to your wishlist",
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert success message.");
        actualResults=  homePageObj.getWishListMsgBackColor();

        assertObj.assertEquals(actualResults,"#4bb07a",
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert success message color.");
        assertObj.assertAll();

    }

    @And("user select wishlist tap after success Message disappears")
    public void clickOnWishListTap()
    {
        homePageObj.clickOnWishListTap();

    }

    @Then("user could get quantity value from wish list tap")
    public void getQuantityValue()
    {
        actualResults=  homePageObj.getQuantityValue();
        int quantity = Integer.valueOf(actualResults);

        SoftAssert assertObj = new SoftAssert();

        assertObj.assertTrue(quantity>0,
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert quantity value to be bigger than zero.");
        assertObj.assertAll();

    }
}
