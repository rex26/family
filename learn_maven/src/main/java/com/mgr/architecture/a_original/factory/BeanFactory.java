package com.mgr.architecture.a_original.factory;

import com.mgr.architecture.a_original.dao.DemoDao;
import com.mgr.architecture.a_original.dao.impl.DemoDaoImpl;
import com.mgr.architecture.a_original.dao.impl.DemoOracleDaoImpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {

    public static DemoDao getDao() {
        // new DemoDaoImpl();
        return new DemoOracleDaoImpl();
    }

    public static DemoDao getDaoByRef() {
        DemoDao demoDao = null;

        try {
            Class<?> aClass = Class.forName("com.mgr.architecture.a_original.dao.impl.DemoOracleDaoImpl");
            demoDao = (DemoDao) aClass.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return demoDao;
    }

    // region properties

    static Properties properties;

    static {
        properties = new Properties();

        try {
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Map<String, Object> beanMap = new HashMap<>();

    public static Object getBeanByRefProp(String beanName) {
        if (!beanMap.containsKey(beanName)) {
            synchronized (BeanFactory.class) {
                if (!beanMap.containsKey(beanName)) {
                    try {
                        Class<?> aClass = Class.forName(properties.getProperty(beanName));
                        beanMap.put(beanName, aClass.newInstance());
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return beanMap.get(beanName);
    }

    // endregion

}
