package com.order.ord.respository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.ord.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	List<Order> findByOrderNumber(String orderNumber);

    List<Order> findByCustomerCustomerId(String customerId);

    List<Order> findByOrderDateBetween(LocalDateTime startDate, LocalDateTime endDate);

}
