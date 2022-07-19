package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_LoginPage;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;

public class D02_loginStepDef {
    SoftAssert soft;
    P02_LoginPage login = new P02_LoginPage();
    @Given("user go to login page")
    public void goLoginPage()
    {
        login.gotoLogin().click();
    }
    @When("^user login with this data \"(.*)\" and \"(.*)\"$")
    public void login_data(String email,String password)
    {
        login.loginCreditional(email,password);
    }
   @And("user press on login button")
   public void pressLoginButton()
   {
       login.pressLoginBtn().click();
   }
    @Then("user login to the system successfully")
    public void successLoginAssertions()
    {
        soft =new SoftAssert();
        soft.assertEquals("https://demo.nopcommerce.com/",login.CurrentUrl());
        String expctedResult = "My account";
        String actualResult = login.myAccountTab().getText();
        System.out.println("Massage:"+actualResult);
        soft.assertTrue(actualResult.contains(expctedResult));
        soft.assertAll();
    }
    @Then("user could not login to the system")
    public void unSuccessLoginAssertions()
    {
        soft =new SoftAssert();
        String expctedResult = "Login was unsuccessful.";
        String actualResult = login.unSuccessMassage().getText();
        System.out.println("Massage:"+actualResult);
        soft.assertTrue(actualResult.contains(expctedResult));
        String expctedResult2 = "#e4434b";
        String actualResult2 = login.unSuccessMassage().getCssValue("color");
        String actualColor = Color.fromString(actualResult2).asHex();
        System.out.println("color:"+actualColor);
        soft.assertTrue(actualColor.contains(expctedResult2));
        soft.assertAll();
    }
}
