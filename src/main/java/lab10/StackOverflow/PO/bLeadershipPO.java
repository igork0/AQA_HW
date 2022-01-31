package lab10.StackOverflow.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bLeadershipPO {
    WebDriver driver;
    public bLeadershipPO(WebDriver driver) {
        this.driver = driver;
    }
    public void bAbout() {
        WebElement aboutB=driver.findElement(By.xpath("//*[@class='-marketing-link js-gps-track']"));
        aboutB.click();
    }
    public void bLeadership() {
        WebElement leadershipB=driver.findElement(By.xpath("//*[@id='product-lob-nav']/nav/a[2]"));
        leadershipB.click();
    }
    public void title(){
        WebElement txtOfTitle=driver.findElement(By.xpath("//*[@id='content']/div[3]/header/h1"));
        txtOfTitle.getText().contains("Stack Overflow leadership team");
    }
}
