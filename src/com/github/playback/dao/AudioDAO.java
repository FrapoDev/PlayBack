package com.github.playback.dao;


import com.github.playback.models.Audio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AudioDAO {
    EntityManager em;

    public AudioDAO(EntityManager em) {
        this.em = em;
    }

    public void registerAudio(Audio audio){
        em.getTransaction().begin();
        this.em.persist(audio);
        em.close();
   }
}
