package com.rex.ioc.dao.impl;

import com.rex.ioc.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoOracleDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("oracle", "oracle", "oracle");
    }
}
