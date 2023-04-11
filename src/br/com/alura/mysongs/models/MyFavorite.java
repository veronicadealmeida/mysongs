package br.com.alura.mysongs.models;

public class MyFavorite {
    public void addFavorite(Audio audio) {
        if (audio.getClassification() >= 9) {
            System.out.println(audio.getTitle() + " é considerado sucesso absoluto e preferido por todos!");
        } else {
            System.out.println(audio.getTitle() + " também é um dos que todo mundo está curtindo.");
        }
    }
}
