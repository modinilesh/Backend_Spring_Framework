package com.selenium.selenium;

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
       System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Google Chrome.lnk");
       WebDriver driver = new ChromeDriver();
       
       driver.manage().window().maximize();
       
       driver.get("https://www.cricbuzz.com/");
    
    }
}
