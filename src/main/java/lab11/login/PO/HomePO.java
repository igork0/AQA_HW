package lab11.login.PO;


import io.qameta.allure.Step;
import lab11.decorator.ClickButtonElement;
import lab11.login.BasicPO;
import org.openqa.selenium.support.FindBy;

public class HomePO extends BasicPO {

    @FindBy(xpath = "//*[@data-testid=\"user-avatar\"]")
    private ClickButtonElement userLogo;

    @Override
    @Step("isOpen")
    public boolean isOpen() {
        return userLogo.waitForMeVisible(10000);
    }


}
