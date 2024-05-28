package com.taller.fronted.videos;

public class Video {
    private String title;
    private String description;
    private String id;
    private double duration;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getDuration() {
        return duration;
    }

    public String getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
