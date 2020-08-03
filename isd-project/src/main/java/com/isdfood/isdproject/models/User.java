package com.isdfood.isdproject.models;


import java.util.ArrayList;
import java.util.List;

public class User {
    private final String login;
    private String password;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final String employmentDate;
    private final Role role;
    private final String SkypeId;
    private List<Order> orderList = new ArrayList<>();

    public User(String login, String password, String email, String firstName, String lastName, String employmentDate, Role role, String skypeId) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.role = role;
        SkypeId = skypeId;
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }


}
