package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        user1.sendMessage(user2, "Сообщение 1 от user 1 для user2");
        user1.sendMessage(user2, "Сообщение 2 от user 1 для user2");

        user2.sendMessage(user1, "Сообщение 1 от user 2 для user1");
        user2.sendMessage(user1, "Сообщение 2 от user 2 для user1");
        user2.sendMessage(user1, "Сообщение 3 от user 2 для user1");

        user3.sendMessage(user1, "Сообщение 1 от user 3 для user1");
        user3.sendMessage(user1, "Сообщение 2 от user 3 для user1");
        user3.sendMessage(user1, "Сообщение 3 от user 3 для user1");

        user1.sendMessage(user3, "Сообщение 1 от user 1 для user3");
        user1.sendMessage(user3, "Сообщение 2 от user 1 для user3");
        user1.sendMessage(user3, "Сообщение 3 от user 1 для user3");

        user3.sendMessage(user1, "Сообщение 4 от user 3 для user1");

        MessageDatabase.showDialog(user1, user3);
    }
}
