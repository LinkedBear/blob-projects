package com.linkedbear.blob.aopfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CglibService {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @SuppressWarnings("all")
    @Transactional(rollbackFor = Exception.class)
    public final void addDept(String name, Integer pid) {
        jdbcTemplate.update("insert into tbl_dept (name, pid) values (?, ?)", name, pid);
        int i = 1 / 0;
    }
    
    @SuppressWarnings("all")
    @Transactional(rollbackFor = Exception.class)
    public void addDept2(String name, Integer pid) {
        jdbcTemplate.update("insert into tbl_dept (name, pid) values (?, ?)", name, pid);
        int i = 1 / 0;
    }
}
