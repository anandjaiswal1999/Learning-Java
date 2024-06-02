package observerPatternNotifyMe.observable;

import observerPatternNotifyMe.observable.Observable;
import observerPatternNotifyMe.observer.NotificationAlert;

import java.util.ArrayList;
import java.util.List;

public class WSObservable implements Observable {
    List<NotificationAlert> notificationAlertList = new ArrayList<>();
    public int temp=0;
    @Override
    public void add(NotificationAlert observer) {
        notificationAlertList.add(observer);
    }

    @Override
    public void remove(NotificationAlert observer) {
        notificationAlertList.remove(observer);
    }

    @Override
    public void notifMe() {
        for(NotificationAlert notificationAlert: notificationAlertList){
            notificationAlert.update();
        }
    }

    @Override
    public void set(int temp1) {
        if(temp!=temp1){
            temp=temp1;
            notifMe();
        }
    }

    @Override
    public int get() {
        return 0;
    }
}