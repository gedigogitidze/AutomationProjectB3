package io.loop.test.homework;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
task 1
=============
go to https://loopcamp.vercel.app/forgot-password.html
locate 5 elements, forgot password, email, email input, retrieve password, powered by LOOPCAMP
use css
verify those elements are displayed

 */
public class HwWithIgor extends TestBase {
    @Test public void taskOne() {
        driver.get("https://loopcamp.vercel.app/forgot-password.html");
//        WebElement elementOne = driver.findElement(By.xpath("//h2[contains(text(),'Forgot Password')]"));
//        // validated the existence
//        elementOne.isDisplayed();
//
//        WebElement elementTwo = driver.findElement(By.xpath("//label[@for='email']"));
//
//        if(elementTwo.isDisplayed()){
//            System.out.println("Element Identified");
//        }else System.out.println("NOT THERE");
//
//        System.out.println(elementTwo.isDisplayed());
//
//        WebElement elementThree = driver.findElement(By.xpath("//input[@type='text']"));
//        elementThree.isDisplayed();
//
        WebElement elementFour = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        elementFour.isDisplayed();

        System.out.println(elementFour.isDisplayed());


    }

}
