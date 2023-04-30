package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingTextBox
{
    @Test
    public void test() throws Exception
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.get("https://github.com/login");
        Thread.sleep(1000);
        driver.findElement(By.id("login_field"));
        WebElement usernameText=driver.findElement(By.id("login_field"));
        if(usernameText.isDisplayed())
        {
            if (usernameText.isEnabled())
            {
                usernameText.sendKeys("joshitha@gmail.com");
                System.out.println(usernameText.getAttribute("value"));
                Thread.sleep(3000);
                usernameText.clear();
            } else
            {
                System.err.println("TextBox is not enabled");
            }
        }
        else
        {
            System.err.println("TextBox is not displayed");
        }
    }
}