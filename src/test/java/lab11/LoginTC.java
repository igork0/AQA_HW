package lab11;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lab11.login.BO.LoginBO;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class LoginTC extends BaseTest {

    @DataProvider(parallel = true)
    public static Object[][] browserDataProvider() {
        return new Object[][]{
                {"chrome"}

        };
    }

    //@Video


    @Test(dataProvider = "browserDataProvider")
    @Severity(SeverityLevel.CRITICAL)
    public void loginTest(String browserName) {
        BrowserFactory.initDriver(browserName);
        LoginBO loginBO = new LoginBO();

        //Step1
        Assert.assertTrue(loginBO.login(),"login Failed!");

        //loginFailure
        //Assert.assertTrue(loginBO.loginFailure(),"login Failed!");


    }
}
