package com.github.playback.main;

import com.github.playback.models.Music;
import com.github.playback.models.MyFavorite;
import com.github.playback.models.Podcast;

public class Main {
    public static void main(String[] args) {

        Music music1 = new Music();
        music1.setTitle("Space Cadet (feat. Gunna)");
        music1.setAuthor("Metro Boomin");
        music1.setAlbum("NOT ALL HEROES WEAR CAPES (deluxe)");
        music1.setMusicTime(3.23);
        music1.setMusicGenre("Trap-US");

        for (int i = 0; i < 1890 ; i++) {
            music1.reproduction();
        }
        for (int i = 0; i < 50; i++) {
            music1.like();
        }
        music1.printMusic();

        Podcast podcast1 = new Podcast();
        podcast1.setTitle("Podpah Ep.200");
        podcast1.setHost("Igão e Mitico");
        podcast1.setDescription("Special episode with the MC Hariel.");
        podcast1.setTotalTime(2);
        for (int i = 0; i < 15000; i++) {
            podcast1.reproduction();
        }
        for (int i = 0; i < 1000; i++) {
            podcast1.like();
        }
        podcast1.printPodcast();

        MyFavorite myFavorite = new MyFavorite();
        myFavorite.include(music1);
        myFavorite.include(podcast1);
    }
}
