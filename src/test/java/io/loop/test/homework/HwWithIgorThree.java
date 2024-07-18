package io.loop.test.homework;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
navigate to docuport application
validate placeholders for user name and password
without sending username and password click login button
validate username and password error messages
 */
public class HwWithIgorThree extends TestBase {

    @Test
    public void validateTesting() throws InterruptedException {
        driver.get("https://beta.docuport.app/login?redirect=%2F");
        WebElement elementLoginValid = driver.findElement(By.xpath("//input[@id='input-14']"));
        elementLoginValid.isDisplayed();

        WebElement elementPassValid = driver.findElement(By.xpath("//input[@id='input-15']"));
        elementPassValid.isDisplayed();

        WebElement elementClickLogin = driver.findElement(By.xpath("//span[contains(text(),' Log in ')]"));
        elementClickLogin.click();
        Thread.sleep(5000);

        WebElement elementEmailReEnter = driver.findElement(By.xpath("//div[contains(text(),'Please enter your username or email address')]"));
        elementEmailReEnter.isDisplayed();

        WebElement elementPasswordReEnter = driver.findElement(By.xpath("//div[contains(text(),'Please enter your password')]"));
        elementPasswordReEnter.isDisplayed();


    }
}
