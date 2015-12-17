package com.orange;

import com.orange.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstUseMongodbCouchbaseApplication {

    @Autowired
    private VideoService videoService;

    public static void main(String[] args) {
        SpringApplication.run(FirstUseMongodbCouchbaseApplication.class, args);
    }


}
