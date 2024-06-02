package observerPatternNotifyMe.observable;

import observerPatternNotifyMe.observer.NotificationAlert;

public interface Observable {
    void add(NotificationAlert observer);

    void remove(NotificationAlert observer);

    void notifMe();

    void set(int temp);

    int get();
}
