package com.github.playback.subclass;
import com.github.playback.models.Audio;

public class Music extends Audio {
    private String author;
    private String album;
    private double musicTime;
    private String musicGenre;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public double getMusicTime() {
        return musicTime;
    }

    public void setMusicTime(double musicTime) {
        this.musicTime = musicTime;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }
    public void printMusic(){
        System.out.println("\nTitle : "+ getTitle());
        System.out.println("Total Reproductions: "+ getTotalReproduction());
        System.out.println("Total likes: "+ getTotalLikes());
        System.out.println("Author: "+getAuthor());
        System.out.println("Album: "+getAlbum());
        System.out.println("Music Time: "+getMusicTime() +" minutes");
        System.out.println("Music Genre: "+getMusicGenre());
    }
}
