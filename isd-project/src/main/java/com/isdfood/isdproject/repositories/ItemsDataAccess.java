package com.isdfood.isdproject.repositories;

import com.isdfood.isdproject.models.Items;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemsDataAccess implements ItemsRepository {

    public List<Items> items = new ArrayList<>();

    @Override
    public int addItems(Items item) {
        items.add(item);
        return 1;
    }

    @Override
    public List<Items> getAllItems() {
        return items;
    }
}
