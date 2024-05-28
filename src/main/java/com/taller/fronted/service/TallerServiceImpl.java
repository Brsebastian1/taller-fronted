package com.taller.fronted.service;

import com.taller.fronted.repository.VideoImpl;
import com.taller.fronted.repository.VideoInterface;
import com.taller.fronted.videos.Video;

import java.util.List;

public class TallerServiceImpl implements TallerService{

    VideoInterface videoInterface;

    public TallerServiceImpl(VideoInterface videoInterface) {
        this.videoInterface = videoInterface;
    }

    @Override
    public List<Video> video() {
        return videoInterface.find();
    }

    @Override
    public Video add(Video video) {
        videoInterface.add(video);
        return video;
    }
}
