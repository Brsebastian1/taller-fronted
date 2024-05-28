package com.taller.fronted.repository;

import com.taller.fronted.videos.Video;

import java.util.List;

public interface VideoInterface {
    List<Video> find();
    Video add(Video video);
}
