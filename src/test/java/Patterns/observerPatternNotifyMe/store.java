package Patterns.observerPatternNotifyMe;

import Patterns.observerPatternNotifyMe.observable.WSObservable;
import Patterns.observerPatternNotifyMe.observer.NotificationAlert;

import java.util.ArrayList;
import java.util.List;

public class store {
    public static void main(String[] args) {
        NotificationAlert notificationAlert1 = new NotificationAlert("abcde");
        NotificationAlert notificationAlert2 = new NotificationAlert("ekuf");
        NotificationAlert notificationAlert3 = new NotificationAlert("ewjfn");
        NotificationAlert notificationAlert4 = new NotificationAlert("wejfn");
        List<NotificationAlert> notificationAlertList = new ArrayList<>();
        notificationAlertList.add(notificationAlert1);
        notificationAlertList.add(notificationAlert2);
        notificationAlertList.add(notificationAlert3);
        notificationAlertList.add(notificationAlert4);
        WSObservable wsObservable =new WSObservable();
       wsObservable.setNotificationAlertList(notificationAlertList);
       wsObservable.notifMe();
        wsObservable.notifMe();
    }



}
