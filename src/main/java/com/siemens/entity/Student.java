package com.siemens.entity;

import lombok.Data;

import java.util.Date;

/**
 *
 * 创建数据表
 * 创建实体类
 * 创建StudentRepository接口
 * 再resources/mapping 下创建StudentRepository接口对应的Mapper.xml
 *创建StudentHandler,注入StudnetRepository
 *application.yml
 * 启动类 创建Application
 * <p>Create Time: 2022年03月04日 16:03          </p>
 **/

@Data
public class Student {
    private Long id;
    private String name;
    private Double score;
    private Date birthday;
}
