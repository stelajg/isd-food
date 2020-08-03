package com.isdfood.isdproject.service;

import com.isdfood.isdproject.models.Items;
import com.isdfood.isdproject.repositories.ItemsRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private ItemsRepository itemsRepository;

    public void addItem(Items items) {
        itemsRepository.addItems(items);
    }
}
