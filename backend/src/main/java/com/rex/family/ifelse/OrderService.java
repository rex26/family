package com.rex.family.ifelse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class OrderService {

    // region old one

    public void orderService_old(Order order) {
        if (order.getSource().equals("pc")) {
            // 处理pc端订单的逻辑
        } else if (order.getSource().equals("mobile")) {
            // 处理移动端订单的逻辑
        } else {
            // 其他逻辑
        }
    }
    // endregion

    // region new one by annotation

    private Map<String, OrderHandler> orderHandleMap;

    @Autowired
    public void setOrderHandleMap(List<OrderHandler> orderHandlers) {
        Function<OrderHandler, String> keyMapper = orderHandler -> AnnotationUtils.findAnnotation(orderHandler.getClass(), OrderHandlerType.class).source();
        Function<OrderHandler, OrderHandler> valueMapper = v -> v;
        BinaryOperator<OrderHandler> mergeFunction = (v1, v2) -> v1;

        Collector<OrderHandler, ?, Map<String, OrderHandler>> toMap = Collectors.toMap(keyMapper,
                valueMapper, mergeFunction);

        orderHandleMap = orderHandlers.stream().collect(toMap);

        // 注入各种类型的订单处理类
        orderHandleMap = orderHandlers.stream().collect(
                Collectors.toMap(orderHandler -> AnnotationUtils.findAnnotation(orderHandler.getClass(), OrderHandlerType.class).source(),
                        v -> v, (v1, v2) -> v1));
    }

    public void orderService(Order order) {
        // ...一些前置处理

        // 通过订单来源确定对应的handler
        OrderHandler orderHandler = orderHandleMap.get(order.getSource());
        orderHandler.handle(order);

        // ...一些后置处理
    }

    // endregion
}