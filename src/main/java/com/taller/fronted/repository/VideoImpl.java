package com.taller.fronted.repository;

import com.taller.fronted.videos.Video;

import java.util.ArrayList;
import java.util.List;

public class VideoImpl implements VideoInterface{

    private final List<Video> videos = new ArrayList<>();
    @Override
    public List<Video> find() {
        return videos;
    }

    @Override
    public Video add(Video video) {
        this.videos.add(video);
        return video;
    }
}
