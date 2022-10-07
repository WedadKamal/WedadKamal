package org.example.pages;

import com.fawry.TicketsMall.angularAutomation.constants.GeneralConstants;
import com.fawry.TicketsMall.angularAutomation.pages.MainPage;
import com.fawry.TicketsMall.angularAutomation.utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

public class P02_login extends MainPage {
    public P02_login(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//a[text()='Log in']")
    WebElement loginBtn;

    @FindBy(id="Email")
    WebElement email;

    @FindBy(id="Password")
    WebElement password;

    @FindBy(xpath="//button[@class='button-1 login-button']")
    WebElement loginBtnAfter;

    @FindBy(xpath="//a[@class='ico-account']")
    WebElement myAccount;

    @FindBy(xpath="//div[@class='message-error validation-summary-errors']")
    WebElement getUnSuccessMsg;

    public void clickLoginButton() {
        try {


            scrollIntoViewAndClick(loginBtn);

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
    public void fillLoginData(String emailValue, String passwordValue) {
        try {


            setTextValue(email,emailValue);
            setTextValue(password,passwordValue);

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
    public void clickLoginBtnnAfter() {
        try {


            scrollIntoViewAndClick(loginBtnAfter);

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
    public String getCurrentUrl() {
        String URL;
        try {


            URL= driver.getCurrentUrl();

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
        return URL;
    }
    public String getMyAccount() {
        String myAccountVar;
        try {


            myAccountVar= myAccount.getText();

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
        return myAccountVar;
    }
    public String getUnSuccessMsg() {
        String unSuccess;
        try {


            unSuccess= getUnSuccessMsg.getText();

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
        return unSuccess;
    }
    public String getUnSuccessMsgColor() {
        String unSuccessColor;
        try {

            unSuccessColor=  Color.fromString(getUnSuccessMsg.getCssValue("color")).asHex();

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
        return unSuccessColor;
    }


}
