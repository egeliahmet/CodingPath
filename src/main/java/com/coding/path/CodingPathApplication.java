package com.coding.path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class CodingPathApplication {



	public static void main(String[] args) {

		SpringApplication.run(CodingPathApplication.class, args);


	}

}
