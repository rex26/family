package com.mgr.architecture.a_original.factory;

import com.mgr.architecture.a_original.dao.DemoDao;
import com.mgr.architecture.a_original.dao.impl.DemoDaoImpl;
import com.mgr.architecture.a_original.dao.impl.DemoOracleDaoImpl;

public class BeanFactory {

    public static DemoDao getDao() {
        // new DemoDaoImpl();
        return new DemoOracleDaoImpl();
    }
}
