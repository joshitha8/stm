package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomationUsingCssSelector
{
    @Test
    public void test()
    {
        System.out.println("Program is Running");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://github.com/login");

        driver.findElement(By.cssSelector("input[id='login_field']")).sendKeys("Joshitha");
        //driver.findElement(By.cssSelector("#login_field")).sendKeys("Joshitha");
        highlight(driver,driver.findElement(By.cssSelector("input[id='login_field']")));

        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Joshi@21");
        //driver.findElement(By.cssSelector("#password")).sendKeys("Joshi@21");
        highlight(driver,driver.findElement(By.cssSelector("input[id='password']")));

        driver.findElement(By.cssSelector("input[type='submit']")).click();

        String str= driver.findElement(By.cssSelector("div[class='js-flash-alert']")).getText();

        System.out.println(str);
    }

    public static void highlight(WebDriver driver, WebElement element)
    {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", element);
    }

}
