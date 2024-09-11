package Builderdesignpattern.NotificationBuilder;

public class MainClient {
    public static void main(String[] args) {
        
        Notification emailNotification = new Builder()
                                         .setAttachement("noting")
                                         .setBody("no message")
                                         .setRecipient("akshat@gmail.com")
                                         .setSubject("Apply leave")
                                         .build();

        System.out.println(emailNotification);
    }
}
