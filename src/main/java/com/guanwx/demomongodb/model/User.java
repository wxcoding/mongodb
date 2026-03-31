package com.guanwx.demomongodb.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @Author: guanwx
 * @CreateTime: 2025-11-17 22:41
 * @Description:
 * @Version: 1.0
 */

@Data
@Document("user") //指定mongodb中的集合名字
public class User {

    @Id
    private ObjectId id;

    private String name;
    private Integer age;
    private String email;
    private Date createDate;
}
