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
    public int likes(){
        return totalLikes++;
    }

    public double getClassification() {
        return classification;
    }
    public void setClassification(double classification) {
        this.classification = classification;
    }

    public void printAudio(){
        System.out.println("\nTitle : "+ getTitle());
        System.out.println("Total Reproductions: "+ getTotalReproduction());
        System.out.println("Total likes: "+ getTotalLikes());

    }
}