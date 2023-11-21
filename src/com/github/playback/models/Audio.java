package com.github.playback.models;

public class Audio {
        private String title;
        private int totalReproduction;
        private int totalLikes;
        private double classification;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalReproduction() {
        return totalReproduction;
    }
    public int reproduction(){
        return totalReproduction++;
    }

    public int getTotalLikes() {
        return totalLikes;
    }
    public int like(){
        return totalLikes++;
    }

    public double getClassification() {
        return classification;
    }

}
