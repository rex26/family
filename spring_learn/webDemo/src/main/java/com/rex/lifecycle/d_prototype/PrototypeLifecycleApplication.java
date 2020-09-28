package com.rex.lifecycle.d_prototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrototypeLifecycleApplication {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                PrototypeLifecycleConfiguration.class);
        System.out.println("IOC容器初始化完成。。。");

        System.out.println("准备获取一个Pen。。。");
        Pen pen = ctx.getBean(Pen.class);
        System.out.println("已经取到了Pen。。。");

        // 再次运行 main 方法，发现控制台中只打印了 @PreDestroy 注解和 DisposableBean 接口的执行，
        // 没有触发 destroy-method 的执行
        System.out.println("用完Pen了，准备销毁。。。");
        ctx.getBeanFactory().destroyBean(pen);
        System.out.println("Pen销毁完成。。。");
    }
}
