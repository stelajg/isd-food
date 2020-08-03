package com.isdfood.isdproject.models;


import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final Integer price;
    private Provider provider;
    private List<Items> itemsList = new ArrayList<>();
    private Boolean isActive;
    private String urlImage;
    private DayOfWeek dayOfWeek;

    public Menu(Integer price, Provider provider, Boolean isActive, String urlImage, DayOfWeek dayOfWeek) {
        this.price = price;
        this.provider = provider;
        this.isActive = isActive;
        this.urlImage = urlImage;
        this.dayOfWeek = dayOfWeek;
    }

    public Integer getPrice() {
        return price;
    }

    public String getProviderName() {
        return provider.getName();
    }

    enum Type {
        S, M
    }
}
