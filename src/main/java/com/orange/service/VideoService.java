package com.orange.service;

import com.orange.controller.Video;
import com.orange.controller.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by msaidi on 12/17/15.
 */

@Service
public class VideoService {
    private final VideoRepository videoRepository;

    @Autowired
    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public Video saveVideo(final Video video) {
        return this.videoRepository.save(video);
    }

    public Optional<Video> findVideo(final String id) {
        final Video video = this.videoRepository.findOne(id);
        return Optional.ofNullable(video);
    }

}
