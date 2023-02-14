package com.order.ord.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.order.ord.entity.Order;
import com.order.ord.respository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	
	private OrderRepository orderRepo;
	
	public OrderServiceImpl(OrderRepository orderRepo) {
		super();
		this.orderRepo = orderRepo;
	}

	@Override
	public Order createOrder(Order order) {
		return orderRepo.save(order);
	}

	@Override
	public Order getOrderById(Long id) {
		Optional<Order> byId = orderRepo.findById(id); 
		Order order = byId.get();
		return order;
		
	}

	@Override
	public List<Order> searchOrders(String orderNumber, String customerId, String startDate, String endDate) {
		return orderRepo.findAll();
			
	}

	@Override
	public Order updateOrder(Long id, Order order) {
		orderRepo.findById(id);
		return order;
		
	}

	@Override
	public boolean deleteOrder(Long id) {
		Optional<Order> findById = orderRepo.findById(id);
		Order newOrder = findById.get();
		return false;
		
	}

	@Override
	public List<Order> getAllOrders() {
		return orderRepo.findAll();
		
	}

}
