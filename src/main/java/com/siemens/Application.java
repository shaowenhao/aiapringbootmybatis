package com.siemens;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>Create Time: 2022年03月04日 16:50          </p>
 *
 * http://localhost:8080/findAll
 * [{"id":1,"name":"shaowenhao","score":99.0,"birthday":"2022-03-03T16:00:00.000+0000"},{"id":2,"name":"siemens","score":98.0,"birthday":"2000-07-06T16:00:00.000+0000"}]
 *
 * xxxxx/save
 * {
 *     "name": "test1",
 *     "score": 95.0,
 *     "birthday": "2022-03-07"
 * }
 * 插入一条数据
 **/
@SpringBootApplication

@MapperScan("com.siemens.repository")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
