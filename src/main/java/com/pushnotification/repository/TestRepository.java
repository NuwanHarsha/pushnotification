package com.pushnotification.repository;

import com.pushnotification.model.Test;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TestRepository extends MongoRepository<Test,String> {

}
