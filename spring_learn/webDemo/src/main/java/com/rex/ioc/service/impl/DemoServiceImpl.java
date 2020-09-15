package com.rex.ioc.service.impl;

import com.rex.ioc.dao.BeanFactory;
import com.rex.ioc.dao.DemoDao;
import com.rex.ioc.dao.impl.DemoDaoImpl;
import com.rex.ioc.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {
    // private DemoDao demoDao = BeanFactory.getDemoDao();

    /**
     * 仔细体会下面这种对象获取的方式，
     * 本来咱开发者可以使用上面的方式，主动声明实现类，
     * 但如果选择下面的方式，那就不再是咱自己去声明，
     * 而是将获取对象的方式交给了 BeanFactory 。
     * 这种将控制权交给别人的思想，就可以称作：控制反转（ Inverse of Control , IOC ）。
     * 而 BeanFactory 根据指定的 beanName 去获取和创建对象的过程，就可以称作：依赖查找（ Dependency Lookup , DL ）。
     */
    private DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");

    public DemoServiceImpl() {
        for (int i = 0; i < 10; i++) {
            // 加入缓存
            System.out.println(BeanFactory.getBean("demoDao"));
        }
    }

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
