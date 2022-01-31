package lab10.StackOverflow.BO;

import io.qameta.allure.Step;
import lab10.PropertiUtil.Driver;
import lab10.StackOverflow.PO.bPressPO;
import org.openqa.selenium.WebDriver;




public class bPressBO {
    @Step
    public boolean bpress() {
        WebDriver driver = Driver.getInstance().getDriver();
        driver.get("https://stackoverflow.com/");
        bPressPO pressPO = new bPressPO(driver);
        pressPO.bAbout();
        pressPO.bPress();
        pressPO.title();

        return true;
    }

}