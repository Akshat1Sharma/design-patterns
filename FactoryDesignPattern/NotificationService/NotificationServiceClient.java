package FactoryDesignPattern.NotificationService;

public class NotificationServiceClient {
    public static void main(String[] args) {
        
        //Let's send a email notification

        NotificationFactory emailFactory = new EmailNotificationFactory();
        emailFactory.sendNotification();;

        //Send SMS notification

        NotificationFactory smsNotification = new SMSNotificationFactory();
        smsNotification.sendNotification();;
    }
}
