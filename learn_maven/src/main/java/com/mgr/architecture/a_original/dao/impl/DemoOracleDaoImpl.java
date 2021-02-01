package com.mgr.architecture.a_original.dao.impl;

import com.mgr.architecture.a_original.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoOracleDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("oracle1", "oracle2");
    }
}
