package com.github.playback.models;

public class MyFavorite {
    public void include(Audio audio){
        if (audio.getClassification() >= 9){
            System.out.println("\n"+audio.getTitle() + " is among the best classification.");
        } else {
            System.out.println("\n"+audio.getTitle() + " good to listen to later.");
        }
    }
}
