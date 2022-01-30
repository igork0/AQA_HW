package lab11;

import com.automation.remarks.testng.UniversalVideoListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;


@Listeners({
        UniversalVideoListener.class,
        CustomAllure.class
})

public class BaseTest {

        @AfterTest
        void quitBrowser(){
                BrowserFactory.getDriver().quit();
                BrowserFactory.getDriver().close();
        }
}