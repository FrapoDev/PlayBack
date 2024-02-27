package com.github.playback.dao;

import com.github.playback.models.Music;
import jakarta.persistence.EntityManager;

import java.util.List;

public class MusicDAO {
    EntityManager em;

    public MusicDAO(EntityManager em) {
        this.em = em;
    }

    public void registerMusic(Music music){
        this.em.persist(music);
    }

    public List<Music> listAllMusic(){
        return em.createQuery("FROM Music").getResultList();
    }


}
