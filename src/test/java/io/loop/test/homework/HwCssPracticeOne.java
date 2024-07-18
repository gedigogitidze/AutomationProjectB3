package io.loop.test.homework;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HwCssPracticeOne extends TestBase {
/*
  go to docuport app
    identify docuport with css
    get value of the attribute
    validate if it is "Docuport"

    the rest is home work
    locate:
    username
    password
    login
        with css
    login to docuport
    locate home icon of docuport after login or any other element after login
    validated that you logged in
 */
    @Test
    public void validateByCss() {
        driver.navigate().to("https://beta.docuport.app/login?redirect=%2F");
        WebElement elementDocuportValid = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));
        String actualAtt = elementDocuportValid.getAttribute("alt").trim();
        String expectedAtt = "Docuport";

        if (actualAtt.equals(expectedAtt)){
            System.out.println("success");
        }else System.out.println("A BIG FAIL");




    }

}
