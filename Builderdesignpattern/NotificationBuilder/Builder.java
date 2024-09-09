package Builderdesignpattern.NotificationBuilder;

public class Builder {
    public String recipient;
    public String subject;
    public String body;
    public String attachement;

    public Builder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }
    public Builder setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public Builder setBody(String body) {
        this.body = body;
        return this;
    }
    public Builder setAttachement(String attachement) {
        this.attachement = attachement;
        return this;
    }

    public Notification build(){
        return new Notification(this);
    }

    
}
