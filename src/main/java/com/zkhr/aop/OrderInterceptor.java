package com.zkhr.aop;

import com.alibaba.fastjson.JSON;
import com.zkhr.model.one2many.Order;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoshuai on 2017/2/9.
 */

@Aspect  //定义通知
@Component //让SPring来管理 切面
public class OrderInterceptor {

    @Pointcut("execution(* com.zkhr.service.one2many.OrderService.*(..))")
    private void anyMethod(){}


    /**
     * 带参数通知
     * @param order
     */
    @Before("anyMethod() && args(order)")
    public void beforeMentInvork(Order order){
        println(JSON.toJSONString(order));
       println("前置通知");
    }

    /**
     * 执行完通知
     */
    @After("anyMethod()")
    public void afterMethodInvork(){
        println("最终通知");
    }

    @AfterReturning("anyMethod()")
    public void afterMentodReturnInvork(){
        println("执行后置通知");
    }
//
    @AfterThrowing("anyMethod()")
    public void afterMethodThrowEx(){
        println("异常通知");
    }


//    @Around("anyMethod()")
//    public void aroundMethodInvok(){
//        println("环绕通知");
//    }





    public static void println(String msg){
        System.out.println(msg);
    }





}
