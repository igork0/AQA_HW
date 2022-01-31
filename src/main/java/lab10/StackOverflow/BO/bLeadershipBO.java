package lab10.StackOverflow.BO;


import io.qameta.allure.Step;
import lab10.PropertiUtil.Driver;
import lab10.StackOverflow.PO.bLeadershipPO;
import org.openqa.selenium.WebDriver;

public class bLeadershipBO {
    @Step
    public boolean bleadership() {
        WebDriver driver = Driver.getInstance().getDriver();
        driver.get("https://stackoverflow.com/");
        bLeadershipPO leadershipPO = new bLeadershipPO(driver);
        leadershipPO.bAbout();

        return true;
    }
}
