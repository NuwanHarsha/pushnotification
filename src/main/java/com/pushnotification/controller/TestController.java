package com.pushnotification.controller;

import com.pushnotification.model.Test;
import com.pushnotification.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class TestController {

    private final TestRepository testRepository;

    @Autowired
    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }


    @GetMapping(value = "/")
    public String sayHello(){
        return "Hello";
    }

    @PostMapping(value = "/")
    public Test addTest(@RequestBody Test test){
        return testRepository.insert(test);
    }
}
