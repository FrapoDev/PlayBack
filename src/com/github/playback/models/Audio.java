package com.github.playback.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Audio {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @EqualsAndHashCode.Include
        private Long id;
        @Column(name = "title_audio", unique = true)
        private String title;
        @Column(name = "total_reproduction")
        private int totalReproduction;
        @Column(name = "total_likes")
        private int totalLikes;
        private double classification;

        public Audio(String title) {this.title = title;}

        public int reproduction(){
                return totalReproduction;
        }

        public int like(){
                return totalLikes;
        }
}
