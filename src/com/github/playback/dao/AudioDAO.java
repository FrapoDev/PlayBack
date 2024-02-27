package com.github.playback.dao;


import com.github.playback.models.Audio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class AudioDAO {
    EntityManager em;

    //
    public AudioDAO(EntityManager em) {
        this.em = em;
    }

    public void registerAudio(Audio audio){
        this.em.persist(audio);
   }

   public List<Audio> listAllAudio(){
        return em.createQuery("FROM Audio").getResultList();
   }

    Audio audio = new Audio();
    private static Audio audioId = new Audio();
   public Audio getAudioId(Long id){
       System.out.println("ID do audio" + id);
       return em.find(Audio.class, id);
   }
}
