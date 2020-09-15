package com.rex.ioc.dao;

import com.rex.ioc.dao.impl.DemoOracleDaoImpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
    private static Properties properties;

    // 缓存区，保存已经创建好的对象
    private static Map<String, Object> beanMap = new HashMap<>();

    // 使用静态代码块初始化properties，加载factord.properties文件
    static {
        properties = new Properties();
        try {
            // 必须使用类加载器读取resource文件夹下的配置文件
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
        } catch (IOException e) {
            // BeanFactory类的静态初始化都失败了，那后续也没有必要继续执行了
            throw new ExceptionInInitializerError("BeanFactory initialize error, cause: " + e.getMessage());
        }
    }

    public static DemoDao getDemoDao() {
        // 1st way
        // return new DemoDaoImpl();
        // return new DemoOracleDaoImpl();

        // 2st way
        /*try {
            return (DemoDao) Class.forName("com.rex.ioc.dao.impl.DemoDaoImpl").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("DemoDao instantiation error, cause: " + e.getMessage());
        }*/

        // 3st way
        String demoDao = properties.getProperty("demoDao");
        String demoService = properties.getProperty("demoService");

        return (DemoDao) getBean(demoDao);
    }

    public static Object getBean(String beanName) {
        // 双检锁保证beanMap中确实没有beanName对应的对象
        if (!beanMap.containsKey(beanName)) {
            synchronized (BeanFactory.class) {
                if (!beanMap.containsKey(beanName)) {
                    // 过了双检锁，证明确实没有，可以执行反射创建
                    try {
                        // 从properties文件中读取指定name对应类的全限定名，并反射实例化
                        Class<?> beanClazz = Class.forName(properties.getProperty(beanName));
                        Object bean = beanClazz.newInstance();
                        // 反射创建后放入缓存再返回
                        beanMap.put(beanName, bean);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException("BeanFactory have not [" + beanName + "] bean!", e);
                    } catch (IllegalAccessException | InstantiationException e) {
                        throw new RuntimeException("[" + beanName + "] instantiation error!", e);
                    }
                }
            }
        }

        return beanMap.get(beanName);
    }
}
