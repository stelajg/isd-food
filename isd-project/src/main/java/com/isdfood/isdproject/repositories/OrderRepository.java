package com.isdfood.isdproject.repositories;

import com.isdfood.isdproject.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository {
    int addOrder(Order order);
}
