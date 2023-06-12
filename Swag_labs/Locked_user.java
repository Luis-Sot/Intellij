package Swag_labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locked_user {

    public static void main(String[] args) {

        System.setProperty("webdriver..chrome.driver", "C:\\chromedriver_win32.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Igual usando "ID"  //
    }
}
/*
Accepted usernames are:
locked_out_user

Password for all users:
secret_sauce
 */