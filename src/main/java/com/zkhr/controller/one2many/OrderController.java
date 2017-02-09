package com.zkhr.controller.one2many;

import com.alibaba.fastjson.JSON;
import com.zkhr.model.one2many.Order;
import com.zkhr.model.one2many.OrderItem;
import com.zkhr.service.one2many.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhaoshuai on 2017/2/9.
 */

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;
    @RequestMapping("/saveOrder")
    public String saveOrder(){

        Order order = new Order();
        order.setCode("4414411");
        order.setCreateTime(new Date());

        Order result = orderService.saveOrder(order);

        OrderItem orderItem = new OrderItem();
        orderItem.setPrice(new BigDecimal(100));
        orderItem.setProductName("苹果");
        orderItem.setOrder(result);

        orderService.saveOrderItem(orderItem);


        OrderItem orderItem2 = new OrderItem();
        orderItem2.setPrice(new BigDecimal(200));
        orderItem2.setProductName("苹果2");
        orderItem2.setOrder(result);

        orderService.saveOrderItem(orderItem2);



        OrderItem orderItem3 = new OrderItem();
        orderItem3.setPrice(new BigDecimal(300));
        orderItem3.setProductName("苹果3");
        orderItem3.setOrder(result);

        orderService.saveOrderItem(orderItem3);



        OrderItem orderItem4 = new OrderItem();
        orderItem4.setPrice(new BigDecimal(500));
        orderItem4.setProductName("苹果4");
        orderItem4.setOrder(result);

        orderService.saveOrderItem(orderItem4);



        return "SUCCESS";
    }


    @RequestMapping("/findOrder")
    public String findOrderById(){

        return JSON.toJSONString(orderService.findOrderById());
    }
}
