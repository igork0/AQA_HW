package lab10.StackOverflow.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bAboutPO {
    WebDriver driver;
    public bAboutPO(WebDriver driver) {
        this.driver = driver;
    }
    public void bAbout() {
        WebElement aboutB=driver.findElement(By.xpath("//*[@class='-marketing-link js-gps-track']"));
        aboutB.click();
    }
}
