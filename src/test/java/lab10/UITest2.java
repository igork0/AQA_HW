package lab10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


// CHROME DRIVER FILE
public class UITest2 {
    @Test
    public void googleSearch() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.ua/");
        WebElement searchField=driver.findElement(By.name("q"));
        searchField.sendKeys("My First Test");
        WebElement buttonSubmit = driver.findElement(By.name("btnK"));
        buttonSubmit.submit();
        WebElement actual = driver.findElement(By.id("result-stats"));
        WebElement expected = driver.findElement(By.id("result-stats"));
        Assert.assertEquals(expected.toString(),actual.toString());
    }
}