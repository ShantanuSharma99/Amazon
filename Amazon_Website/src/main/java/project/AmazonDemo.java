package project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {
 public static   WebDriver  driver ;
    public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");

 WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
 searchbox.sendKeys("Iphone 14 Max");
 searchbox.submit();
 driver.findElement(By.linkText("Apple iPhone 14 Pro Max (128 GB) - Deep Purple")).click();


    }
}
