package com.github.playback.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Audio {
        private String title;
        private int totalReproduction;
        private int totalLikes;
        private double classification;

        public int reproduction(){
                return totalReproduction;
        }

        public int like(){
                return totalLikes;
        }
}
