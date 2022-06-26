package com.expertautomationteam;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tatia\\IdeaProjects\\Test Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
        System.out.println(driver.getTitle());
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Swag Labs", title);
        //^this is the real testing
        driver.close();
    }

    @Test
    public void test2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tatia\\IdeaProjects\\Test Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Swag Labs", title);

        WebElement usernameField = driver.findElement(By.id("user-name"));

        // you can find an element with id, css, etc. (there are 8 ways to find an element)
        //if you want to check if the webelement is visible (usernamefield_ you need to write,
        usernameField.isDisplayed();
        //-> this will be a boolean bc this will check true or false

        boolean userFieldIsDisplayed = usernameField.isDisplayed();
        System.out.println(userFieldIsDisplayed);
        Assert.assertTrue(userFieldIsDisplayed);

        //you can write all of this ^^ in one line
        Assert.assertTrue(driver.findElement(By.id("user-name")).isDisplayed());

//checking the passwordField
        WebElement passwordField = driver.findElement(By.id("password"));
        boolean passwordFieldIsDisplayed = passwordField.isDisplayed();
        System.out.println(passwordFieldIsDisplayed);
        Assert.assertTrue(passwordFieldIsDisplayed);

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        boolean loginBtnIsDisplayed = loginBtn.isDisplayed();
        System.out.println(loginBtnIsDisplayed);
        Assert.assertTrue(loginBtnIsDisplayed);

//the by.id is from id: ___ in inspection
        driver.close();


    }

    @Test
    public void test3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tatia\\IdeaProjects\\Test Selenium\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
        String title = driver.getTitle();
        System.out.println("login page title : " + title);
        Assert.assertEquals("Swag Labs", title);

        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");
        System.out.println("username entered");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
        System.out.println("password entered");

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();
        System.out.println("click on login button success");

        WebElement header = driver.findElement(By.className("title"));
        String headerText = header.getText();
        System.out.println("header text: " + headerText);
        Assert.assertEquals("PRODUCTS", headerText);
        driver.close();

    }
}