package com.order.ord.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.order.ord.entity.Order;

public interface OrderService {

	public Order createOrder(Order order);

	public Order getOrderById(Long id);

	public List<Order> searchOrders(String orderNumber, String customerId, String startDate, String endDate);

	public Order updateOrder(Long id, Order order);

	public boolean deleteOrder(Long id);

	public List<Order> getAllOrders();

}
