package io.loop.test.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        // Setting up the web driver

        //if you use older version then you need dependency for webdrivermanager - boni garica

        //create
        WebDriver driver = new ChromeDriver();

        //maximize the window
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        //navigate to the web page
        driver.get("https://www.loopcamp.io");
        Thread.sleep(5000);
        driver.navigate().to("https://www.etsy.com");

        // navigate back
        driver.navigate().back();


        //navigate forward
        driver.navigate().forward();

        // refresh
        driver.navigate().refresh();

        //quit and close
      //  driver.close();
        driver.quit();





    }


}
