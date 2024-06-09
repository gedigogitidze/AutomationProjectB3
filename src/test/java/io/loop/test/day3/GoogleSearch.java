package io.loop.test.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Navigate to Google search
 * maximize the page
 * get title of the page
 * get url of the page
 * validate the title, expected title is "Google"
 * validate the url of the page, expected url is "https://www.google.com/"
 * close the brower
 */
public class GoogleSearch {
    public static void main(String[] args) {
        // in selenium 3 we had to set up the driver, for that we need webdrivermanager libreries
        //create driver object
        WebDriver driver = new ChromeDriver();

        // navigate to google
        driver.get("https://www.google.com");

        //maximize
        driver.manage().window().maximize();

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Actual title: "+actualTitle+", matches expected title: "+expectedTitle +". => TEST PASS");
        }else {
            System.err.println("Actual title: "+actualTitle+", DOES NOT MATCH expected title: "+expectedTitle +". => TEST FAILED");
        }
      //  System.out.println(driver.getCurrentUrl());
        String expectedURL = "https://www.google.com";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("Actual URL: "+actualURL+", matches expected URL: "+expectedURL+". => TEST PASS");

        }else {
            System.err.println("Actual URL: "+actualURL+", DOES NOT MATCH expected URL: "+expectedURL+". => TEST FAILED");
        }

        driver.quit();



    }
}
