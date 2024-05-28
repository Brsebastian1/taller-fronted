package com.taller.fronted.controller;

import com.taller.fronted.repository.VideoImpl;
import com.taller.fronted.service.TallerService;
import com.taller.fronted.service.TallerServiceImpl;
import com.taller.fronted.videos.Video;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class TallerFrontedController {
    private final TallerService tallerService;

    public TallerFrontedController(TallerService tallerService) {
        this.tallerService = tallerService;
    }

    public TallerFrontedController(){
        this.tallerService = new TallerServiceImpl(new VideoImpl());
    }

    @GetMapping()
    public ResponseEntity<List<Video>> findAllVideos() {
        return ResponseEntity.status(HttpStatus.OK).body(tallerService.video());
    }

    @PostMapping
    public Video addVideo(@RequestBody Video video){
        return tallerService.add(video);
    }
}
