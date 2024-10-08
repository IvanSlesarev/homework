package com.vanya.homework1.chat.task2;

import java.util.Objects;

public class Users {
    private int id;
    private String username;
    private int age;

    public Users(int id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id == users.id && age == users.age && Objects.equals(username, users.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, age);
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
