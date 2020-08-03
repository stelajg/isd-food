package com.isdfood.isdproject.models;

public class Provider {

    private final String name;
    private final Integer deliveryPrice;
    private final String contactInfo;
    private Boolean isActive;

    public Provider(String name, Integer deliveryPrice, String contactInfo, Boolean isActive) {
        this.name = name;
        this.deliveryPrice = deliveryPrice;
        this.contactInfo = contactInfo;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public Integer getDeliveryPrice() {
        return deliveryPrice;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public Boolean getActive() {
        return isActive;
    }
}
