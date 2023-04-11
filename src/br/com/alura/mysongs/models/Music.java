package br.com.alura.mysongs.models;

public class Music extends Audio{

    private String album;
    private String singer;
    private String gender;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getClassification() {

        if (this.getTotalPlays() > 2000) {
            return 10;
        } else  {
            return 7;
        }

    }
}
