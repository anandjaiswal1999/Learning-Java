package observerPatternNotifyMe.observer;

public class NotificationAlert {
    String string;
    boolean isAlreadyNotified;

    public NotificationAlert(String string) {
        this.string = string;
    }

    public void update(){
        if(!isAlreadyNotified) {
            System.out.println("msg sent : " + string);
            isAlreadyNotified=true;
        }else{
            System.out.println("Already Notified");
        }
    }
}
