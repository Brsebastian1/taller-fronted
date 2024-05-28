package com.taller.fronted.service;

import com.taller.fronted.videos.Video;

import java.util.List;

public interface TallerService {
    List<Video> video();
    Video add(Video video);
}
