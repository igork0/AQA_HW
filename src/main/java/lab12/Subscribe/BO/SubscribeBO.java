package lab12.Subscribe.BO;

import io.qameta.allure.Step;
import lab12.Subscribe.PO.SubscribePO;

public class SubscribeBO {

    @Step("isOpen")
    public boolean subscribe() {

        SubscribePO subscribePO = new SubscribePO()
                .goToUserPage();

        return subscribePO.isOpen()
                &&
                subscribePO
                        .subscribe()
                        .isSubscribed();
    }
    @Step("isOpen")
    public boolean unsubscribe() {

        SubscribePO subscribePO = new SubscribePO()
                .goToUserPage();

        return subscribePO.isOpen()
                &&
                subscribePO
                        .unsubscribe()
                        .isUnsubscribed();
    }
}