package com.jasper.tmall.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jasper.tmall.pojo.Order;
import com.jasper.tmall.pojo.OrderItem;
import com.jasper.tmall.pojo.Product;
import com.jasper.tmall.pojo.User;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
	List<OrderItem> findByOrderOrderByIdDesc(Order order);
	List<OrderItem> findByProduct(Product product);
	List<OrderItem> findByUserAndOrderIsNull(User user);
}


