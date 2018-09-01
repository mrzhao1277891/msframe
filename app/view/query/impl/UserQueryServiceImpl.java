package com.ect.view.query.impl;

import com.ect.view.query.UserQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by zhaojun on 2018/2/1.
 */
@Service
public class UserQueryServiceImpl implements UserQueryService{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from ISP_ACCOUNT_USER", Integer.class);
    }
}
