package com.vanya.homework1.chat.task1;

import java.util.Objects;

public class Chat {
   private String name;
   private Integer countOfUsers;

   public Chat(String name, Integer countOfUsers) {
       this.name = name;
       this.countOfUsers = countOfUsers;

   }

    public Chat(String name) {
    }

    public String getName() {
       return name;
   }
   public Integer getCountOfUsers() {
       return countOfUsers;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return Objects.equals(name, chat.name) && Objects.equals(countOfUsers, chat.countOfUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countOfUsers);
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", countOfUsers=" + countOfUsers +
                '}';
    }

}




