public class Main {
    public static void main(String[] args) {
        Message message = new PlainMessage("Hello, World!");
        Message encryptedMessage = new EncryptedMessage(message);
        Message loggedMessage = new LoggedMessage(encryptedMessage);

        System.out.println(loggedMessage.getContent()); // Logs and encrypts message
    }
}
