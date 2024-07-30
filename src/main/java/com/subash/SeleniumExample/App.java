package com.subash.SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.print(driver.getTitle());
        System.out.println(driver.getPageSource());
        //driver.switchTo().alert()
        //driver.navigate().to("http://sangam.relevantz.com");
//        driver.manage().addCookie(null);
        
        driver.findElement(By.name("q")).sendKeys("Selenium Tutorial");
        driver.findElement(By.name("btnK")).submit();
    }
}
