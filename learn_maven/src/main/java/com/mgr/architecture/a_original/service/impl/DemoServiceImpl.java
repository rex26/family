package com.mgr.architecture.a_original.service.impl;

import com.mgr.architecture.a_original.dao.DemoDao;
import com.mgr.architecture.a_original.dao.impl.DemoDaoImpl;
import com.mgr.architecture.a_original.factory.BeanFactory;
import com.mgr.architecture.a_original.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {

    private DemoDao demoDao = BeanFactory.getDao();

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
