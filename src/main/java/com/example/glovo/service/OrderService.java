package com.example.glovo.service;

import com.example.glovo.model.Order;
import java.util.List;

public interface OrderService {
    Order getOrderById(int id);
    List<Order> getAllOrders();
    void addOrder(Order order);
    boolean updateOrder(int id, Order order);
    boolean deleteOrder(int id);
}