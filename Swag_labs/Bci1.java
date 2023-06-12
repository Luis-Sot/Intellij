package Swag_labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bci1 {

    public static void  main(String[] args) throws InterruptedException {

        String URL = ("https://www.bci.cl.");
        System.setProperty("webdriver..chrome.driver", "C:\\chromedriver_win32.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.findElement(By.id("intro-step2")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class='form-group mb-4']/input")).sendKeys("209118811");
        String myText = driver.findElement(By.xpath("//*[@class='error-message']/span")).getText();
        System.out.println(myText);
        driver.quit();


    }


}
