package com.guanwx.demomongodb.repository;

import com.guanwx.demomongodb.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Author: guanwx
 * @CreateTime: 2025-11-17 22:49
 * @Description:
 * @Version: 1.0
 */

public interface UserRepository extends MongoRepository<User, ObjectId> {

}
