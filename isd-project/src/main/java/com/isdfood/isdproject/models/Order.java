package com.isdfood.isdproject.models;


import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Menu> menuList = new ArrayList<>();
    private String date;

    public Order(String date) {
        this.date = date;
    }

    public void addMenu(Menu menu) {
        menuList.add(menu);
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public String getDate() {
        return date;
    }
}
