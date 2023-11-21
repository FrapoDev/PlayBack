package com.github.playback.models;

import com.github.playback.subclass.Music;
import com.github.playback.subclass.Podcast;

public class Main {
    public static void main(String[] args) {

        Music music1 = new Music();
        music1.setTitle("Space Cadet (feat. Gunna)");
        music1.setAuthor("Metro Boomin");
        music1.setAlbum("Space Cadet");
        music1.setMusicTime(3.23);
        music1.setMusicGenre("Trap-US");
        for (int i = 0; i < 100 ; i++) {
            music1.reproduction();
        }
        for (int i = 0; i < 50; i++) {
            music1.like();
        }
        music1.printMusic();

        Podcast podcast1 = new Podcast();


    }
}
