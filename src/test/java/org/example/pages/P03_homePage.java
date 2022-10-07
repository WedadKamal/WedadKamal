package org.example.pages;

import com.fawry.TicketsMall.angularAutomation.constants.GeneralConstants;
import com.fawry.TicketsMall.angularAutomation.pages.MainPage;
import com.fawry.TicketsMall.angularAutomation.utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class P03_homePage extends MainPage {
    public P03_homePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id="customerCurrency")
    WebElement currencyDropDown;

    @FindBy(xpath="//option[text()='Euro']")
    WebElement euroSelected;

    @FindBy(id="small-searchterms")
    WebElement searchBox;

    @FindBy(xpath="//button[@type='submit']")
    WebElement searchBtn;

    @FindBy(xpath="//span[contains(text(),'€')]")
    List<WebElement> euroSign;


    @FindBy(xpath="//*[@class='product-title']//a")
    List<WebElement> productResult;

 @FindBy(xpath="//*[@class='top-menu notmobile']//li//ul[@class='sublist first-level']//li")
    List<WebElement> mainCategoriesSubCategories;

    @FindBy(xpath="//div[@class='picture']//img")
    WebElement productImg;

    @FindBy(xpath="//div[@class='sku']//span[@class='value']")
    WebElement productSKU;

    @FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersCategory;

  @FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement elecotronicsCategory;

  @FindBy(xpath="//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")
    WebElement pparelCategory;

  @FindBy(xpath="//ul[1][@class='top-menu notmobile']//a[normalize-space()='Desktops']")
    WebElement computerDesktop;

  @FindBy(xpath="//ul[1][@class='top-menu notmobile']//a[normalize-space()='Notebooks']")
    WebElement computerNotbooks;

  @FindBy(xpath="//ul[1][@class='top-menu notmobile']//a[normalize-space()='Software']")
    WebElement computerSoftware;

  @FindBy(xpath="//ul[1][@class='top-menu notmobile']//a[normalize-space()='Camera & photo']")
    WebElement electronicsCamera;

  @FindBy(xpath="//ul[1][@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement electronicsCellPhones;

  @FindBy(xpath="//ul[1][@class='top-menu notmobile']//a[normalize-space()='Others']")
    WebElement electronicsOthers;

  @FindBy(xpath="//ul[1][@class='top-menu notmobile']//a[normalize-space()='Shoes']")
    WebElement apparelShoes;

  @FindBy(xpath="//ul[1][@class='top-menu notmobile']//a[normalize-space()='Clothing']")
    WebElement apparelClothing;

  @FindBy(xpath="//ul[1][@class='top-menu notmobile']//a[normalize-space()='Accessories']")
    WebElement apparelAccessories;

    @FindBy(xpath="//h1")
    WebElement pageTitle;

    @FindBy(xpath="//body/div[@class='master-wrapper-page']/div[@class='master-wrapper-content']/div[@class='master-column-wrapper']/div[@class='center-1']/div[@class='page home-page']/div[@class='page-body']/div[@class='slider-wrapper theme-custom']/div[@id='nivo-slider']/a[2]")
    WebElement iphoneSlider;

    @FindBy(xpath="//body/div[@class='master-wrapper-page']/div[@class='master-wrapper-content']/div[@class='master-column-wrapper']/div[@class='center-1']/div[@class='page home-page']/div[@class='page-body']/div[@class='slider-wrapper theme-custom']/div[@id='nivo-slider']/a[1]")
    WebElement nokiaSlider;

    @FindBy(xpath="//a[text()='Facebook']")
    WebElement facebook;

    @FindBy(xpath="//a[text()='Twitter']")
    WebElement twitter;

    @FindBy(xpath="//a[text()='RSS']")
    WebElement RSS;

    @FindBy(xpath="//a[text()='YouTube']")
    WebElement youtube;

    @FindBy(xpath="//div[@data-productid='18']//button[@class='button-2 add-to-wishlist-button']")
    WebElement HTCWishList;

    @FindBy(xpath="//div[@id='bar-notification']//div//p[@class='content']")
    WebElement WishListSuccessMsg;


    @FindBy(xpath="//div[@class='bar-notification success']")
    WebElement WishListSuccessMsgclass;


    @FindBy(xpath="//span[text()='Wishlist']")
    WebElement WishListTap;

    @FindBy(xpath="//input[@class='qty-input']")
    WebElement wishListQuantity;



    public void selectEuroCurrency() {
        try {

            currencyDropDown.click();
            euroSelected.click();
          Thread.sleep(3000);

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

    public void clickOnWishListTap() {
        try {

            WebDriverWait wait=new WebDriverWait(driver, 7);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//span[text()='Wishlist']")));

            scrollIntoViewAndClick(WishListTap);

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

    public String getQuantityValue() {
        String quantityValue;
        try {

            WebDriverWait wait=new WebDriverWait(driver, 7);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//input[@class='qty-input']")));

            quantityValue= wishListQuantity.getAttribute("value");

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

        return quantityValue;
    }



    public String getWishListSuccessMsg() {
        String SuccessMsg;
        try {
            SuccessMsg= WishListSuccessMsg.getText();

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

        return SuccessMsg;
    }

    public String getPageTitle() {
        String pagetitle;
        try {

            pagetitle= pageTitle.getText();

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

        return pagetitle;
    }
    public String getWishListMsgBackColor() {
        String unSuccessColor;
        try {

            unSuccessColor=  Color.fromString(WishListSuccessMsgclass.getCssValue("background-color")).asHex();

            System.out.println(WishListSuccessMsgclass.getCssValue("background-color"));
            System.out.println(unSuccessColor);
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

    public void clickOnNokiaSlider() {

        try {

            WebDriverWait wait=new WebDriverWait(driver, 7);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//body/div[@class='master-wrapper-page']/div[@class='master-wrapper-content']/div[@class='master-column-wrapper']/div[@class='center-1']/div[@class='page home-page']/div[@class='page-body']/div[@class='slider-wrapper theme-custom']/div[@id='nivo-slider']/a[1]")));

         //   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            nokiaSlider.click();

        //    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


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
    public void clickOnFacebook() {

        try {

            scrollIntoViewAndClick(facebook);


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
    public void clickOnTwitter() {

        try {

            scrollIntoViewAndClick(twitter);

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
    public void clickOnRss() {

        try {

            scrollIntoViewAndClick(RSS);

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
    public void clickOnYoutube() {

        try {

            scrollIntoViewAndClick(youtube);

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
    public void clickOnHTCWishList() {

        try {

            scrollIntoViewAndClick(HTCWishList);
            Thread.sleep(3000);

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

    public void clickOnIphoneSlider() {

        try {


            WebDriverWait wait=new WebDriverWait(driver, 7);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//body/div[@class='master-wrapper-page']/div[@class='master-wrapper-content']/div[@class='master-column-wrapper']/div[@class='center-1']/div[@class='page home-page']/div[@class='page-body']/div[@class='slider-wrapper theme-custom']/div[@id='nivo-slider']/a[2]")));

           // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            iphoneSlider.click();

          //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


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

    public List <WebElement> getFirstThreeMainCategory() {
        List <WebElement> threeMainCat = new ArrayList<>();
        try {
            scrollIntoView(computersCategory);

            threeMainCat.add(computersCategory);
            threeMainCat.add(elecotronicsCategory);
            threeMainCat.add(pparelCategory);

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }
        return threeMainCat;

    }
    public List <WebElement> getComputerSubCategories() {
        List <WebElement> computerList = new ArrayList<>();
        try {

            computerList.add(computerDesktop);
            computerList.add(computerNotbooks);
            computerList.add(computerSoftware);

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }
        return computerList;

    }
    public List <WebElement> getElectronicsSubCategories() {
        List <WebElement> electronicsList = new ArrayList<>();
        try {


            electronicsList.add(electronicsCamera);
            electronicsList.add(electronicsCellPhones);
            electronicsList.add(electronicsOthers);

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }
        return electronicsList;

    }
    public List <WebElement> getApparelSubCategories() {
        List <WebElement> apparelList = new ArrayList<>();
        try {

            apparelList.add(apparelShoes);
            apparelList.add(apparelClothing);
            apparelList.add(apparelAccessories);

        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }
        return apparelList;

    }


    public String  getTheHoveredAndSelectedSubCategory() {
        String selectedCategoryText;
        String selectedSubCategoryText = null;
        try {

            Actions actions=new Actions(driver);
            List <WebElement> threeMainCategory = getFirstThreeMainCategory();
            int count = threeMainCategory.size();
            System.out.println("count is "+count);
            int min = 0;
            int max = count-1;
            int selectedCategory = (int)Math.floor(Math.random()*(max-min+1)+min);
            actions.moveToElement(threeMainCategory.get(selectedCategory)).perform();
             selectedCategoryText = threeMainCategory.get(selectedCategory).getText();
            System.out.println("to know which category is selected:   " +selectedCategoryText);


            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            switch (selectedCategoryText)
            {
                case "Computers":

                    List <WebElement> computerList = getComputerSubCategories();
                    int subCategoryCount = computerList.size();
                    System.out.println("profile links " + subCategoryCount);
                    System.out.println(computerList.get(0).getText());
                    System.out.println(computerList.get(1).getText());
                    System.out.println(computerList.get(2).getText());
                    max = subCategoryCount -1;
                    int selectedSubCategory = (int) Math.floor(Math.random() * (max - min + 1) + min);
                    selectedSubCategoryText = computerList.get(selectedSubCategory).getText();
                    System.out.println(selectedSubCategoryText);
                    computerList.get(selectedSubCategory).click();

                    break;
                case "Electronics":

                    List <WebElement> electronicsList = getElectronicsSubCategories();
                    subCategoryCount = electronicsList.size();
                    System.out.println("profile links " + subCategoryCount);
                    System.out.println(electronicsList.get(0).getText());
                    System.out.println(electronicsList.get(1).getText());
                    System.out.println(electronicsList.get(2).getText());
                    max = subCategoryCount -1;
                     selectedSubCategory = (int) Math.floor(Math.random() * (max - min + 1) + min);
                    selectedSubCategoryText = electronicsList.get(selectedSubCategory).getText();
                    System.out.println(selectedSubCategoryText);
                    electronicsList.get(selectedSubCategory).click();

                    break;

                case "Apparel":

                    List <WebElement> apparelList = getApparelSubCategories();
                    subCategoryCount = apparelList.size();
                    System.out.println("profile links " + subCategoryCount);
                    System.out.println(apparelList.get(0).getText());
                    System.out.println(apparelList.get(1).getText());
                    System.out.println(apparelList.get(2).getText());
                    max = subCategoryCount -1;
                    selectedSubCategory = (int) Math.floor(Math.random() * (max - min + 1) + min);
                    selectedSubCategoryText = apparelList.get(selectedSubCategory).getText();
                    System.out.println(selectedSubCategoryText);
                    apparelList.get(selectedSubCategory).click();
                    break;

            }
            


            // reset it to the initial value
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


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

        return selectedSubCategoryText;
    }





    public String getProductSku() {
        String SKU;
        try {

            scrollIntoView(productSKU);
           SKU= productSKU.getText();

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

        return SKU;
    }


    public void clickOnProduct() {
        try {

           scrollIntoViewAndClick(productImg);

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

    public void navigateToSearchPage() {
        try {
            String url="https://demo.nopcommerce.com/apple-macbook-pro-13-inch" ;
            driver.navigate().to(url);
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
    public String navigateToSecondTap() {
        String secondTapUrl;
        try {


            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            if(tabs.size()>1){

                WebDriverWait wait = new WebDriverWait(driver,5);
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));

            //2- get window list inside array

            System.out.println(tabs.size());

            //3- switch from tab 0 to tab 1
            driver.switchTo().window(tabs.get(1));
            secondTapUrl= driver.getCurrentUrl();}
            else {

                secondTapUrl= driver.getCurrentUrl();
            }

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

        return secondTapUrl;
    }
    public void searchWithProductName(String name) {
        try {

            setTextValue(searchBox,name);
            searchBtn.click();
            Thread.sleep(3000);
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
        String url;
        try {
            driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
              url= driver.getCurrentUrl();
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

        return url;
    }
    public List<String> getProductListResult() {

        List<String> productNameList = new ArrayList<String>();
        try {

              for(int i = 0 ; i < productResult.size(); i++)
              {
                  productNameList.add( productResult.get(i).getText());

              }
        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);


        }

        return productNameList;
    }

    public List<String> getEuroSignList() {
        List<String> euroList = new ArrayList<String>();
        try {

            for (int i = 0 ; i< euroSign.size();i++){

                euroList.add(euroSign.get(i).getText());
            }


        } catch (Exception e) {
            Log.error("Error occurred in " + new Object() {
            }
                    .getClass().getName() + "." + new Object() {
            }
                    .getClass()
                    .getEnclosingMethod()
                    .getName(), e);

        }

        return euroList;
    }


}
