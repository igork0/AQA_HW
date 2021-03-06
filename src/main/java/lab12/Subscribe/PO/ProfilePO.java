package lab12.Subscribe.PO;


import io.qameta.allure.Step;
import lab11.decorator.ClickButtonElement;
import lab11.login.BasicPO;
import org.openqa.selenium.support.FindBy;

public class ProfilePO extends BasicPO {

    @FindBy(xpath = "//*[@class=\"_5f5mN    -fzfL     _6VtSN     yZn4P   \"]")
    private ClickButtonElement userSubscribe;

    @FindBy(xpath = "//*[@class=\"_5f5mN    -fzfL     _6VtSN     yZn4P   \"]")
    private ClickButtonElement userUnsubscribe;

    @Override
    @Step("isSubscribed")
    public boolean isSubscribed() {
        return userSubscribe.waitForMeVisible(10000);
    }

    @Override
    @Step("isSubscribed")
    public boolean isUnsubscribed() {
        return userUnsubscribe.waitForMeVisible(10000);
    }



}
