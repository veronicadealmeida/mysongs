package br.com.alura.mysongs.main;

import br.com.alura.mysongs.models.Music;
import br.com.alura.mysongs.models.MyFavorite;
import br.com.alura.mysongs.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();

        myMusic.setTitle("Forever");
        myMusic.setSinger("Kiss");

        for (int i = 0; i < 1000; i++) {
            myMusic.play();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();

        myPodcast.setTitle("BolhaDev");
        myPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            myPodcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        MyFavorite myFavorite = new MyFavorite();
        myFavorite.addFavorite(myMusic);
        myFavorite.addFavorite(myPodcast);
    }
}