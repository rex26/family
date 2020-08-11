package com.rex.family.ifelse;

@OrderHandlerType(source = "pc")
public class PCOrderHandler implements OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.println("处理PC端订单");
    }
}
