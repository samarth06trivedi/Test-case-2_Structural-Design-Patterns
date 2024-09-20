// LoggedMessage.java
public class LoggedMessage extends MessageDecorator {
    public LoggedMessage(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        System.out.println("Logging message: " + message.getContent());
        return message.getContent();
    }
}
