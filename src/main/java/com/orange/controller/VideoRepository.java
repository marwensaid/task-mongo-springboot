package com.orange.controller;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by msaidi on 12/17/15.
 */

@Repository
public interface VideoRepository extends MongoRepository<Video,String> {
}
