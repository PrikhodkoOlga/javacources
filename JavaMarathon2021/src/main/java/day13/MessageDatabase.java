package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages;

    public static void addNewMessage(User u1, User u2, String text){
        if (messages == null){
            messages = new ArrayList<>();
        }
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2){
        for (Message message : messages) {
            if ((message.getSender().equals(u1) && message.getReceiver().equals(u2))
                    || (message.getSender().equals(u2) && message.getReceiver().equals(u1))) {
                System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }
}
