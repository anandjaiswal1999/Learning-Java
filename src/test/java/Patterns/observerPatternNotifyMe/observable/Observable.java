package Patterns.observerPatternNotifyMe.observable;

import Patterns.observerPatternNotifyMe.observer.NotificationAlert;

public interface Observable {
    void add(NotificationAlert observer);

    void remove(NotificationAlert observer);

    void notifMe();

    void set(int temp);

    int get();
}
