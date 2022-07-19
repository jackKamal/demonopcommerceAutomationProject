package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef {
    SoftAssert soft;
    P03_homePage homePage = new P03_homePage();

    @When("click on wishlist button for HTC One M8 Android L 5.0 Lollipop")
    public void clickOnWishListBtn() throws InterruptedException {
        homePage.addingToWishListBtn().click();
        Thread.sleep(3000);
    }

    @Then("assertion for wishlist message and background color")
    public void wishListAssertion() {
        soft = new SoftAssert();
        String expctedResult = "The product has been added to your wishlist";
        String actualResult = homePage.wishListSuccessMassage().getText();
        System.out.println("Massage:" + actualResult);
        soft.assertTrue(actualResult.contains(expctedResult));
        String expctedResult2 = "#4bb07a";
        String actualResult2 = homePage.wishListSuccessMassage().getCssValue("background-color");
        String actualBackGroundColor = Color.fromString(actualResult2).asHex();
        System.out.println("color:" + actualBackGroundColor);
        soft.assertTrue(actualBackGroundColor.contains(expctedResult2));
        soft.assertAll();
    }

    @And("click on wishlist icon")
    public void clickOnWishListIcon() throws InterruptedException {
        homePage.explicitWait();
        homePage.wishListIcon().click();
        Thread.sleep(3000);
    }
    @Then("assert number for item selected more than zero")
    public void checkWishListQty()
    {
        String qty = homePage.getQtyNumberOfWishList().getAttribute("value");
        try{
            Integer qtyInt = Integer.valueOf(qty);
            System.out.println(qtyInt);
            Assert.assertTrue(qtyInt>0);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
       // Assert.assertTrue();

    }
}
