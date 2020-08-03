package com.isdfood.isdproject.repositories;

import com.isdfood.isdproject.models.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderDataAccess implements OrderRepository {

    List<Order> orderList = new ArrayList<>();

    @Override
    public int addOrder(Order order) {
        orderList.add(order);
        return 1;
    }
}
