package org.example.stepDefs;

import com.fawry.TicketsMall.angularAutomation.constants.GeneralConstants;
import com.fawry.TicketsMall.angularAutomation.tests.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;


public class D01_registerStepDef extends BaseTest {

  public String actualResults;
    P01_register regPageObj = new P01_register(driver);


    @Given("user go to register page")
    public void goRegisterPage()
    {

        regPageObj.clickRegisterButton();

    }

    @When("user select gender type")
    public void selectGenderType()
    {
        regPageObj.selectGenderType();

    }

    @And("user enter first name \"automation\" and last name \"tester\"")
    public void fillFirstAndLastName()
    {
        regPageObj.fillFirstAndLastName();
    }

    @And("user enter date of birth")
    public void fillDateOfBirth()
    {
        regPageObj.fillDateOfBirth();
    }

    @And("user enter email \"test@example.com\" field")
    public void fillEmail()
    {
        regPageObj.fillEmail();
    }

    @And("user fills Password fields \"P@ssw0rd\" \"P@ssw0rd\"")
    public void fillPasswordFields()
    {
        regPageObj.fillPasswordFields();
    }

    @And("user clicks on register button")
    public void clickingOnRegisterBtnAfter()
    {
        regPageObj.clickRegisterBtnAfterFilling();
    }

    @Then("success message is displayed")
    public void getSuccessMsg()
    {
        SoftAssert assertObj = new SoftAssert();
        actualResults = regPageObj.getSuccessMsg();
        assertObj.assertEquals(actualResults, GeneralConstants.SUCCESS_MSG_REGISTERATION,
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert in success message.");
        actualResults= regPageObj.getSuccessMsgColor();
        System.out.println(actualResults);
        assertObj.assertEquals(actualResults, GeneralConstants.SUCCESS_MSG_COLOR,
                GeneralConstants.POM_EXCEPTION_ERR_MSG + " While assert in success message color.");

        assertObj.assertAll();

    }



}
