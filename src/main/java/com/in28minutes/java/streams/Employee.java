package com.in28minutes.java.streams;

import java.util.List;

public class Employee {
    private String username;
    private String password;
    private List<User> users;

    public Employee(String username, String password, List<User> users) {
        this.username = username;
        this.password = password;
        this.users = users;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", users=" + users +
                '}';
    }
}
