package FactoryDesignPattern.NotificationService;

public class PushNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Push Notification.");
    }
    

}
