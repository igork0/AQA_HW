package lab10.StackOverflow.PO;


import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;

public class bPressPO {
    WebDriver driver;
    public bPressPO(WebDriver driver) {
        this.driver = driver;
    }
    public void bAbout() {
        WebElement aboutB=driver.findElement(By.xpath("//*[@class='-marketing-link js-gps-track']"));
        aboutB.click();
    }
    public void bPress() {
        WebElement pressB=driver.findElement(By.xpath("//*[@id='product-lob-nav']/nav/a[5]"));
        pressB.click();
    }
    public void title(){
        WebElement txtOfTitle=driver.findElement(By.xpath("//*[@id='content']/div[3]/header/h1"));
        txtOfTitle.getText().contains("About Stack Overflow");
    }
}