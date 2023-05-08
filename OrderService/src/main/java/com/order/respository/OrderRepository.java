package com.order.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
