package com.vanya.homework1.chat.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/**
 * Задание 1
 * Дан список чатов.
 * Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 *
 * Задача:
 *
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 *
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей, а если это количество совпадает, то по названию в алфавитном порядке.
 *
 * - Также предоставить сортировку чатов по названию по умолчанию.
 */

public class ChatRunner {
    public static void main(String[] args) {
        List<Chat> chatsList = getChats();
        deleteChatsWhereUsersLess1000(chatsList);
        System.out.println(chatsList);
        System.out.println();

        chatsList.sort(new sortByComparator());
        System.out.println(chatsList);
        System.out.println();

        chatsList.sort(new sortByChatName());
        System.out.println(chatsList);
        System.out.println();

    }

    private static List<Chat> getChats() {
        Chat chat1 = new Chat("programmers", 1200);
        Chat chat2 = new Chat("flower lovers", 1200);
        Chat chat3 = new Chat("berrys", 1000);
        Chat chat4 = new Chat("hiber users", 2500);
        Chat chat5 = new Chat("moms", 10000);
        Chat chat6 = new Chat("ninjas", 10);
        Chat chat7 = new Chat("frogs", 100);

        List<Chat> chats = new ArrayList<>();
        chats.add(chat1);
        chats.add(chat2);
        chats.add(chat3);
        chats.add(chat4);
        chats.add(chat5);
        chats.add(chat6);
        chats.add(chat7);

        return chats;

    }

    private static void deleteChatsWhereUsersLess1000(List<Chat> chatsDeleter) {
        ListIterator<Chat> chatsIterator = chatsDeleter.listIterator();
        while (chatsIterator.hasNext()) {
            Chat chat = chatsIterator.next();
            if (chat.getCountOfUsers() < 1000) {
                chatsIterator.remove();
            }

        }
    }

    public static class sortByComparator implements Comparator<Chat> {

        @Override
        public int compare(Chat o1, Chat o2) {
            int userCountComparison = o2.getCountOfUsers().compareTo(o1.getCountOfUsers());
            if (userCountComparison == 0) {
                return o1.getName().compareTo(o2.getName());
            }
            return userCountComparison;
        }

    }

    public static class sortByChatName implements Comparator<Chat> {
        @Override
        public int compare(Chat o1, Chat o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

}
