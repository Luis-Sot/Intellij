package Swag_labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem_user {

    public static void main(String[] args) {

        System.setProperty("webdriver..chrome.driver", "C:\\chromedriver_win32.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Aca se que se debe reportar las imagenes de los productos que estan repetidas //
    }
}
/*
Accepted usernames are:
problem_user

Password for all users:
secret_sauce
 */