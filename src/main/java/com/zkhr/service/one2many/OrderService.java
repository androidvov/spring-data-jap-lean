package com.zkhr.service.one2many;

import com.zkhr.dao.one2many.OrderDao;
import com.zkhr.dao.one2many.OrderItemDao;
import com.zkhr.model.one2many.Order;
import com.zkhr.model.one2many.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhaoshuai on 2017/2/9.
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private OrderItemDao orderItemDao;




    public Order saveOrder(Order order){
        return orderDao.save(order);
    }


    public OrderItem saveOrderItem(OrderItem orderItem){
        return orderItemDao.save(orderItem);
    }


    public Order findOrderById(){
        return orderDao.findOrderById();
    }









}
