package com.vanya.homework1.chat.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Chat1Runner {

    public static void main(String[] args) {

        List<Chat1> chats = new ArrayList<>();

        List<Users> user1 = new ArrayList<>();
        user1.add(new Users(1, "Petr", 32));
        user1.add(new Users(2, "John", 29));
        chats.add(new Chat1("Programmers", user1));

        List<Users> user2 = new ArrayList<>();
        user2.add(new Users(3, "Mike", 42));
        user2.add(new Users(4, "Mike", 23));
        chats.add(new Chat1("Flowers", user2));

        List<Users> user3 = new ArrayList<>();
        user3.add(new Users(5, "David", 17));
        user3.add(new Users(6, "Bob", 23));
        chats.add(new Chat1("Berrys", user3));

        List<Users> user4 = new ArrayList<>();
        user4.add(new Users(7, "Jack", 24));
        user4.add(new Users(8, "Jack", 15));
        chats.add(new Chat1("Hiber", user4));

        List<Users> usersFinal = transformationChatsTo18Plus(chats);
        for (Users user : usersFinal) {
            System.out.println(user);
        }

        double usersNew = calculateMiddleAge(usersFinal);
        System.out.println(usersNew);


    }

    public static List<Users> transformationChatsTo18Plus(List<Chat1> chats) {
        List<Users> usersNew = new ArrayList<>();

        for (Chat1 chat : chats) {
            List<Users> users = chat.getUsers();
            for (Users user : users) {
                if (user.getAge() > 18) {
                    usersNew.add(user);
                }

            }
        }
        return usersNew;
    }

    private static double calculateMiddleAge(List<Users> remainingUsers) {
        double totalAge = 0;
        int count = 0;
        ListIterator<Users> iterator = remainingUsers.listIterator();
        while (iterator.hasNext()) {
            Users usersNew = iterator.next();
            totalAge += usersNew.getAge();
            count++;

        }
        return count > 0 ? totalAge / count : 0;
    }
}
