package com.coding.path.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcRepository {

    private   JdbcTemplate jdbcTemplate;

    public JdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Integer getTopicSize(){
        return jdbcTemplate.queryForObject("select count(*) from Topics", Integer.class);
    }
}
