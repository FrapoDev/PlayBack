package com.github.playback.models;

import com.github.playback.models.Audio;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Podcast")
@Getter
@Setter
@NoArgsConstructor
public class Podcast extends Audio{
    @ManyToOne
    @JoinColumn(name = "audio_id")
    private Audio audio;
    private String host;
    private String description;
    private int totalTime;

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
