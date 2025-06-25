package com.linkedbear.blob.aopfinal.service.impl;

import com.linkedbear.blob.aopfinal.service.JdkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JdkServiceImpl implements JdkService {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    @SuppressWarnings("all")
    @Transactional(rollbackFor = Exception.class)
    public final void addDept(String name, Integer pid) {
        jdbcTemplate.update("insert into tbl_dept (name, pid) values (?, ?)", name, pid);
        int i = 1 / 0;
    }
}
