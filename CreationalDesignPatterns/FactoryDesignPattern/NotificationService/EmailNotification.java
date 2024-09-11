package FactoryDesignPattern.NotificationService;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Send Email to User");
    }

}
