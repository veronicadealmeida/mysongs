package br.com.alura.mysongs.models;

public class Audio {
    private string title;
    private int totalPlays;
    private int totalLikes;
    private int rating;

    public string getTitle() {
        return title;
    }

    public void setTitle(string title) {
        this.title = title;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getRating() {
        return rating;
    }

    public void like() {
        this.totalLikes ++;
    }

    public void play(){
        this.totalPlays++;
    }
}
