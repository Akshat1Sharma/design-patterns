package FactoryDesignPattern.NotificationService;

public class EmailNotificationFactory extends NotificationFactory {

    public Notification createNotification(){
        return new EmailNotification();
    }

}
