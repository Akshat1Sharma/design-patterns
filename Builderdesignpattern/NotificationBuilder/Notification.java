package Builderdesignpattern.NotificationBuilder;

public class Notification {
    private String recipient;
    private String subject;
    private String body;
    private String attachement;


    public Notification(Builder builder){
        this.recipient = builder.recipient;
        this.subject = builder.subject;
        this.body = builder.body;
        this.attachement = builder.attachement;
    }


    @Override
    public String toString() {
        return "Notification [recipient=" + recipient + ", subject=" + subject + ", body=" + body + ", attachement="
                + attachement + "]";
    }
    
}
