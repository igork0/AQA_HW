package lab11.login.PO;


import io.qameta.allure.Link;
import io.qameta.allure.Step;
import lab11.BrowserFactory;
import lab11.decorator.ClickButtonElement;
import lab11.decorator.InputElement;
import lab11.login.BasicPO;
import org.openqa.selenium.support.FindBy;


public class LoginPO extends BasicPO {

    @FindBy(xpath = "//*[@name='username']")
    private InputElement loginInput;

    @FindBy(xpath = "//*[@name='password']")
    private InputElement passInput;

    @FindBy(xpath = "//*[@type='submit']")
    private ClickButtonElement submitButton;


    @Override
    @Step("isOpen")
    public boolean isOpen() {
        return loginInput.waitForMeVisible(5000);
    }





    @Step("inputLogin")
    public LoginPO inputLogin(String login) {
        loginInput.sendKeys(login);
        return this;
    }




    @Step("inputPassword")
    public LoginPO inputPassword(String pass) {
        passInput.sendKeys(pass);
        return this;
    }

    @Step("submit")
    public HomePO submit() {
        submitButton.click();
        return new HomePO();
    }

    @Step("goToLoginPage")
    @Link("https://www.instagram.com/")
    public LoginPO goToLoginPage() {
        BrowserFactory.getDriver().get("https://www.instagram.com/");
        return this;
    }
}

