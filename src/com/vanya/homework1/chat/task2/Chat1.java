package com.vanya.homework1.chat.task2;

import java.util.List;
import java.util.Objects;

public class Chat1 {
    private String name;
    private List<Users> users;

    public Chat1(String name, List<Users> users) {
        this.name = name;
        this.users = users;
    }

    public Chat1(String name) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat1 chat1 = (Chat1) o;
        return Objects.equals(name, chat1.name) && Objects.equals(users, chat1.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, users);
    }

    @Override
    public String toString() {
        return "Chat1{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }

}
