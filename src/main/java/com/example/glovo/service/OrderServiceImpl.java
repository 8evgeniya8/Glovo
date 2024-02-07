package com.example.glovo.service;

import com.example.glovo.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    private final Map<Integer, Order> orderMap = new HashMap<>();

    @Override
    public Order getOrderById(int id) {
        return orderMap.get(id);
    }

    @Override
    public List<Order> getAllOrders() {
        return new ArrayList<>(orderMap.values());
    }

    @Override
    public void addOrder(Order order) {
        orderMap.put(order.getId(), order);
    }

    @Override
    public boolean updateOrder(int id, Order order) {
        if (orderMap.containsKey(id)) {
            orderMap.put(id, order);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteOrder(int id) {
        if (orderMap.containsKey(id)) {
            orderMap.remove(id);
            return true;
        }
        return false;
    }
}
