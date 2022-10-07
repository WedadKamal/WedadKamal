package org.example.pages;

import com.fawry.TicketsMall.angularAutomation.constants.GeneralConstants;
import com.fawry.TicketsMall.angularAutomation.pages.MainPage;
import com.fawry.TicketsMall.angularAutomation.utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P01_register extends MainPage {
    public P01_register(WebDriver driver) {
        super(driver);
    }



    @FindBy(xpath="//a[text()='Register']")
    WebElement registerBtn;

     @FindBy(id="gender-female")
    WebElement genderType;

     @FindBy(id="FirstName")
    WebElement firstName;

     @FindBy(id="LastName")
    WebElement lastName;

     @FindBy(id="Email")
    WebElement email;

     @FindBy(id="Password")
    WebElement password;

     @FindBy(id="ConfirmPassword")
    WebElement confirmPassword;

     @FindBy(xpath="//select[@name='DateOfBirthDay']")
    WebElement birthDay;

     @FindBy(xpath="//select[@name='DateOfBirthDay']//option[text()='5']")
    WebElement optionBirthDay;

     @FindBy(xpath="//select[@name='DateOfBirthMonth']")
    WebElement birthMonth;

     @FindBy(xpath="//select[@name='DateOfBirthMonth']//option[text()='February']")
    WebElement optionBirthMonth;

     @FindBy(xpath="//select[@name='DateOfBirthYear']")
    WebElement birthYear;

     @FindBy(xpath="//select[@name='DateOfBirthYear']//option[text()='1994']")
    WebElement optionBirthYear;

     @FindBy(id="register-button")
    WebElement registerBtnAfter;

     @FindBy(xpath="//div[text()='Your registration completed']")
    WebElement successMsgRegisteration;






    public void clickRegisterButton() {
        try {


            scrollIntoViewAndClick(registerBtn);

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }
    }
    public void selectGenderType() {
        try {

            genderType.click();

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }

    }
    public void fillFirstAndLastName() {
        try {

            setTextValue(firstName,"automation");
            setTextValue(lastName,"tester");

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }

    }
    public void fillDateOfBirth() {
        try {

            birthDay.click();
            optionBirthDay.click();
            birthMonth.click();
            optionBirthMonth.click();
            birthYear.click();
            optionBirthYear.click();

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }

    }
    public void fillEmail() {
        try {

            setTextValue(email,"test@example.com");
        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }

    }
    public void fillPasswordFields() {
        try {

            setTextValue(password,"P@ssw0rd");
            setTextValue(confirmPassword,"P@ssw0rd");

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }

    }
    public void clickRegisterBtnAfterFilling() {
        try {

            scrollIntoViewAndClick(registerBtnAfter);

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }

    }
    public String getSuccessMsg() {

        String successMsg;
        try {

            successMsg= successMsgRegisteration.getText();

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

            return GeneralConstants.FAILED;
        }

        return successMsg;
    }
    public String getSuccessMsgColor() {

        String successMsgColor;
        try {


            successMsgColor=  successMsgRegisteration.getCssValue("color");

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

            return GeneralConstants.FAILED;
        }

        return successMsgColor;
    }


}
