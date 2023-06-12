package Swag_labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bci {

    public static void  main(String[] args) throws InterruptedException {

        String URL = ("https://www.bci.cl.");
        By errormessage = By.xpath("//*[@class='error-message']/span");
        System.setProperty("webdriver..chrome.driver", "C:\\chromedriver_win32.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.findElement(By.id("intro-step2")).click();
        Thread.sleep(5000);
        WebElement Rut = driver.findElement(By.id("rut_aux"));
        Rut.sendKeys("2");
        String myText = driver.findElement(errormessage).getText();
        //driver.findElement(By.id("rut_aux")).sendKeys("2");
        //String myText = driver.findElement(By.xpath("//*[@class='error-message']/span")).getText();
        System.out.println(myText);
        driver.quit();

    }

}