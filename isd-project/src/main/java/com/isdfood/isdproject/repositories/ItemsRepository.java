package com.isdfood.isdproject.repositories;

import com.isdfood.isdproject.models.Items;

import java.util.List;

public interface ItemsRepository {

    int addItems(Items items);

    default int addItems(String itemName){
        return addItems(new Items(itemName));
    }

    List<Items> getAllItems();
}
