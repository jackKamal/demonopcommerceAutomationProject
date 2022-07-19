package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_RegistrationPage;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    SoftAssert soft;

    P01_RegistrationPage register = new P01_RegistrationPage();

    @Given("user go to register page")
    public void goRegisterPage()
    {
        register.gotoregister().click();
    }
@When("user select gender type")
    public void selectGender()
{
    register.genderRadio().click();
}
@And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void enterusername(String firstName,String lastName) throws InterruptedException {
register.registernames(firstName,lastName);
    Thread.sleep(1000);
}
   @And("user enter date of birth")
    public void enterDateOfBirth() throws InterruptedException {
       register.birthDate();
       Thread.sleep(1000);
   }
   @And("user enter email \"(.*)\" field$")
    public void enterEmail(String email) throws InterruptedException {
       register.registeremail(email);
       Thread.sleep(1000);

   }

   @And("^user fills Password fields \"(.*)\" and Confirm password \"(.*)\"$")
    public void fillPassword(String password , String confirmPassword) throws InterruptedException {
       register.fillngPassword(password,confirmPassword);
       Thread.sleep(1000);
   }
   @Then("user clicks on register button")
    public void registerButton()
   {
       register.submitRegistration().click();
   }
   @And("success message is displayed")
    public void successMassage()
   {
       soft =new SoftAssert();
       String expctedResult = "Your registration completed";
       String actualResult = register.successMassageAssertion().getText();
       System.out.println("Massage:"+actualResult);
       soft.assertTrue(actualResult.contains(expctedResult));
       String expctedResult2 = "rgba(76, 177, 124, 1)";
       String actualResult2 = register.successMassageAssertion().getCssValue("color");
       soft.assertTrue(actualResult2.contains(expctedResult2));
       System.out.println("color:"+actualResult2);
       soft.assertAll();
   }
}

