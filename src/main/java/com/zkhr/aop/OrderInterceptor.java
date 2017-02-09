package com.zkhr.aop;

import com.alibaba.fastjson.JSON;
import com.zkhr.model.one2many.Order;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoshuai on 2017/2/9.
 */

@Aspect  //定义通知
@Component //让SPring来管理 切面
public class OrderInterceptor {

    @Pointcut("execution(* com.zkhr.service.one2many.OrderService.*(..))")
    private void anyMethod(){}


    @Before("anyMethod() && args(order)")
    public void beforeMentInvork(Order order){
        println(JSON.toJSONString(order));
       println("前置通知");
    }


    public static void println(String msg){
        System.out.println(msg);
    }
}
