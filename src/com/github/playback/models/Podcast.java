package com.github.playback.models;

import com.github.playback.models.Audio;


public class Podcast extends Audio{
    private String host;
    private String description;
    private int totalTime;

    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public void printPodcast(){
        System.out.println("\nTitle : "+ getTitle());
        System.out.println("Total Reproductions: "+ getTotalReproduction());
        System.out.println("Total likes: "+ getTotalLikes());
        System.out.println("Podcast Host: "+getHost());
        System.out.println("Podcast description: "+getDescription());
        System.out.println("Total Podcast time: "+getTotalTime()+" hours");
    }

    @Override
    public double getClassification() {
        if ( getTotalLikes() >= 1000 ){
            return 10;
        } else {
            return 7;
        }
    }
}
