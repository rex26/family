package com.rex.family.ifelse;

@OrderHandlerType(source = "mobile")
public class MobileOrderHandler implements OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.println("处理移动端订单");
    }
}
