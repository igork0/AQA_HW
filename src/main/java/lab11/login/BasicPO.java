package lab11.login;

import lab11.BrowserFactory;
import lab11.decorator.CustomDecorator;
import org.openqa.selenium.support.PageFactory;

public abstract class BasicPO {

        public BasicPO() {
            PageFactory.initElements(new CustomDecorator(BrowserFactory.getDriver()),this);
        }

        public boolean isOpen(){
            //TODO
            return true;
        };
    public boolean isSubscribed(){
        //TODO
        return true;
    };
    public boolean isUnsubscribed(){
        //TODO
        return true;
    };



}
