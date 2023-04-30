package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingCheckBox
{

    public static void main(String[] args)
    {

        String exePath = ("C:/Users/Admin/Desktop/epam/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", exePath);
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();


        WebElement checkBoxSelected = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        boolean isSelected = checkBoxSelected.isSelected();
        // performing click operation if element is not selected
        if(isSelected == false)
        {
            checkBoxSelected.click();
        }


        WebElement checkBoxDisplayed = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        boolean isDisplayed = checkBoxDisplayed.isDisplayed();
        // performing click operation if element is displayed
        if (isDisplayed == true)
        {
            checkBoxDisplayed.click();
        }

        /**
         * Validate isEnabled and click
         */
        WebElement checkBoxEnabled = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        boolean isEnabled = checkBoxEnabled.isEnabled();
        // performing click operation if element is enabled
        if (isEnabled == true)
        {
            checkBoxEnabled.click();
        }

    }

}