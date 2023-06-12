package Swag_labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bci2 {

    public static void  main (String[] args) throws InterruptedException {

        String URL = ("https://www.bci.cl.");
        System.setProperty("webdriver..chrome.driver", "C:\\chromedriver_win32.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.findElement(By.xpath("(//*[@class='nav__item'])[4]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class='form-group mb-4']/input")).sendKeys("256657597");
        driver.findElement(By.xpath("//*[@class='inner-password']/input")) .sendKeys("adm258.");
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        Thread.sleep(3000);
        String mensaje = driver.findElement(By.xpath("//*[@id='mensaje2']")).getText();
        System.out.println(mensaje);
        driver.quit();




    }
}
