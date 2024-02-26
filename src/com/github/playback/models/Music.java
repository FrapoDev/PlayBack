package com.github.playback.models;
import com.github.playback.models.Audio;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Music extends Audio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @ManyToOne
    @JoinColumn(name = "audio_id")
    private Audio audio;
    private String author;
    private String album;
    private double musicTime;
    private String musicGenre;

    public void printMusic(){
        System.out.println("\nTitle : "+ getTitle());
        System.out.println("Total Reproductions: "+ getTotalReproduction());
        System.out.println("Total likes: "+ getTotalLikes());
        System.out.println("Author: "+getAuthor());
        System.out.println("Album: "+getAlbum());
        System.out.println("Music Time: "+getMusicTime() +" minutes");
        System.out.println("Music Genre: "+getMusicGenre());
    }

    @Override
    public double getClassification() {
        if ( getTotalReproduction() >= 2000 ){
            return 10;
        } else {
            return 7;
        }
    }
}
