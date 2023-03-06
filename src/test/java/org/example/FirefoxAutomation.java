package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxAutomation
{
    @Test
    public void firefoxtest()
    {
        System.out.println("Program Running");

        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","C:/Users/Admin/Desktop/epam/firefoxdriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.github.com/login");
        System.out.println(driver.getTitle());

        driver.findElement(By.id("login_field")).sendKeys("Joshitha");
        highlight(driver,driver.findElement(By.id("login_field")));

        driver.findElement(By.name("password")).sendKeys("joshi21");
        highlight(driver,driver.findElement(By.name("password")));

        //driver.findElement(By.name("commit")).click();
        //highlight(driver,driver.findElement(By.name("commit")));

        //driver.findElement(By.className("header-logo"));
        //highlight(driver,driver.findElement(By.className("header-logo")));

        //driver.findElement(By.linkText("Forgot password?")).click();
        //highlight(driver,driver.findElement(By.linkText("Forgot password?")));

        //driver.findElement(By.partialLinkText("Create an account")).click();
        //highlight(driver,driver.findElement(By.linkText("Create an account?")));

        //driver.findElement(By.tagName("h1"));
        //highlight(driver,driver.findElement(By.tagName("h1")));


    }
    public static void highlight(WebDriver driver, WebElement element)
    {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", element);
    }
}