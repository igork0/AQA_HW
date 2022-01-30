package lab11.login.BO;


import basic.PropertyUtil;
import io.qameta.allure.Step;
import lab11.login.PO.LoginPO;

public class LoginBO {



    @Step("isOpen")
    public boolean login() {

        LoginPO loginPO = new LoginPO()
                .goToLoginPage();

        return loginPO.isOpen()
                &&
                loginPO
                        .inputLogin((String) new PropertyUtil().getProperty("login"))
                        .inputPassword((String) new PropertyUtil().getProperty("pass"))
                        .submit()
                        .isOpen();
    }
    public boolean loginFailure() {

        LoginPO loginPO = new LoginPO()
                .goToLoginPage();

        return loginPO.isOpen()
                &&
                loginPO
                        .inputLogin((String) new PropertyUtil().getProperty("login"))
                        .inputPassword((String) new PropertyUtil().getProperty("pass1"))
                        .submit()
                        .isOpen();
    }
}