package com.orange;

import com.orange.controller.Video;
import com.orange.service.VideoService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstUseMongodbCouchbaseApplication implements CommandLineRunner {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(FirstUseMongodbCouchbaseApplication.class);
    @Autowired
    private VideoService videoService;

    public static void main(String[] args) {
        SpringApplication.run(FirstUseMongodbCouchbaseApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        Video video = Video.of("video number 2", "Second video title xx");
        LOGGER.info("saving {}", video);
        Video videoSaved = videoService.saveVideo(video);
        LOGGER.info("videoSaved {}", videoSaved);
    }
}
