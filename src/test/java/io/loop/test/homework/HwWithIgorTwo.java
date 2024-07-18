package io.loop.test.homework;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

/*
login to docuport application
logout from docuport application
Validate successful login
Validate successful logout
 */
public class HwWithIgorTwo extends TestBase {

    @Test
    public void docuportSample() throws InterruptedException {
        driver.get("https://beta.docuport.app/login?redirect=%2F");
        WebElement elementLogIn = driver.findElement(By.xpath("//input[contains(@id, 'input-14')]"));  ////input[contains(@id, 'input-14')]
        elementLogIn.sendKeys("b1g3_client@gmail.com");

        WebElement elementPassword = driver.findElement(By.xpath("//input[@id='input-15']"));
        elementPassword.sendKeys("Group3");
        WebElement logInClick = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        logInClick.click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); also wait command
        Thread.sleep(3000);
        WebElement continueButton = driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
        continueButton.click();

        WebElement homePageValidation = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
        homePageValidation.isDisplayed();

        WebElement elementBatchBox = driver.findElement(By.xpath("//span[contains(text(),'Batch1 Group3')]"));
        elementBatchBox.click();
        Thread.sleep(3000);
        WebElement logOutDocu = driver.findElement(By.xpath("//span[contains(text(), 'Log out')]"));
        logOutDocu.click();

        WebElement elementValidateOut = driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
        elementValidateOut.isDisplayed();

        System.out.println(elementValidateOut.isDisplayed());




    }


}
