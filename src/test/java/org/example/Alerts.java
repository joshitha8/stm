package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.io.IOException;
import java.sql.SQLOutput;

public class Alerts
{

    public static void main(String[] args) throws Exception
    {

        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        // Alert Box
        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(2000);
        driver.findElement(By.id("alertBox")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("output")).getText());



        // Confirm Box
        //System.out.println(driver.findElement(By.id("output")).getText());
        // Thread.sleep(2000);
        // driver.findElement(By.id("confirmBox")).click();
        // Thread.sleep(2000);
        // System.out.println(driver.switchTo().alert().getText());
        // Thread.sleep(2000);
        // driver.switchTo().alert().accept();
        // Thread.sleep(2000);
        // System.out.println(driver.findElement(By.id("output")).getText());
        // System.out.println(driver.findElement(By.id("output")).getText());
        //  Thread.sleep(2000);
        //driver.findElement(By.id("confirmBox")).click();
        // Thread.sleep(2000);
        //  System.out.println(driver.switchTo().alert().getText());
        // Thread.sleep(2000);
        // driver.switchTo().alert().dismiss();
        // Thread.sleep(2000);
        //System.out.println(driver.findElement(By.id("output")).getText());



        // Prompt Box
        //.out.println(driver.findElement(By.id("output")).getText());
        //Thread.sleep(2000);
        //driver.findElement(By.id("promptBox")).click();
        // Thread.sleep(2000);
        // System.out.println(driver.switchTo().alert().getText());
        //Thread.sleep(2000);
        //driver.switchTo().alert().sendKeys("Sabitha");
        // driver.switchTo().alert().accept();
        // Thread.sleep(2000);
        // System.out.println(driver.findElement(By.id("output")).getText());
        // driver.findElement(By.id("promptBox")).click();
        //System.out.println(driver.switchTo().alert().getText());
        // Thread.sleep(2000);
        // driver.switchTo().alert().dismiss();
        // Thread.sleep(2000);
        // System.out.println(driver.findElement(By.id("output")).getText());
        //Thread.sleep(2000);




    }
}