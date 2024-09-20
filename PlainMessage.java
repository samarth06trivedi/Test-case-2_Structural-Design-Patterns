// PlainMessage.java
public class PlainMessage implements Message {
    private String content;

    public PlainMessage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
