package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepDefs.Hooks.driver;

public class P01_RegistrationPage {
    public WebElement gotoregister()
    {
        WebElement gotoregisterBtn = driver.findElement(By.className("ico-register"));
        return gotoregisterBtn;

    }
    public WebElement firstNamePOM()
    {
     By firstName =By.id("FirstName");
        WebElement firstNameEle =driver.findElement(firstName);
       return firstNameEle;
    }
    public WebElement lastNamePOM()
    {
        By lastName =By.id("LastName");
        WebElement lastNameEle =driver.findElement(lastName);
        return lastNameEle;
    }
    public WebElement emailPOM()
    {
        By email =By.id("Email");
        WebElement emailEle =driver.findElement(email);
        return emailEle;
    }

    public WebElement passwordPOM()
    {
        By password =By.id("Password");
        WebElement passwordEle =driver.findElement(password);
        return passwordEle;
    }
    public WebElement confirmPasswordPOM()
    {
        By confirmPassword =By.id("ConfirmPassword");
        WebElement confirmPasswordEle =driver.findElement(confirmPassword);
        return confirmPasswordEle;
    }
    public void  birthDate()
    {
        WebElement dayList = driver.findElement(By.name("DateOfBirthDay"));
        Select selectDay = new Select(dayList);
        selectDay.selectByVisibleText("12");
        WebElement monthList = driver.findElement(By.name("DateOfBirthMonth"));
        Select selectMonth = new Select(monthList);
        selectMonth.selectByValue("3");
        WebElement yearList = driver.findElement(By.name("DateOfBirthYear"));
        Select selectYear = new Select(yearList);
        selectYear.selectByVisibleText("1990");
    }
    public void registernames(String firstName,String lastName)
    {
        firstNamePOM().sendKeys(firstName);
        lastNamePOM().sendKeys(lastName);
    }
    public void registeremail(String email)
    {
        emailPOM().sendKeys(email);
    }

    public void fillngPassword(String password , String confirmPassword)
    {
        passwordPOM().sendKeys(password);
        confirmPasswordPOM().sendKeys(confirmPassword);
    }
    public WebElement submitRegistration()
    {
        WebElement submitRegistrationBtn=driver.findElement(By.id("register-button"));
        return submitRegistrationBtn;
    }
    public WebElement successMassageAssertion()
    {
        WebElement element =driver.findElement(By.className("result"));
        return element;
    }
    public WebElement genderRadio()
    {
        WebElement genderMaleRadio=driver.findElement(By.id("gender-male"));
        return genderMaleRadio;
    }

}
