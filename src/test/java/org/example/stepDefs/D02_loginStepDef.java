package org.example.stepDefs;

import com.fawry.TicketsMall.angularAutomation.constants.GeneralConstants;
import com.fawry.TicketsMall.angularAutomation.tests.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;


public class D02_loginStepDef extends BaseTest {

    public String actualResults;
    P02_login loginPageObj = new P02_login(driver);


    @Given("user go to login page")
    public void goLoginPage()
    {

        loginPageObj.clickLoginButton();

    }

    @When("^user login with \"(.*)\" \"(.*)\" and \"(.*)\"$")
    public void enterValidEmailAndPassword(String validation,String email, String password)
    {

       if(validation=="valid") {
           System.out.println("valid data");

       }else if(validation=="invalid") {
           System.out.println("invalid data");
       }

            loginPageObj.fillLoginData(email,password);


    }
    @And("user press on login button")
    public void clickingOnLoginBtnAfter()
    {

        loginPageObj.clickLoginBtnnAfter();

    }
    @Then("user login to the system successfully")
    public void getURLAndMyaccount()
    {

        SoftAssert assertObj = new SoftAssert();
        actualResults = loginPageObj.getCurrentUrl();
        assertObj.assertEquals(actualResults, GeneralConstants.ECOMMERCE_URL,
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert in ecommerce url.");
        actualResults= loginPageObj.getMyAccount();
        assertObj.assertEquals(actualResults, GeneralConstants.MY_ACCOUNT,
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert in my account.");

        assertObj.assertAll();

    }

    @Then("user could not login to the system")
    public void getUnsuccessfulMsg()
    {

        loginPageObj.getUnSuccessMsg();

        SoftAssert assertObj = new SoftAssert();
        actualResults = loginPageObj.getUnSuccessMsg();
        assertObj.assertEquals(actualResults, "Login was unsuccessful. Please correct the errors and try again.\n" +
                        "No customer account found",
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert in unsuccessful message.");
        actualResults = loginPageObj.getUnSuccessMsgColor();
        assertObj.assertEquals(actualResults, "#e4434b" ,
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert in unsuccessful message color.");
        assertObj.assertAll();

    }
}
