package lab10.StackOverflow.BO;

import io.qameta.allure.Step;
import lab10.PropertiUtil.Driver;
import lab10.StackOverflow.PO.bAboutPO;
import org.openqa.selenium.WebDriver;

public class bAboutBO {
    @Step
    public boolean babout() {
        WebDriver driver = Driver.getInstance().getDriver();
        driver.get("https://stackoverflow.com/");
        bAboutPO aboutPO = new bAboutPO(driver);
        aboutPO.bAbout();

        return true;
    }
}
