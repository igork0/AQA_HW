package lab10;


import lab10.Factory.BrowserFactory;
import lab10.StackOverflow.BO.bAboutBO;
import lab10.StackOverflow.BO.bLeadershipBO;
import lab10.StackOverflow.BO.bPressBO;
import org.testng.Assert;
import org.testng.annotations.Test;

// CHROME DRIVER MANAGER
public class UITest{

    @Test
    public void buttonPress() {
        BrowserFactory.initDriver("chrome");
        bPressBO pressTest = new bPressBO();
        Assert.assertTrue(pressTest.bpress());

    }

    @Test
    public void buttonAbout() {
        BrowserFactory.initDriver("chrome");
        bAboutBO aboutTest = new bAboutBO();
        Assert.assertTrue(aboutTest.babout());
    }
    @Test
    public void buttonLeadership() {
        BrowserFactory.initDriver("chrome");
        bLeadershipBO leadershipTest = new bLeadershipBO();
        Assert.assertTrue(leadershipTest.bleadership());
    }

}
