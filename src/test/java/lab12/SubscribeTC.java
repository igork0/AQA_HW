package lab12;


import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lab11.BaseTest;
import lab11.BrowserFactory;
import lab11.login.BO.LoginBO;
import lab12.Subscribe.BO.SubscribeBO;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class SubscribeTC extends BaseTest {

    @DataProvider(parallel = true)
    public static Object[][] browserDataProvider() {
        return new Object[][]{
                {"chrome"}
                //,{"firefox"}
                //,{"Opera"}
                //,{"IE"}
                //,{"Safari"}
        };
    }

    @Test(dataProvider = "browserDataProvider")
    @Severity(SeverityLevel.CRITICAL)
    public void SubscribeTest(String browserName) {
        BrowserFactory.initDriver(browserName);

        LoginBO loginBO = new LoginBO();

        //Step1
        Assert.assertTrue(loginBO.login(),"Login Failed!");

        SubscribeBO subscribeBO = new SubscribeBO();

        //Step2 Subscribe
        Assert.assertTrue(subscribeBO.subscribe(),"Subscribe Failed!");

        //Step2 Unsubscribe
        Assert.assertTrue(subscribeBO.unsubscribe(),"Unsubscribe Failed!");
    }
}


