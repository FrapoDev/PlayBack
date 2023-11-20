package com.github.playback.models;

import com.github.playback.models.Audio;

public class Main {
    public static void main(String[] args) {
        Audio music1 = new Audio();
        music1.setTitle("Space Cadet (feat. Gunna)");
        music1.reproduction();
        music1.reproduction();
        music1.reproduction();
        music1.reproduction();
        music1.likes();
        music1.likes();
        music1.likes();

        music1.printAudio();


    }
}
